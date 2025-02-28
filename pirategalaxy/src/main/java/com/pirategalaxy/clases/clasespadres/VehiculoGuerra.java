package com.pirategalaxy.clases.clasespadres;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pirategalaxy.clases.claseshijas.guerreros.Depredador;
import com.pirategalaxy.clases.claseshijas.guerreros.Mantis;
import com.pirategalaxy.excepciones.TooManyGuerreros;
import com.pirategalaxy.interfaz.Tripulable;
import com.pirategalaxy.clases.claseshijas.vehiculos.NaveDepredadora;
import com.pirategalaxy.clases.claseshijas.vehiculos.TanqueMantis;

public abstract class VehiculoGuerra implements Tripulable {

    protected int puntosVida = 1000;
    protected int ataque = 5;
    protected int defensa = 5;
    protected String nombre;
    protected String tipo;
    protected List<Guerrero> listaGuerreros = new ArrayList<>();
    protected Map<String, List<Guerrero>> mapaVehiculoGuerra = new HashMap<>();

    public VehiculoGuerra(int puntosVida, int ataque, int defensa, String nombre, String tipo,
            List<Guerrero> listaGuerreros, Map<String, List<Guerrero>> mapaVehiculoGuerra) {

        controlarAtaqueDefensa(ataque, defensa);
        this.puntosVida = puntosVida;
        this.nombre = nombre;
        this.tipo = tipo;
        this.listaGuerreros = listaGuerreros;
        this.mapaVehiculoGuerra = mapaVehiculoGuerra;
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

    // Crear un mapa, donde 1 clave sera la nave depredadora con su lista de depredadores, 1 clave sera el tanquis con su lista de guerreros.
    public void embarcar(Guerrero guerreros) {
        if (listaGuerreros.size() > 10) {
            System.out.println("No se pueden embarcar más de 10 guerreros");
            return;
        } else {
            listaGuerreros.add(guerreros);
            System.out.println("Los guerreros se han embarcado...");
        }
    }

    // ============================== CAMBIOS VIKTOR ============================== //
    public void crearVehiculoGuerra() {
        mapaVehiculoGuerra.put(Tanque, listaGuerreros);
        mapaVehiculoGuerra.put(NaveDepredadora, listaGuerreros);
    }

    public void embarcarGuerrero(String tipoNave, Guerrero guerrero) throws TooManyGuerreros {
        List<Guerrero> listaGuerreros = mapaVehiculoGuerra.get(tipoNave);
        int maxGuerreros = 10;

        if (listaGuerreros == null) {
            throw new IllegalArgumentException("El tipo de nave no es válido");
        }

        if (tipoNave.equalsIgnoreCase("Tanque") && !(guerrero instanceof Mantis)) {
            throw new IllegalArgumentException("Solo los guerreros de tipo Mantis pueden embarcar en un Tanque");
        }

        if (tipoNave.equalsIgnoreCase("NaveDepredadora") && !(guerrero instanceof Depredador)) {
            throw new IllegalArgumentException("Solo los guerreros de tipo Depredador pueden embarcar en un Nave Depredadora");
        }

        if (listaGuerreros.size() == maxGuerreros) {
            throw new TooManyGuerreros("No se pueden embarcar más de " + maxGuerreros + " guerreros en la nave " + tipoNave);
        }

        listaGuerreros.add(guerrero);
        System.out.println("Guerrero embarcado en " + tipoNave);
    }

    public void mostrarGuerreros() {
        for (String tipoNave : mapaVehiculoGuerra.keySet()) {
            List<Guerrero> listaGuerreros = mapaVehiculoGuerra.get(tipoNave);
            System.out.println("Vehículo: " + tipoNave + " - Guerreros: " + listaGuerreros.size());
        }
    }
    // ============================================================================== //

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

    // VIKTOR: añadimos el alcance.
    @Override
    public int alcance() {
        // TODO Auto-generated method stub
        return 0;
    }

}
