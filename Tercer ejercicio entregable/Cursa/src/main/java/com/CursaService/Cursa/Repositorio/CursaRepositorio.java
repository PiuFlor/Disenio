package com.CursaService.Cursa.Repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.CursaService.Cursa.Modelo.Cursa;
import com.CursaService.Cursa.Modelo.CursaId;

import java.util.List;

@Repository
public interface CursaRepositorio extends JpaRepository<Cursa, CursaId> {
    List<Cursa> findByEgresado(boolean egresado); // Filtra los registros donde egresado es true
    List<Cursa> findByIdIdCarreraAndEgresado(int idCarrera, boolean egresado);
}

