package Disenio;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.persistence.EntityManager;

public class EstudianteDAO extends DAOAbstracto<Estudiante, Integer> {

	public EstudianteDAO(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public Class<Estudiante> getEntityClass() {
		 return Estudiante.class;
	}
	
	 // Métodos específicos para Estudiante
	// UNO DE LOS METODOS A IMPLEMENTAR
    public List<Estudiante> findByGenero(boolean genero) {
        return entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.genero = :genero ORDER BY e.dni", Estudiante.class)
                            .setParameter("genero", genero)
                            .getResultList();
    }
    
    public Estudiante findByLibretaUniversitaria(int libretaUniversitaria) {
        return entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.libretaUniversitaria = :libretaUniversitaria", Estudiante.class)
                            .setParameter("libretaUniversitaria", libretaUniversitaria )
                            .getSingleResult();
    }
	
}
