package org.example;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        List<AnimaleBase> animali = new ArrayList<>();

        animali.add(new Cane("Whisky"));
        animali.add(new Gatto("Fuffi"));

        for(AnimaleBase animale : animali)
        {
            System.out.println("Nome: " + animale.getNome());
            animale.emettiVerso();
            animale.muoviti();
        }
    }
}