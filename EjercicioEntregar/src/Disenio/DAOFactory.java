package Disenio;

public abstract interface DAOFactory {
    
    public abstract EstudianteDAO createEstudianteDAO();
    public abstract CarreraDAO createCarreraDAO();
    public abstract CursaDAO createCursoDAO();

    
}
