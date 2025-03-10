package org.example;

public class Main
{
    public static void main(String[] args)
    {
        SistemaPrenotazioni sistema = new SistemaPrenotazioni();

        ViaggioAereo viaggio1 = new ViaggioAereo("Parigi", 200, "20B", "Air France");
        //ViaggioTreno viaggio2 = new ViaggioTreno("Roma", 200, "12A", "Trenitalia");
        ViaggioAereo viaggio2 = new ViaggioAereo("Parigi", 200, "20B", "Air France");

        try
        {
            sistema.addViaggio(viaggio1);
            sistema.addViaggio(viaggio2); // This will throw an exception
        } catch (ViaggioGiaPrenotatoException e)
        {
            System.err.println(e.getMessage());
        }

        sistema.viewViaggi();
    }
}