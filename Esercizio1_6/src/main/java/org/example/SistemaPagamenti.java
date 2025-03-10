package org.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamenti
{
    private List<MetodoPagamento> metodiPagamento;

    public SistemaPagamenti()
    {
        metodiPagamento = new ArrayList<>();
    }

    public void aggiungiMetodoPagamento(MetodoPagamento metodoPagamento)
    {
        metodiPagamento.add(metodoPagamento);
    }

    public void rimuoviMetodoPagamento(MetodoPagamento metodoPagamento)
    {
        metodiPagamento.remove(metodoPagamento);
    }

    public void stampaPagamenti()
    {
        for(MetodoPagamento metodoPagamento : metodiPagamento)
        {
            System.out.println("Saldo disponibile: " + metodoPagamento.getSaldoDisponibile() + "Metodo di pagamento: " + metodoPagamento.getClass().getSimpleName());
        }
    }

    public List<MetodoPagamento> getMetodiPagamento()
    {
        return metodiPagamento;
    }
}
