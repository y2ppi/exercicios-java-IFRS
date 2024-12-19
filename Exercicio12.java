import java.util.*;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precoVeiculo, percentualLucro, percentualImpostos, precoTotal;
        System.out.println("informe o preço de fábrica do veículo: ");
        precoVeiculo = sc.nextFloat();
        
        // Supondo que o percentual de lucro do distribuidor seja de 15% e os impostos sejam de 10%
        percentualLucro = (precoVeiculo*15)/100;

        percentualImpostos = (precoVeiculo*10)/100;

        precoTotal = (precoVeiculo + percentualLucro + percentualImpostos);

        System.out.printf("lucro do distribuidor: %.3f", percentualLucro);
        System.out.printf("percentual de impostos: %.3f", percentualImpostos);
        System.out.printf("valor total a pagar: %.3f", precoTotal);
        
        sc.close();
    }
}