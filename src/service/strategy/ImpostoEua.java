package service.strategy;

import service.ImpostoStrategy;

public class ImpostoEua implements ImpostoStrategy {
    @Override
    public double calcularImposto(double preco) {
        return preco * 0.07;
    }
}
