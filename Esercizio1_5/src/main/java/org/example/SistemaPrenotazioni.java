package org.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaPrenotazioni
{
    private List<Viaggio> viaggi;

    public SistemaPrenotazioni()
    {
        viaggi = new ArrayList<>();
    }

    public void addViaggio(Viaggio viaggio) throws ViaggioGiaPrenotatoException
    {
        if(viaggi.contains(viaggio))
        {
            throw new ViaggioGiaPrenotatoException("Il viaggio è già stato prenotato");
        }
        this.viaggi.add(viaggio);
    }

    public void removeViaggio(Viaggio viaggio)
    {
        this.viaggi.remove(viaggio);
    }

    public void viewViaggi()
    {
        for (Viaggio viaggio : this.viaggi)
        {
            System.out.println("Destinazione: " + viaggio.getDestinazione());
            System.out.println("Numero posto: " + viaggio.getNumeroPosto());
            System.out.println("Prezzo: " + viaggio.getCosto());
            if(viaggio instanceof ViaggioAereo)
            {
                System.out.println("Compagnia aerea: " + ((ViaggioAereo) viaggio).getCompagniaAerea());
            }
            else if(viaggio instanceof ViaggioTreno) {
                System.out.println("Compagnia ferroviaria: " + ((ViaggioTreno) viaggio).getCompagniaFerroviaria());
            }
        }
    }
}
