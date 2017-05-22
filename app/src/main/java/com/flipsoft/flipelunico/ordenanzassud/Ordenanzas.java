package com.flipsoft.flipelunico.ordenanzassud;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by flipelunico on 19-05-17.
 */

public class Ordenanzas {

    public static final String[] NombreOrdenanzas = {
            "La unción con aceite", "Bautismo", "La bendicion de los enfermos, de consuelo y consejo",
            "Sellamiento de la uncion", "Confirmacion"

    };

    /**
     * Genera una lista de objetos {@link Ordenanza} con un tamaño determinado
     *
     * @param count Tamaño
     * @return Lista aleatoria
     */
    public static List<Ordenanza> randomList(int count) {
        Random random = new Random();
        List<Ordenanza> items = new ArrayList<>();

        // Restricción de tamaño
        count = Math.min(count, NombreOrdenanzas.length);

        for (String i: NombreOrdenanzas) {
            items.add(new Ordenanza(i));
        }

        return new ArrayList<>(items);
    }
}
