package Disenio;

import java.util.List;

import javax.persistence.EntityManager;

public class CarreraDAO extends DAOAbstracto<Carrera, Integer> {

    public CarreraDAO(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
	public Class<Carrera> getEntityClass() {
        return Carrera.class;
    }

    // M�todos espec�ficos para Carrera
    public List<Carrera> findCarrerasByNombre(String nombre) {
        return entityManager.createQuery("SELECT c FROM Carrera c WHERE c.nombre = :nombre", Carrera.class)
                            .setParameter("nombre", nombre)
                            .getResultList();
    }
    
    
}