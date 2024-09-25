package Disenio;

public abstract interface DAOFactory {
    
    public abstract EstudianteDAO createEstudianteDAO();
    public abstract CarreraDAO createCarreraDAO();
    public abstract CursaDAO createCursoDAO();
/*
    public static DAOFactory getFactory() {
        // Aquí puedes retornar la fábrica concreta según lo que necesites (JPA, JDBC, etc.)
        return new JPADAOFactory();
    }*/
}
