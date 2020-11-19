package edu.controladores;

import java.sql.SQLException;
import java.util.*;

import edu.Paginas.ModeloMaterias;
import edu.Paginas.ModeloMateria;
import edu.Modelo.Materia;
import edu.MateriaRepositorio;
import edu.RepositorioExcepcion;
import io.javalin.http.Context;

public class MateriasControlador {
    private final edu.MateriaRepositorio MateriaRepositorio;

    public MateriasControlador(MateriaRepositorio materiaRepositorio) {
        this.MateriaRepositorio = materiaRepositorio;

    }

    public void listar(Context ctx) throws SQLException {
        var modelo = new ModeloMaterias();
        modelo.materias = MateriaRepositorio.listar();
        // ctx.render("materias.jte");
        ctx.render("materias.jte", Collections.singletonMap("modelo", modelo));
    }
    /*
     * public void nuevo(Context ctx) throws SQLException {
     * ctx.render("crearMateria.jte", Collections.singletonMap("modelo", null)); }
     * 
     * public void crear(Context ctx) throws SQLException { var materia = new
     * Materia(ctx.formParam("nombre", String.class).get());
     * this.MateriaRepositorio.crear(materia); ctx.redirect("/materias"); }
     */
}
