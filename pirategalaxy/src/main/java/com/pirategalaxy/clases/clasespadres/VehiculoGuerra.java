package com.pirategalaxy.clases.clasespadres;

import java.util.ArrayList;
import java.util.List;

import com.pirategalaxy.interfaz.Tripulable;

public abstract class VehiculoGuerra implements Tripulable {

    protected int puntosVida = 1000;
    protected int ataque = 5;
    protected int defensa = 5;
    protected String nombre;
    protected String tipo;
    protected List<Guerrero> listaGuerreros = new ArrayList<>();

    public VehiculoGuerra(int puntosVida, int ataque, int defensa, String nombre, String tipo,
            List<Guerrero> listaGuerreros) {

        controlarAtaqueDefensa(ataque, defensa);
        this.puntosVida = puntosVida;
        this.nombre = nombre;
        this.tipo = tipo;
        this.listaGuerreros = listaGuerreros;
    }

    // Método embarcar (Guerrero), maximo 10 guerreros.

    private void controlarAtaqueDefensa(int ataque, int defensa) {
        // (ataque + defensa <= 10 ) - Método para crear la excepción de que la suma y
        // el ataque no sea mayor de 10.

        if (ataque + defensa > 10 || ataque < 0 || defensa < 0) {
            System.out.println("Los valores de ataque y defensa no son válidos para este combate.");

            this.ataque = 5;
            this.defensa = 5;
            System.out.println("\n Reestableciendo valores por defecto..." +
                    "\n Defensa = " + this.defensa +
                    "\n Ataque = " + this.ataque);
        } else {
            this.ataque = ataque;
            this.defensa = defensa;
        }
    }

    public void embarcar(Guerrero guerreros) {
        if (listaGuerreros.size() > 10) {
            System.out.println("No se pueden embarcar más de 10 guerreros");
            return;
        } else {
            listaGuerreros.add(guerreros);
            System.out.println("Los guerreros se han embarcado...");
        }
    }

    // Ataque: ataque VehiculoGuerra*(random 0-1) + SUM (fuerza de todos los
    // guerreros) * (random 0-0.5)

    // Defensa: defensa VehiculoGuerra*(random 0-1) + SUM (Resistencia de todos los
    // guerreros) * (random 0-0.5)

    @Override
    public String toString() {
        return "VehiculoGuerra [puntosVida=" + puntosVida + ", ataque=" + ataque + ", defensa=" + defensa + ", nombre="
                + nombre + ", tipo=" + tipo + ", listaGuerreros=" + listaGuerreros + "]";
    }

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int atacar() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int defender(int danho) {
        // TODO Auto-generated method stub
        return 0;
    }

}
