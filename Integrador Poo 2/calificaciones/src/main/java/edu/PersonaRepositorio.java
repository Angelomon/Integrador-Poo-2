package edu;

import java.util.List;
import edu.Modelo.*;

public interface PersonaRepositorio {
    void agregar(Persona alumno);

    List<Persona> listar();
}
