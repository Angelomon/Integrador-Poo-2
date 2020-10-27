package edu.Modelo;
public class Persona {
    private String nombre;
    private String apellido;
    private int DNI;
    
    public Persona(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public Persona(String nombre, String apellido, int dNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        DNI = dNI;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + DNI;
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Persona other = (Persona) obj;
        if (DNI != other.DNI)
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    


    
}