package org.example;

public class Libro extends MaterialeBibliotecario
{
    private String autore;


    public Libro(String titolo, int annoPubblicazione, String autore)
    {
        super(titolo, annoPubblicazione);
        this.autore = autore;
    }

    public void setAutore(String autore)
    {
        this.autore = autore;
    }

    public String getAutore()
    {
        return autore;
    }
}
