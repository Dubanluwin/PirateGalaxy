package com.pirategalaxy.clases;

import java.util.List;

import com.pirategalaxy.interfaz.Tripulable;

public abstract class VehiculoGuerra implements Tripulable {

    private int puntosVida = 1000;
    private int ataque = 5;
    private int defensa = 5;
    private String nombre;
    private List<Guerrero> listaGuerreros;

    public VehiculoGuerra(int puntosVida, int ataque, int defensa, String nombre, List<Guerrero> listaGuerreros) {
        this.puntosVida = puntosVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nombre = nombre;
        this.listaGuerreros = listaGuerreros;
    }

    @Override
    public String toString() {
        return "VehiculoGuerra [puntosVida=" + puntosVida + ", ataque=" + ataque + ", defensa=" + defensa + ", nombre="
                + nombre + ", listaGuerreros=" + listaGuerreros + "]";
    }

    // (ataque + defensa <= 10 ) - Método para crear la excepción de que la suma y
    // el ataque no sea mayor de 10.

    public int condicionDeAtaqueDefensa(int ataque, int defensa) {

        int estadisticaGuerra = ataque + defensa;
        int ataqueDefensa;
        if (estadisticaGuerra <= 10) {

            System.out.println("El ataque y la defensa son válidos para este combate.");

        } else {
            System.out.println(
                    "El ataqué y la defensa no son válidos para este combate. Reestableciendo a los valores por defecto por tramposo");
            ataque = 5;
            defensa = 5;
                    return ;
        }

    }

    // Método embarcar (Guerrero), maximo 10 guerreros.

    // Ataque: ataque VehiculoGuerra*(random 0-1) + SUM (fuerza de todos los
    // guerreros) * (random 0-0.5)

    // Defensa: defensa VehiculoGuerra*(random 0-1) + SUM (Resistencia de todos los
    // guerreros) * (random 0-0.5)

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Guerrero> getListaGuerreros() {
        return listaGuerreros;
    }

    public void setListaGuerreros(List<Guerrero> listaGuerreros) {
        this.listaGuerreros = listaGuerreros;
    }

}
