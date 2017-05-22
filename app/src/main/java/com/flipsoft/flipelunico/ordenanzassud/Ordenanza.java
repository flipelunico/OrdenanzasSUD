package com.flipsoft.flipelunico.ordenanzassud;

import java.util.Random;

/**
 * Created by flipelunico on 19-05-17.
 */

public class Ordenanza {

    private String name;
    private String detalle;
    private int idDrawable;


    public Ordenanza(String name, int idDrawable) {
        this.name = name;
        this.idDrawable = idDrawable;
    }

    public Ordenanza(String name) {
        this.name = name;
        this.idDrawable = getRandomGirlDrawable();
    }

    public String getName() {
        return name;
    }

    public String getDetalle() {return detalle;}

    public int getIdDrawable() {
        return idDrawable;
    }

    /**
     * Asigna un drawable en forma aleatoria
     *
     * @return id del drawable
     */
    private int getRandomGirlDrawable() {
        Random rnd = new Random();
        switch (rnd.nextInt(8)) {
            default:
            case 0:
                return R.drawable.ordenanza1;
            case 1:
                return R.drawable.ordenanza1;
            case 2:
                return R.drawable.ordenanza1;
            case 3:
                return R.drawable.ordenanza1;
            case 4:
                return R.drawable.ordenanza1;
            case 5:
                return R.drawable.ordenanza1;
            case 6:
                return R.drawable.ordenanza1;
            case 7:
                return R.drawable.ordenanza1;
        }
    }
}
