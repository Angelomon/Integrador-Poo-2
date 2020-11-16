package edu;

import edu.Modelo.*;
import java.util.List;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

public class Sql2oCalificacionRepositorio implements CalificacionRepositorio {
    private final Sql2o sql2o;

    public Sql2oCalificacionRepositorio(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public List<Calificacion> listarPorMateriaId(int id) throws RepositorioExcepcion {
        try (Connection conn = sql2o.open()) {
            String sql = "SELECT * FROM Calificaciones;";
            return conn.createQuery(sql).throwOnMappingFailure(false).executeAndFetch(Calificacion.class);
        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

    @Override
    public int crear(Calificacion calificacion) throws RepositorioExcepcion {
        try (Connection conn = sql2o.open()) {
            String sql = "INSERT INTO Calificaciones (calificacion, materia, persona) VALUES (:calificacion, :materia, :persona);";
            return (int) conn.createQuery(sql).bind(calificacion)
                    .addParameter("materiaID", calificacion.getMateria().getId()).executeUpdate().getKey();
        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

    @Override
    public boolean borrar(Calificacion calificacion) throws RepositorioExcepcion {
        return false;
    }
}
