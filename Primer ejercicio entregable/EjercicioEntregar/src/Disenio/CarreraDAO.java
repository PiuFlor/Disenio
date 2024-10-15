package Disenio;

import java.util.List;

import javax.persistence.EntityManager;

public class CarreraDAO extends DAOAbstracto<Carrera, Integer> implements CarreraDAOinter{

    public CarreraDAO(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
	public Class<Carrera> getEntityClass() {
        return Carrera.class;
    }

    @Override
    public List<Carrera> findCarrerasByNombre(String nombre) {
        return entityManager.createQuery("SELECT c FROM Carrera c WHERE c.nombre = :nombre", Carrera.class)
                            .setParameter("nombre", nombre)
                            .getResultList();
    }
   
}
