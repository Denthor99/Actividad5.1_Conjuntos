package org.ieslosremedios.daw1.prog.ut5.actividad51;

import java.util.*;

public class Actividad51Main {
    public static void main(String[] args) {

        //1. no valores nulos ni duplicados
        //2. ordenado por nombre, no por insercion
        Persona fer=new Persona("roberto",19);
        Persona paco=new Persona("Francisco",32);
        Persona pablo=new Persona("Pablo",17);
        Persona rober=new Persona("Roberto",20);
        TreeSet<Persona> personas=new TreeSet<>(new CompararPersonasNombreInverso().reversed());
        personas.add(paco);
        personas.add(fer);
        personas.add(rober);
        personas.add(pablo);
        System.out.println(personas);
    }
}