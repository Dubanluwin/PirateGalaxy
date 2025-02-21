package com.pirategalaxy.clases.claseshijas.vehiculos;

import java.util.List;

import com.pirategalaxy.clases.clasespadres.Guerrero;
import com.pirategalaxy.clases.clasespadres.VehiculoGuerra;

public class Tanque extends VehiculoGuerra {

    public Tanque(int puntosVida, int ataque, int defensa, String nombre, String tipo, List<Guerrero> listaGuerreros) {
        super(puntosVida, ataque, defensa, nombre, tipo, listaGuerreros);
    }

    @Override
    public int atacar() {

        // SE PUEDE MODIFICAR EL METODO (( HE UTILIZADO EL MISMO DE LA NAVE
        // DESTRUCTORA))

        // atacar(): devuelve un valor calculado con la fórmula del diagrama (p. ej.
        // ataque base + suma del ataque de los guerreros).

        int danhoTotal = ataque;
        for (Guerrero guerrero : listaGuerreros) {
            danhoTotal += guerrero.apoyoAtaque(); // Los guerreros suman al ataque
        }
        System.out.println(this.nombre + " realiza un ataque con daño total: " + danhoTotal);
        return danhoTotal;

    }

    @Override
    public int defender(int danho) {

        // SE PUEDE MODIFICAR EL METODO (( HE UTILIZADO EL MISMO DE LA NAVE
        // DESTRUCTORA))

        // defender(): devuelve un valor calculado con la fórmula del diagrama (p. ej.
        // defensa base + suma de la defensa de los guerreros). Con el valor devuelto
        // por el método defender se quitarán los puntos de vida de la nave.

        int defensaTotal = defensa;
        for (Guerrero guerrero : listaGuerreros) {
            defensaTotal += guerrero.apoyoDefensa(); // Los guerreros suman a la defensa
        }
        int danhoRecibido = Math.max(0, danho - defensaTotal); // Si el daño es menor que la defensa, no se recibe daño
        puntosVida -= danhoRecibido;
        System.out.println(this.nombre + " recibe " + danhoRecibido + " de daño, vida restante: " + puntosVida);
        return danhoRecibido;
    }

    @Override
    public String toString() {
        return "Tanque []";
    }

}
