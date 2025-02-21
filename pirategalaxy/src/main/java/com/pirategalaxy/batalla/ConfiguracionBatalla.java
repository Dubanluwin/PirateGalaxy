package com.pirategalaxy.batalla;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.pirategalaxy.clases.claseshijas.guerreros.Depredador;
import com.pirategalaxy.clases.claseshijas.guerreros.Mantis;
import com.pirategalaxy.clases.claseshijas.vehiculos.NaveDepredadora;
import com.pirategalaxy.clases.clasespadres.Guerrero;

public class ConfiguracionBatalla {

    public static List<Guerrero> crearMantis(int numGuerreros) {

        List<Guerrero> listaMantis = new CopyOnWriteArrayList<>();

        System.out.println("Creando la tripulación de Mantis...");

        Mantis mantis1 = new Mantis("Mantis1", "Mantis", 4, 6);
        Mantis mantis2 = new Mantis("Mantis2", "Mantis", 1, 9);
        Mantis mantis3 = new Mantis("Mantis3", "Mantis", 9, 1);
        Mantis mantis4 = new Mantis("Mantis4", "Mantis", 2, 8);
        Mantis mantis5 = new Mantis("Mantis5", "Mantis", 6, 6);
        Mantis mantis6 = new Mantis("Mantis6", "Mantis", 4, 5);
        Mantis mantis7 = new Mantis("Mantis7", "Mantis", 2, 8);
        Mantis mantis8 = new Mantis("Mantis8", "Mantis", 5, 5);
        Mantis mantis9 = new Mantis("Mantis9", "Mantis", 3, 7);
        Mantis mantis10 = new Mantis("Mantis10", "Mantis", 8, 2);

        listaMantis.add(mantis1);
        listaMantis.add(mantis2);
        listaMantis.add(mantis3);
        listaMantis.add(mantis4);
        listaMantis.add(mantis5);
        listaMantis.add(mantis6);
        listaMantis.add(mantis7);
        listaMantis.add(mantis8);
        listaMantis.add(mantis9);
        listaMantis.add(mantis10);

        return listaMantis;

    }

    public static List<Guerrero> crearDepredadores(int numGuerreros) {

        List<Guerrero> listaDepredadores = new CopyOnWriteArrayList<>();
        System.out.println("Creando la tripulación de Depredadores...");
        for (int i = 0; i < numGuerreros; i++) {
            Depredador depredador = new Depredador("Depredador" + i, "Depredador", 9 - i, 1 + i);
            listaDepredadores.add(depredador);
        }

        return listaDepredadores;

    }

}
