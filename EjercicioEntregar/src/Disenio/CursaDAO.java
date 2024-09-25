package Disenio;

import java.util.List;

import javax.persistence.EntityManager;

public class CursaDAO extends DAOAbstracto<Cursa, Long> {

    public CursaDAO(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
	public Class<Cursa> getEntityClass() {
        return Cursa.class;
    }

    // Métodos específicos para Curso
    public List<Cursa> findCursosByProfesor(String profesor) {
        return entityManager.createQuery("SELECT c FROM Curso c WHERE c.profesor = :profesor", Cursa.class)
                            .setParameter("profesor", profesor)
                            .getResultList();
    }
    
    public List<Object[]> findCarrerasConInscriptos() {
        return entityManager.createQuery(
            "SELECT c, COUNT(cu.carrera.idCarrera) " +
            "FROM Cursa cu " +
            "JOIN Carrera c ON cu.carrera.idCarrera = c.idCarrera " +
            "GROUP BY cu.carrera.idCarrera " +
            "ORDER BY COUNT(cu) DESC", Object[].class)
            .getResultList();
    }
    
    public List<Object[]> findEstudianteCarreraYCiudad(String nombreCarrera, String ciudad) {
        return entityManager.createQuery(
            "SELECT e, ca.nombre " +
            "FROM Cursa c " +
            "JOIN c.estudiante e " +
            "JOIN c.carrera ca " +
            "WHERE ca.nombre = :nombreCarrera AND e.ciudadResidencia = :ciudad", Object[].class)
            .setParameter("nombreCarrera", nombreCarrera)
            .setParameter("ciudad", ciudad)
            .getResultList();
    }
    
    public List<Object[]> findCarrerasConInscriptosYegresados() {
        return entityManager.createQuery(
            "SELECT " +
                "ca.nombre, " +
                "YEAR(cu.fechaInscripcion), " +
                "COUNT(cu.estudiante.dni), " +
                "COUNT(CASE WHEN cu.egresado = TRUE THEN 1 END) " +
            "FROM Carrera ca " +
            "LEFT JOIN Cursa cu ON ca.idCarrera = cu.carrera.idCarrera " +
            "GROUP BY ca.nombre, YEAR(cu.fechaInscripcion) " +
            "ORDER BY ca.nombre ASC, YEAR(cu.fechaInscripcion) ASC", 
            Object[].class
        ).getResultList();
    }
    
}
