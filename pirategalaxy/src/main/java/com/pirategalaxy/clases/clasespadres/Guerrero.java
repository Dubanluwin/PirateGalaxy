package com.pirategalaxy.clases.clasespadres;

public abstract class Guerrero {

    protected String nombre;
    protected String tipo;
    protected int fuerza;
    protected int resistencia;

    public Guerrero(String nombre, String tipo, int fuerza, int resistencia) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Cada guerrero aporta puntos extra de ataque al vehículo.

    public int apoyoAtaque() {

        return fuerza;
    }

    // Cada guerrero aporta puntos extra de defensa al vehículo.
    public int apoyoDefensa() {

        return resistencia;
    }

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

}
