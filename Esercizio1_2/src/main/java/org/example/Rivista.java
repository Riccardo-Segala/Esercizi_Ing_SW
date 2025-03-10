package org.example;

public class Rivista extends MaterialeBibliotecario
{
    private String numeroEdizione;

    public Rivista(String titolo, int annoPubblicazione, String numeroEdizione)
    {
        super(titolo, annoPubblicazione);
        this.numeroEdizione = numeroEdizione;
    }

    public void setNumeroEdizione(String numeroEdizione)
    {
        this.numeroEdizione = numeroEdizione;
    }

    public String getNumeroEdizione()
    {
        return numeroEdizione;
    }
}
