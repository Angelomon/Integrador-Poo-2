package edu;

import java.util.List;

import edu.Modelo.*;

public interface CalificacionRepositorio {
    List<Calificacion> listarPorMateriaId(int id) throws RepositorioExcepcion;

    int crear(Calificacion calificacion) throws RepositorioExcepcion;

    boolean borrar(Calificacion calificacion) throws RepositorioExcepcion;
}
