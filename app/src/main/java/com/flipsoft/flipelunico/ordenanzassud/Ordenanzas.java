package com.flipsoft.flipelunico.ordenanzassud;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by flipelunico on 19-05-17.
 */

public class Ordenanzas {

    /**
     * Genera una lista de objetos {@link Ordenanza} con un tamaño determinado
     *
     * @param count Tamaño
     * @return Lista aleatoria
     */
    public static List<Ordenanza> randomList(int count) {

        List<Ordenanza> items = new ArrayList<>();


        items.add(new Ordenanza("Bautismo","_________ (nombre completo de la persona), habiendo sido comisionado por Jesucristo, yo te bautizo en el nombre del Padre, y del Hijo, y del Espíritu Santo. Amén."));


        return new ArrayList<>(items);
    }
}
