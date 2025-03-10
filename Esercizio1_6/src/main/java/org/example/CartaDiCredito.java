package org.example;

public class CartaDiCredito extends MetodoPagamento
{
    private String numeroCarta;
    private String intestatario;
    private String scadenza;
    private int cvv;

    public CartaDiCredito(double saldoDisponibile, String numeroCarta, String intestatario, String scadenza, int cvv)
    {
        super(saldoDisponibile);
        this.numeroCarta = numeroCarta;
        this.intestatario = intestatario;
        this.scadenza = scadenza;
        this.cvv = cvv;
    }

    public String getNumeroCarta()
    {
        return numeroCarta;
    }

    public void setNumeroCarta(String numeroCarta)
    {
        this.numeroCarta = numeroCarta;
    }

    public String getIntestatario()
    {
        return intestatario;
    }

    public void setIntestatario(String intestatario)
    {
        this.intestatario = intestatario;
    }

    public String getScadenza()
    {
        return scadenza;
    }

    public void setScadenza(String scadenza)
    {
        this.scadenza = scadenza;
    }

    public int getCvv()
    {
        return cvv;
    }

    public void setCvv(int cvv)
    {
        this.cvv = cvv;
    }

    @Override
    public void effettuaPagamento(double importo) throws PagamentoException
    {
        if (importo > getSaldoDisponibile())
        {
            throw new PagamentoException("Saldo insufficiente (carta di credito)");
        }
        else
        {
            setSaldoDisponibile(getSaldoDisponibile() - importo);
            System.out.println("Pagamento effettuato con successo");
        }
    }
}
