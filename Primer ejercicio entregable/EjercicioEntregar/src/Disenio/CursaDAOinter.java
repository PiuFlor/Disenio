package Disenio;

import java.util.List;

public interface CursaDAOinter extends DAOGenerico<Cursa, CursaId> {
    List<Object[]> findCarrerasConInscriptos();
    List<Object[]> findEstudianteCarreraYCiudad(String nombreCarrera, String ciudad);
    List<Object[]> findCarrerasConInscriptosYegresados();
}
