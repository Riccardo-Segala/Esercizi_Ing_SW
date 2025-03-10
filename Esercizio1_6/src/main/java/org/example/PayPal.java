package org.example;

public class PayPal extends MetodoPagamento
{
    private String email;
    private String password;

    public PayPal(String email, String password, double saldoDisponibile)
    {
        super(saldoDisponibile);
        this.email = email;
        this.password = password;
    }

    @Override
    public void effettuaPagamento(double importo) throws PagamentoException
    {
        if (email == null || password == null)
        {
            throw new PagamentoException("Email o password non impostati");
        }
        if (importo > getSaldoDisponibile())
        {
            throw new PagamentoException("Saldo insufficiente (PayPal)");
        }
        else
        {
            setSaldoDisponibile(getSaldoDisponibile() - importo);
            System.out.println("Pagamento effettuato con successo");
        }
    }
}
