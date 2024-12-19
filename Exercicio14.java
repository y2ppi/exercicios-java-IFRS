import java.util.*;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salarioMinimo, quilowatts, valorQuilowatss, valor, desconto, valorTotal;
        System.out.println("valor do salário minimo: ");
        salarioMinimo = sc.nextFloat();
        System.out.println("quantidade de quilowatts consumida: ");
        quilowatts = sc.nextFloat();

        valorQuilowatss = salarioMinimo/5;

        valor = quilowatts*valorQuilowatss;

        desconto = (valor*15)/100;

        valorTotal = (valor - desconto);

        System.out.printf("%.2f", valorTotal);

        sc.close();
    }
}