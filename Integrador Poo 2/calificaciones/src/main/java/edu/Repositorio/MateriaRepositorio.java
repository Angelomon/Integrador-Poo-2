import edu.Modelo.*;

public interface MateriaRepositorio {
    void agregar(Materia materia) throws RepositorioExcepcion;

    List<Materia> listar();
}