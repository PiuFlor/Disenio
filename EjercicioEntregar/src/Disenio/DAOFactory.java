package Disenio;

public abstract interface DAOFactory {
    
    public abstract EstudianteDAO createEstudianteDAO();
    public abstract CarreraDAO createCarreraDAO();
    public abstract CursaDAO createCursoDAO();
    /*
    public static DAOFactory getFactory() {
        // Aqu� puedes retornar la f�brica concreta seg�n lo que necesites (JPA, JDBC, etc.)
        return new JPADAOFactory();
    }*/
}
