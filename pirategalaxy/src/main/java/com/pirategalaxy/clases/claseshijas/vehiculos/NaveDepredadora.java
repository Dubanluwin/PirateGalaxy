package com.pirategalaxy.clases.claseshijas.vehiculos;

import java.util.List;

import com.pirategalaxy.clases.clasespadres.Guerrero;
import com.pirategalaxy.clases.clasespadres.VehiculoGuerra;

public class NaveDepredadora extends VehiculoGuerra {

    public NaveDepredadora(int puntosVida, int ataque, int defensa, String nombre, String tipo,
            List<Guerrero> listaGuerreros) {
        super(puntosVida, ataque, defensa, nombre, tipo, listaGuerreros);
    }

    @Override
    public int atacar() {
        // TODO Auto-generated method stub
        // atacar(): similar a Tanque, pero con su propia lógica de ataque (p. ej.
        // ataque base + bonificación de guerreros).

        int danhoTotal = ataque;
        for (Guerrero guerrero : listaGuerreros) {
            danhoTotal += guerrero.apoyoAtaque(); // Los guerreros suman al ataque
        }
        System.out.println(this.nombre + " realiza un ataque con daño total: " + danhoTotal);
        return danhoTotal;

    }

    @Override
    public int defender(int danho) {

        // defender(): lógica de defensa particular.

        int defensaTotal = defensa;
        for (Guerrero guerrero : listaGuerreros) {
            defensaTotal += guerrero.apoyoDefensa(); // Los guerreros suman a la defensa
        }
        int danioRecibido = Math.max(0, danho - defensaTotal); // Si el daño es menor que la defensa, no se recibe daño
        puntosVida -= danioRecibido;
        System.out.println(this.nombre + " recibe " + danioRecibido + " de daño, vida restante: " + puntosVida);
        return danioRecibido;
    }

    @Override
    public String toString() {
        return "NaveDestructora []";
    }

    @Override
    public void embarcar(Guerrero guerreros) {
        super.embarcar(guerreros);

        if (guerreros.getTipo().equalsIgnoreCase("Depredador")) {
            
        }
    }

}
