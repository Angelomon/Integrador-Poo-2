package edu.Modelo;
import java.util.ArrayList;
import java.util.List;
public class Calificacion{
    private int Calificacion;
    private Materia Materia;
    private Persona Alumno;

    private List<Calificacion> calificaciones = new ArrayList<>();
    
    public Calificacion(){

    }
    public void agregarCalificacion(Calificacion calificacion){
        this.calificaciones.add(calificacion);
    }
    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int calificacion) {
        Calificacion = calificacion;
    }

    public Materia getMateria() {
        return Materia;
    }

    public void setMateria(Materia materia) {
        Materia = materia;
    }

    public Persona getAlumno() {
        return Alumno;
    }

    public void setAlumno(Persona alumno) {
        Alumno = alumno;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Calificacion(int calificacion, edu.Modelo.Materia materia, Persona alumno,
            List<Calificacion> calificaciones) {
        Calificacion = calificacion;
        Materia = materia;
        Alumno = alumno;
        this.calificaciones = calificaciones;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Alumno == null) ? 0 : Alumno.hashCode());
        result = prime * result + Calificacion;
        result = prime * result + ((Materia == null) ? 0 : Materia.hashCode());
        result = prime * result + ((calificaciones == null) ? 0 : calificaciones.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Calificacion other = (Calificacion) obj;
        if (Alumno == null) {
            if (other.Alumno != null)
                return false;
        } else if (!Alumno.equals(other.Alumno))
            return false;
        if (Calificacion != other.Calificacion)
            return false;
        if (Materia == null) {
            if (other.Materia != null)
                return false;
        } else if (!Materia.equals(other.Materia))
            return false;
        if (calificaciones == null) {
            if (other.calificaciones != null)
                return false;
        } else if (!calificaciones.equals(other.calificaciones))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Calificacion [Alumno=" + Alumno + ", Calificacion=" + Calificacion + ", Materia=" + Materia
                + ", calificaciones=" + calificaciones + "]";
    }
    
}