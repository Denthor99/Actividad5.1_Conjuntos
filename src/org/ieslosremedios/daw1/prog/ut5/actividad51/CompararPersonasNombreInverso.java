package org.ieslosremedios.daw1.prog.ut5.actividad51;
import java.util.*;
public class CompararPersonasNombreInverso implements Comparator<Persona> {


    @Override
    public int compare(Persona o1, Persona o2) {
        if(o1.nombre.compareToIgnoreCase(o2.nombre)==0){
            if(o1.edad==o2.edad){
                return 0;
            }
            if(o1.edad<o2.edad){
                return 1;
            }
            return -1;
        }
        return o1.nombre.compareToIgnoreCase(o2.nombre);
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
