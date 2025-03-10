package org.example;

public abstract class Viaggio
{
    private String destinazione;
    private int prezzo;
    private String numeroPosto;

    public Viaggio(String destinazione,int prezzo, String numeroPosto) {
        this.destinazione = destinazione;
        this.prezzo = prezzo;
        this.numeroPosto = numeroPosto;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public int getCosto() {
        return prezzo;
    }

    public void setCosto(int prezzo) {
        this.prezzo = prezzo;
    }

    public String getNumeroPosto()
    {
        return numeroPosto;
    }

    public void setNumeroPosto()
    {
        this.numeroPosto = numeroPosto;
    }

    public abstract void descriviViaggio();
}
