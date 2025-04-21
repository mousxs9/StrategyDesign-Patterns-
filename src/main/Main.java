package main;

import service.ImpostoStrategy;
import service.strategy.ImpostoBrasil;
import service.strategy.ImpostoCanada;
import service.strategy.ImpostoEua;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<String, ImpostoStrategy> estrategias = new HashMap<>();
        estrategias.put("brasil", new ImpostoBrasil());
        estrategias.put("canadá", new ImpostoCanada());
        estrategias.put("eua", new ImpostoEua());

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nCálculo de Imposto\n-Brasil\n-Canadá\n-EUA\n\n");
        System.out.print("Selecione o país: ");
        String pais = sc.nextLine().toLowerCase();

        ImpostoStrategy estrategia = estrategias.getOrDefault(pais, new ImpostoBrasil());

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();


        PedidoVenda pedido = new PedidoVenda(estrategia);
        double valorImposto = pedido.calcularImposto(valor);

        System.out.println("Imposto calculado: " + valorImposto);
        }
}