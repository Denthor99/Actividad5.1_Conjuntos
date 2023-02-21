package org.ieslosremedios.daw1.prog.ut5.actividad51;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Persona fer=new Persona("roberto",19);
        Persona paco=new Persona("Francisco",32);
        Persona pablo=new Persona("Pablo",17);
        TreeSet<Persona> personas=new TreeSet<>();
        personas.add(paco);
        personas.add(fer);
        personas.add(pablo);
        Iterator<Persona> it=personas.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
