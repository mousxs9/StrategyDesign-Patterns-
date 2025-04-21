package main;

import service.ImpostoStrategy;
import service.strategy.ImpostoBrasil;
import service.strategy.ImpostoCanada;
import service.strategy.ImpostoEua;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ImpostoStrategy estrategia = null;
        Scanner sc = new Scanner(System.in);

            System.out.print("\n\nCálculo de Imposto\n-Brasil\n-Canadá\n-EUA\n\n");
            System.out.print("Selecione o país: ");
            String pais = sc.nextLine();
            System.out.print("Digite o valor: ");
            double valor = sc.nextDouble();

            if (pais.equalsIgnoreCase("Brasil")){
                estrategia = new ImpostoBrasil();
            } else if (pais.equalsIgnoreCase("Canadá")) {
                estrategia = new ImpostoCanada();
            } else if (pais.equalsIgnoreCase("EUA")) {
                new PedidoVenda(new ImpostoEua());
            }


        PedidoVenda pedido = new PedidoVenda(estrategia);
        double valorImposto = pedido.calcularImposto(valor);

        System.out.println("Imposto calculado: " + valorImposto);
        }
}