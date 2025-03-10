package org.example;

public class Cane extends AnimaleBase
{
    public Cane(String nome)
    {
        super(nome);
    }

    @Override
    public void emettiVerso()
    {
        System.out.println("Bau bau");
    }

    @Override
    public void muoviti()
    {
        System.out.println("Il cane si muove a 4 zampe");
    }
}
