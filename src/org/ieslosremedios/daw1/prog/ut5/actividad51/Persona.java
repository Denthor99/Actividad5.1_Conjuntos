package org.ieslosremedios.daw1.prog.ut5.actividad51;

import java.util.Objects;

public class Persona implements Comparable{
    String nombre;
    Integer edad;

    Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public int compareTo(Object o){
        Persona otro=(Persona)o;
        if(this.edad==otro.edad){
            return 0;
        }
        if(this.edad<otro.edad){
            return 1;
        }
        return -1;
    }

}
