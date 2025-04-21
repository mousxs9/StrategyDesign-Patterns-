package service.strategy;

import service.ImpostoStrategy;

public class ImpostoCanada implements ImpostoStrategy {
    @Override
    public double calcularImposto(double preco) {

        return preco * 0.13;

    }
}
