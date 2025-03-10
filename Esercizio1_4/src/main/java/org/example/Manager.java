package org.example;

public class Manager extends Dipendente
{
    private double bonus;

    public Manager(String nome, double stipendio, double bonus)
    {
        super(nome, stipendio);
        this.bonus = bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public double getBonus()
    {
        return bonus;
    }

    @Override
    public double calcolaStipendio()
    {
        return getStipendio() + bonus;
    }
}
