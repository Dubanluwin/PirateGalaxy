package com.pirategalaxy.clases.claseshijas.vehiculoguerra;

import java.util.List;

import com.pirategalaxy.clases.Guerrero;
import com.pirategalaxy.clases.VehiculoGuerra;

public class Tanque extends VehiculoGuerra {

    public Tanque(int puntosVida, int ataque, int defensa, String nombre, String tipo, List<Guerrero> listaGuerreros) {
        super(puntosVida, ataque, defensa, nombre, tipo, listaGuerreros);
    }

    @Override
    public int atacar(listaGuerreros guerreros) {

        int ataqueTanque = 0;

        // atacar(): devuelve un valor calculado con la fórmula del diagrama (p. ej.
        // ataque base + suma del ataque de los guerreros).

        for (Guerrero a : listaGuerreros) {
                
        }



        this.getAtaque() + (Math.random() *10) + 


        return ataqueTanque;
    }

    @Override
    public int defender(int puntosDefensa) {

        //  defender(): devuelve un valor calculado con la fórmula del diagrama (p. ej.
        // defensa base + suma de la defensa de los guerreros). Con el valor devuelto
        // por el método defender se quitarán los puntos de vida de la nave

        return 0;
    }

    @Override
    public String toString() {
        return "Tanque []";
    }

    // atacar(): devuelve un valor calculado con la fórmula del diagrama (p. ej.
    // ataque base + suma del ataque de los guerreros).

}
