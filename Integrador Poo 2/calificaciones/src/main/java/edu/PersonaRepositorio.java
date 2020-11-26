package edu;

import java.util.List;
import edu.Modelo.*;

public interface PersonaRepositorio {
    void agregar(Persona alumno) throws RepositorioExcepcion;

    List<Persona> listar() throws RepositorioExcepcion;

    Persona obtener(int id) throws RepositorioExcepcion;
}
