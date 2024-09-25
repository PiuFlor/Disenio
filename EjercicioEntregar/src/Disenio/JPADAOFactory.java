package Disenio;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPADAOFactory implements DAOFactory {

	// Singleton: única instancia
    private static JPADAOFactory instance;
    private EntityManager entityManager;

    private JPADAOFactory() {
        entityManager = Persistence.createEntityManagerFactory("BasedeDatos").createEntityManager();
    }

    @Override
    public EstudianteDAO createEstudianteDAO() {
        return new EstudianteDAO(entityManager);
    }

    @Override
    public CarreraDAO createCarreraDAO() {
        return new CarreraDAO(entityManager);
    }

    @Override
    public CursaDAO createCursoDAO() {
        return new CursaDAO(entityManager);
    }
    
    // Obtener la única instancia (Singleton)
    public static JPADAOFactory getInstance() {
        if (instance == null) {
            instance = new JPADAOFactory();
        }
        return instance;
    }
}

