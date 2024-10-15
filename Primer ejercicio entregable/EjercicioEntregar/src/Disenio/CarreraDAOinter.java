package Disenio;

import java.util.List;

public interface CarreraDAOinter extends DAOGenerico<Carrera, Integer>{
    List<Carrera> findCarrerasByNombre(String nombre);
}
