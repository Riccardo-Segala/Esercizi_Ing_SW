package org.example;

public abstract class MetodoPagamento implements Pagabile {

    private double saldoDisponibile;
    public MetodoPagamento(double saldoDisponibile)
    {
        this.saldoDisponibile = saldoDisponibile;
    }

    public double getSaldoDisponibile()
    {
        return saldoDisponibile;
    }

    public void setSaldoDisponibile(double saldoDisponibile)
    {
        this.saldoDisponibile = saldoDisponibile;
    }

    public abstract void effettuaPagamento(double importo);
}
