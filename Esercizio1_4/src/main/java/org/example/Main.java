package org.example;

public class Main
{
    public static void main(String[] args)
    {
        Azienda azienda = new Azienda();

        Impiegato impiegato = new Impiegato("Mario Rossi", 3000);
        Manager manager = new Manager("Luigi Bianchi", 5000, 2000);

        azienda.addDipendente(impiegato);
        azienda.addDipendente(manager);

        azienda.viewDipendenti();
    }
}