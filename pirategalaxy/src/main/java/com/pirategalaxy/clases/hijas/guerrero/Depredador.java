package com.pirategalaxy.clases.hijas.guerrero;

import com.pirategalaxy.clases.Guerrero;

public class Depredador extends Guerrero {
    
    public Depredador(String nombre, String tipo, int fuerza, int resistencia) {
        super(nombre, tipo, fuerza, resistencia);
    }

    @Override
    public int atacar() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int defender(int puntosDefensa) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return "Depredador []";
    }

}
