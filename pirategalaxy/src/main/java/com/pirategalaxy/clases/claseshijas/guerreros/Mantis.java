package com.pirategalaxy.clases.claseshijas.guerreros;

import com.pirategalaxy.clases.clasespadres.Guerrero;

public class Mantis extends Guerrero {

    private String planeta;

    public Mantis(String nombre, String tipo, int fuerza, int resistencia, String planeta) {
        super(nombre, tipo, fuerza, resistencia);
        controlarFuerzaResistencia(fuerza, resistencia);
        this.planeta = planeta;
    }

    private void controlarFuerzaResistencia(int fuerza, int resistencia) {
        if (fuerza + resistencia > 10 || fuerza < 0 || resistencia < 0) {
            System.out.println("Los valores de ataque y defensa no son válidos para este combate.");

            this.fuerza = 5;
            this.resistencia = 5;
            System.out.println("\n Reestableciendo valores por defecto a " + this.nombre + ".");
            System.out.println("\n Resistencia = " + this.resistencia);
            System.out.println("\n fuerza = " + this.fuerza);

        } else {
            this.fuerza = fuerza;
            this.resistencia = resistencia;
        }
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
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

        String mensaje = "\n" + nombre + ", " + tipo + ", fuerza = " + fuerza + ", resistencia = " + resistencia
                + ", planeta = "
                + planeta;

        return mensaje;
    }

}
