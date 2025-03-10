package org.Esercizio1_1;

public class Auto extends MezzoDiTrasporto
{


    public Auto(String targa) {
        super(targa);
    }

    @Override
    public void avvia()
    {
        System.out.println("Auto avviata");
    }

    @Override
    public void ferma()
    {
        System.out.println("Auto fermata");
    }

    @Override
    public String getTipo()
    {
        return "Auto";
    }
}
