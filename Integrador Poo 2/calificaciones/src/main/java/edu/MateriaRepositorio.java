package edu;

import java.util.List;
import edu.Modelo.*;

public interface MateriaRepositorio {
    void agregar(Materia materia);

    List<Materia> listar();

    int crear(Materia materia);

    boolean borrar(Materia materia);

    boolean modificar(Materia materia);

    Materia obtener(int id);
}