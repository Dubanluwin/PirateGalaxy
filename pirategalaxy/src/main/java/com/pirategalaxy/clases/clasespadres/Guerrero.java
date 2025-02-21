package com.pirategalaxy.clases.clasespadres;

public abstract class Guerrero {

    protected String nombre;
    protected String tipo;
    protected int fuerza;
    protected int resistencia;

    public Guerrero(String nombre, String tipo, int fuerza, int resistencia) {

        controlarFuerzaResistencia(fuerza, resistencia);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // (fuerza + resistencia <= 10) ---- Condición
    private void controlarFuerzaResistencia(int fuerza, int resistencia) {
        if (fuerza + resistencia > 10 || fuerza < 0 || resistencia < 0) {
            System.out.println("Los valores de ataque y defensa no son válidos para este combate.");

            this.fuerza = 5;
            this.resistencia = 5;
            System.out.println("\n Reestableciendo valores por defecto..." +
                    "\n Resistencia = " + this.resistencia +
                    "\n fuerza = " + this.fuerza);
        } else {
            this.fuerza = fuerza;
            this.resistencia = resistencia;
        }
    }

    // Cada guerrero aporta puntos extra de ataque al vehículo.

    public int apoyoAtaque() {

        return fuerza;
    }

    // Cada guerrero aporta puntos extra de defensa al vehículo.
    public int apoyoDefensa() {

        return resistencia;
    }

    @Override
    public String toString() {
        return "Guerrero [nombre=" + nombre + ", tipo=" + tipo + ", fuerza=" + fuerza + ", resistencia=" + resistencia
                + "]";
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
