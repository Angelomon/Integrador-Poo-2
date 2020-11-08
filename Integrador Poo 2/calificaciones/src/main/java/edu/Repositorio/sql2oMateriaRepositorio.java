import edu.Modelo.*;

public class Sql2oMateriaRepositorio implements MateriaRepositorio {

    private final Sql2o sql2o;

    public Sql2oMateriaRepositorio(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void agregar(Materia materiao) throws RepositorioExcepcion {

    }

    @Override
    public List<Materia> listar() {
        return null;
    }
}