package edu;

import io.javalin.*;
import edu.Modelo.*;
import org.sql2o.Sql2o;
import edu.Sql2oCalificacionRepositorio;
import edu.CalificacionRepositorio;
import edu.MateriaRepositorio;
import edu.RepositorioExcepcion;
import edu.Sql2oMateriaRepositorio;

public class App {
    public static void main(String[] args) {
        var sql2o = new Sql2o("jdbc:postgresql://localhost:5432/CalificacionesDB", "postgresql", "1234");
        var MateriaRepositorio = new Sql2oMateriaRepositorio(sql2o);
        // var MateriaControlador = new CursosControlador(cursosRepositorio);
        var CalificacionRepositorio = new Sql2oCalificacionRepositorio(sql2o);
        // var revisionesControlador = new RevisionesControlador(revisionesRepositorio,
        // cursosRepositorio);
    }
}
