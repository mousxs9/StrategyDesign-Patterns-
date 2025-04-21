package main;

import service.ImpostoStrategy;

public class PedidoVenda implements ImpostoStrategy{
    ImpostoStrategy s;

    public PedidoVenda(ImpostoStrategy s){
        if(this.s == null){
            this.s = s;
        }
    }

    @Override
    public double calcularImposto(double preco) {
        return s.calcularImposto(preco);
    }
}
