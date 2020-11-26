package edu;

import java.util.List;
import edu.Modelo.*;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

public class Sql2oPersonaRepositorio implements PersonaRepositorio {

    private final Sql2o sql2o;

    public Sql2oPersonaRepositorio(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void agregar(Persona alumno) {
        try (Connection conn = sql2o.open()) {
            String sql = "INSERT INTO Persona (dni,nombre,apellido) VALUES (:dni, :nombre, :apellido);";
            return;
        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }

    }

    @Override
    public List<Persona> listar() {
        try (Connection conn = sql2o.open()) {
            String sql = "SELECT * FROM Persona;";
            return conn.createQuery(sql).throwOnMappingFailure(false).executeAndFetch(Persona.class);

        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

    @Override
    public Persona obtener(int id) {
        try (Connection conn = sql2o.open()) {
            String sql = "SELECT * FROM Persona where id = :id;";
            return (Persona) conn.createQuery(sql).throwOnMappingFailure(false).executeAndFetch(Persona.class);

        } catch (Sql2oException e) {
            throw new RepositorioExcepcion();
        }
    }

}
