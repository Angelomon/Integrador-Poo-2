package edu;
import edu.Modelo.Calificacion;
import edu.Modelo.Persona;
import edu.Modelo.Materia;;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var curso = new Materia("Poo1");
        var alumno = new Persona(41303618,"Ruben","Viera");
        var alumno2 = new Persona(41300567,"Facundo","Pereira");
        //var nota = new Calificacion();

        var nota1= new Calificacion(10,curso,alumno);
        var nota2= new Calificacion(8,curso,alumno2);

        System.out.println(curso);
        System.out.println(alumno);
        System.out.println(curso.getCalificaciones());
        

    }
}
