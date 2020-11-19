package edu.controladores;

import java.sql.SQLException;

import edu.CalificacionRepositorio;
import edu.MateriaRepositorio;
import edu.Paginas.ModeloCalificacion;
import edu.Paginas.ModeloCalificaciones;
import edu.MateriaRepositorio;
import edu.CalificacionRepositorio;
import edu.Modelo.Calificacion;
import io.javalin.*;
import io.javalin.http.*;
import java.util.Collections;

public class CalificacionesControlador {
    private final CalificacionRepositorio calificacionesRepositorio;
    private final MateriaRepositorio materiaRepositorio;

    public CalificacionesControlador(CalificacionRepositorio calificacionRepositorio,
            MateriaRepositorio materiaRepositorio) {
        this.calificacionesRepositorio = calificacionRepositorio;
        this.materiaRepositorio = materiaRepositorio;
    }

    public void listarPorCursoId(Context ctx) throws SQLException {
        var materiaId = ctx.pathParam("id", Integer.class).get();
        var modelo = new ModeloCalificaciones();
        modelo.MateriaId = materiaId;
        modelo.calificaciones = calificacionesRepositorio.listarPorMateriaId(materiaId);
        ctx.render("calificaciones.jte", Collections.singletonMap("modelo", modelo));
    }
}
