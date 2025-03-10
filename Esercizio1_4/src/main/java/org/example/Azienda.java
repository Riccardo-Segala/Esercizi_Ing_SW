package org.example;

import java.util.ArrayList;
import java.util.List;

public class Azienda
{
    private List<Dipendente> dipendenti;

    public Azienda()
    {
        dipendenti = new ArrayList<>();
    }

    public void addDipendente(Dipendente dipendente)
    {
        dipendenti.add(dipendente);
    }

    public void removeDipendente(Dipendente dipendente)
    {
        dipendenti.remove(dipendente);
    }

    public void viewDipendenti()
    {
        for(Dipendente dipendente : dipendenti)
        {
            System.out.println("Nome: " + dipendente.getNome());
            System.out.println("Stipendio: " + dipendente.calcolaStipendio());
        }
    }
}
