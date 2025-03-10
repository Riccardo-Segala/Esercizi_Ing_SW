package org.Esercizio1_1;

public abstract class MezzoDiTrasporto implements Veicolo {
    private String targa;

    public MezzoDiTrasporto(String targa) {
        this.targa = targa;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public abstract void avvia();

    @Override
    public abstract void ferma();

    @Override
    public abstract String getTipo();
}