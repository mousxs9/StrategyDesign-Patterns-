package service.strategy;

import service.ImpostoStrategy;

public class ImpostoBrasil implements ImpostoStrategy {
    @Override
    public double calcularImposto(double preco) {
        return preco * 0.17;
    }
}
