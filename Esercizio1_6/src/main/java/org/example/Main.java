package org.example;

public class Main {
    public static void main(String[] args)
    {
        SistemaPagamenti sistemaPagamenti = new SistemaPagamenti();

        MetodoPagamento cartaDiCredito = new CartaDiCredito(500.0, "1234567890123456", "Mario Rossi", "12/25", 123);
        MetodoPagamento payPal = new PayPal("mario.rossi@example.com", "password123", 300.0);

        sistemaPagamenti.aggiungiMetodoPagamento(cartaDiCredito);
        sistemaPagamenti.aggiungiMetodoPagamento(payPal);

        for(MetodoPagamento metodoPagamento : sistemaPagamenti.getMetodiPagamento())
        {
            try
            {
                metodoPagamento.effettuaPagamento(600.0);
            }
            catch (PagamentoException e)
            {
                System.out.println(e.getMessage());
            }
        }


        sistemaPagamenti.stampaPagamenti();
    }
}