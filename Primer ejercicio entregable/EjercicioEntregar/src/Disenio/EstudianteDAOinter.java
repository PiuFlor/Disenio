package Disenio;

import java.util.List;

public interface EstudianteDAOinter extends DAOGenerico<Estudiante, Integer>{
    List<Estudiante> findByGenero(boolean genero);
    Estudiante findByLibretaUniversitaria(int libretaUniversitaria);
}
