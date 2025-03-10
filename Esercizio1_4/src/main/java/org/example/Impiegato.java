package org.example;

public class Impiegato extends Dipendente
{

    public Impiegato(String nome, double stipendio)
    {
        super(nome, stipendio);
    }


    @Override
    public double calcolaStipendio()
    {
        return getStipendio();
    }
}
