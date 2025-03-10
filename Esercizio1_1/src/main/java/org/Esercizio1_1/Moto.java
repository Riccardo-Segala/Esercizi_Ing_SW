package org.Esercizio1_1;

public class Moto extends MezzoDiTrasporto
{


    public Moto(String targa) {
        super(targa);
    }

    @Override
    public void avvia()
    {
        System.out.println("Moto avviata");
    }

    @Override
    public void ferma()
    {
        System.out.println("Moto fermata");
    }

    @Override
    public String getTipo()
    {
        return "Moto";
    }
}