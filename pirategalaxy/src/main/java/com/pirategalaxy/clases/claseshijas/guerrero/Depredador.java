package com.pirategalaxy.clases.claseshijas.guerrero;

import com.pirategalaxy.clases.Guerrero;

public class Depredador extends Guerrero {

    public Depredador(String nombre, String tipo, int fuerza, int resistencia) {
        super(nombre, tipo, fuerza, resistencia);
    }

    @Override
    public String toString() {
        return "Depredador []";
    }

}
