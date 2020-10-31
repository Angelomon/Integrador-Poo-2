package edu.Modelo;

public class Calificacion{
    private int Calificacion;
    private Materia Materia;
    private Persona Alumno;

    
    
    public Calificacion(){

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

    public Calificacion(int calificacion, Materia materia, Persona alumno) {
        this.Calificacion = calificacion;
        this.Materia = materia;
        this.Alumno = alumno;
        this.Materia.agregarCalificacion(this);
    }

    

    


    @Override
    public String toString() {
        return  Alumno + " " + Calificacion + " " + Materia ;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int calificacion) {
        Calificacion = calificacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Alumno == null) ? 0 : Alumno.hashCode());
        result = prime * result + Calificacion;
        result = prime * result + ((Materia == null) ? 0 : Materia.hashCode());
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
        return true;
    }

}