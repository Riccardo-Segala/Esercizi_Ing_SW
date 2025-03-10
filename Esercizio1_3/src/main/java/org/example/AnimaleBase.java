package org.example;

public abstract class AnimaleBase implements Animale
{
    private String nome;

    public AnimaleBase(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    @Override
    public abstract void emettiVerso();

    @Override
    public abstract void muoviti();
}
