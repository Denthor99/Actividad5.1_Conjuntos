package org.ieslosremedios.daw1.prog.ut5.actividad51;

public class Persona {
    String nombre;
    Integer edad;

    Persona(){}

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        String persona=this.nombre+","+this.edad;
        return persona;
    }
}
