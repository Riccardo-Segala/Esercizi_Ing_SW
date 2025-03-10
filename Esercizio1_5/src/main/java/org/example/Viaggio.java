package org.example;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viaggio viaggio = (Viaggio) o;
        return prezzo == viaggio.prezzo &&
                Objects.equals(destinazione, viaggio.destinazione) &&
                Objects.equals(numeroPosto, viaggio.numeroPosto);
    }

    public abstract void descriviViaggio();
}
