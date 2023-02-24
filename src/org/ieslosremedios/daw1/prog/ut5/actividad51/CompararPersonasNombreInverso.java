package org.ieslosremedios.daw1.prog.ut5.actividad51;
import java.util.*;
public class CompararPersonasNombreInverso implements Comparator<Persona> {


    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.compareTo(o2);
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
