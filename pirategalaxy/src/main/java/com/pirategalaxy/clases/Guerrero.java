package com.pirategalaxy.clases;

import com.pirategalaxy.interfaz.Tripulable;

public abstract class Guerrero implements Tripulable {

    private String nombre;
    private String tipo;
    private int fuerza;
    private int resistencia;

    public Guerrero(String nombre, String tipo, int fuerza, int resistencia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Guerrero [nombre=" + nombre + ", tipo=" + tipo + ", fuerza=" + fuerza + ", resistencia=" + resistencia
                + "]";
    }

    // (fuerza + resistencia <= 10 ) Controlar la excepción

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    // (fuerza + resistencia <= 10) ---- Condición

}
