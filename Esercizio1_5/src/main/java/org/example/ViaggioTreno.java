package org.example;

public class ViaggioTreno extends Viaggio
{
    private String compagniaFerroviaria;

    public ViaggioTreno(String destinazione, int prezzo, String numeroPosto, String compagniaFerroviaria)
    {
        super(destinazione, prezzo, numeroPosto);
        this.compagniaFerroviaria = compagniaFerroviaria;
    }

    public void setCompagniaFerroviaria(String compagniaFerroviaria)
    {
        this.compagniaFerroviaria = compagniaFerroviaria;
    }

    public String getCompagniaFerroviaria()
    {
        return compagniaFerroviaria;
    }

    @Override
    public void descriviViaggio()
    {
        System.out.println("Il viaggio in treno per " + getDestinazione() + " con la compagnia ferroviaria " + compagniaFerroviaria + " costa " + getCosto() + " euro e il numero del posto è " + getNumeroPosto());
    }
}
