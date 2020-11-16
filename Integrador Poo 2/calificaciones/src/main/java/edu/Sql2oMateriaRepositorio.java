package edu;

import java.util.ArrayList;
import java.util.List;
import edu.Modelo.*;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

public class Sql2oMateriaRepositorio implements MateriaRepositorio {
    // var sql2o = new Sql2o("jdbc:postgresql://localhost:PUERTO/DB", "USUARIO",
    // "CLAVE");
    private final Sql2o sql2o;

    public Sql2oMateriaRepositorio(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void agregar(Materia materia) {

    }

    @Override
    public List<Materia> listar() throws RepositorioExcepcion {
        try (Connection conn = sql2o.open()) {
            String sql = "SELECT * FROM Materias;";
            return conn.createQuery(sql).throwOnMappingFailure(false).executeAndFetch(Materia.class);

        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

    @Override
    public Materia obtener(int id) throws RepositorioExcepcion {
        try (Connection conn = sql2o.open()) {
            String sql = "SELECT * FROM Materia WHERE id = :id;";
            return conn.createQuery(sql).addParameter("id", id).throwOnMappingFailure(false)
                    .executeAndFetchFirst(Materia.class);
        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

    @Override
    public int crear(Materia materia) throws RepositorioExcepcion {
        try (Connection conn = sql2o.open()) {
            String sql = "INSERT INTO Materia (nombre) VALUES (:nombre);";
            return (int) conn.createQuery(sql).bind(materia).executeUpdate().getKey();
        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

    @Override
    public boolean borrar(Materia materia) throws RepositorioExcepcion {
        try (Connection conn = sql2o.open()) {
            String sql = "DELETE FROM Materia WHERE id = :id;";
            int filas = (int) conn.createQuery(sql).addParameter("id", materia.getId()).executeUpdate().getResult();
            return filas > 0;
        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

    @Override
    public boolean modificar(Materia materia) throws RepositorioExcepcion {
        return false;
    }
}
