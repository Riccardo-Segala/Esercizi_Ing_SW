package org.Esercizio1_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MezzoDiTrasporto> veicoli = new ArrayList<>();

        veicoli.add(new Auto("AB123CD"));
        veicoli.add(new Moto("EF456GH"));

        // Avvia tutti i veicoli
        for (MezzoDiTrasporto veicolo : veicoli) {
            veicolo.avvia();
        }

        // Ferma tutti i veicoli
        for (MezzoDiTrasporto veicolo : veicoli) {
            veicolo.ferma();
        }
    }
}