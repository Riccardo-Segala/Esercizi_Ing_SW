package org.example;

public class Gatto extends AnimaleBase
{
    public Gatto(String nome)
    {
        super(nome);
    }

    @Override
    public void emettiVerso()
    {
        System.out.println("Miao");
    }

    @Override
    public void muoviti()
    {
        System.out.println("Il gatto si muove a 4 zampe");
    }
}
