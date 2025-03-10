package org.example;

public abstract class MaterialeBibliotecario
{
    private String titolo;
    private int annoPubblicazione;

    public MaterialeBibliotecario(String titolo, int annoPubblicazione) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
    }

    public String getTitolo()
    {
        return titolo;
    }

    public void setTitolo(String titolo)
    {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione()
    {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione)
    {
        this.annoPubblicazione = annoPubblicazione;
    }
}
