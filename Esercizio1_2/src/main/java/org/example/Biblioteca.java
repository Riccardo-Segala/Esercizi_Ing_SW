package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca
{
    private List<MaterialeBibliotecario> materiali;

    public Biblioteca()
    {
        this.materiali = new ArrayList<>();
    }

    public void addMaterial(MaterialeBibliotecario materiale)
    {
        this.materiali.add(materiale);
    }

    public void removeMaterial(MaterialeBibliotecario materiale)
    {
        this.materiali.remove(materiale);
    }

    public void viewMaterial()
    {
        for (MaterialeBibliotecario materiale : this.materiali)
        {
            System.out.println(materiale.getTitolo());
            if(materiale instanceof Libro)
            {
                System.out.println("Autore: " + ((Libro) materiale).getAutore());
            }
            else if(materiale instanceof Rivista)
            {
                System.out.println("Numero edizione: " + ((Rivista) materiale).getNumeroEdizione());
            }
        }
    }
}
