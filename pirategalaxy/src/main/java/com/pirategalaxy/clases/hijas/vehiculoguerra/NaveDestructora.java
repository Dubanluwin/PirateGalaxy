package com.pirategalaxy.clases.hijas.vehiculoguerra;

import java.util.List;

import com.pirategalaxy.clases.Guerrero;
import com.pirategalaxy.clases.VehiculoGuerra;

public class NaveDestructora extends VehiculoGuerra {

    public NaveDestructora(int puntosVida, int ataque, int defensa, String nombre, List<Guerrero> listaGuerreros) {
        super(puntosVida, ataque, defensa, nombre, listaGuerreros);
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
        return "NaveDestructora []";
    }

}
