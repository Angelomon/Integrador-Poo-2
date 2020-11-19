package edu;

import io.javalin.*;

import java.util.*;

import edu.Modelo.*;
import edu.Paginas.*;
import edu.controladores.*;

import org.sql2o.Sql2o;
import edu.Sql2oCalificacionRepositorio;
import edu.CalificacionRepositorio;
import edu.MateriaRepositorio;
import edu.RepositorioExcepcion;
import edu.Sql2oMateriaRepositorio;

public class App {
    public static void main(String[] args) {
        var sql2o = new Sql2o("jdbc:postgresql://localhost:5433/CalificacionesDB", "postgresql", "1234");
        var materiaRepositorio = new Sql2oMateriaRepositorio(sql2o);
        var materiaControlador = new MateriasControlador(materiaRepositorio);
        var CalificacionRepositorio = new Sql2oCalificacionRepositorio(sql2o);

        Javalin app = Javalin.create().exception(RepositorioExcepcion.class, (e, ctx) -> {
            ctx.status(404);
        }).start(7000);
        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/materias", materiaControlador::listar);
        // app.get("/materias", MateriasControlador::listar;

    }

}
