package org.example;

public class ViaggioAereo extends Viaggio
{
    private String compagniaAerea;

    public ViaggioAereo(String destinazione, int prezzo, String numeroPosto, String compagniaAerea)
    {
        super(destinazione, prezzo, numeroPosto);
        this.compagniaAerea = compagniaAerea;
    }

    public void setCompagniaAerea(String compagniaAerea)
    {
        this.compagniaAerea = compagniaAerea;
    }

    public String getCompagniaAerea()
    {
        return compagniaAerea;
    }

    @Override
    public void descriviViaggio()
    {
        System.out.println("Il viaggio aereo per " + getDestinazione() + " con la compagnia aerea " + compagniaAerea + " costa " + getCosto() + " euro e il numero del posto è " + getNumeroPosto());
    }
}
