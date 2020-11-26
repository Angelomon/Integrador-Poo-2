package edu;

import java.util.List;
import edu.Modelo.*;

public interface MateriaRepositorio {
    void agregar(Materia materia);

    List<Materia> listar() throws RepositorioExcepcion;

    int crear(Materia materia) throws RepositorioExcepcion;

    boolean borrar(Materia materia) throws RepositorioExcepcion;

    boolean modificar(Materia materia) throws RepositorioExcepcion;

    Materia obtener(int id) throws RepositorioExcepcion;
}