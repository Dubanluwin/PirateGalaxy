package com.pirategalaxy.clases.claseshijas.guerreros;

import com.pirategalaxy.clases.clasespadres.Guerrero;

public class Mantis extends Guerrero {

    public Mantis(String nombre, String tipo, int fuerza, int resistencia) {
        super(nombre, tipo, fuerza, resistencia);
    }

    @Override
    public int apoyoAtaque() {
        // TODO Auto-generated method stub
        return super.apoyoAtaque();
    }

    @Override
    public int apoyoDefensa() {
        // TODO Auto-generated method stub
        return super.apoyoDefensa();
    }

    @Override
    public String toString() {
        return "\nEl guerrero " + nombre + ", es de tipo: " + tipo + ", con fuerza de: " + fuerza + " y resistencia: "
                + resistencia + ".";

    }

}
