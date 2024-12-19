import java.util.*;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario, comissao, salarioFinal;
        int vendas;
        System.out.println("insira seu salário: ");
        salario = sc.nextFloat();
        System.out.println("insira a quantidade de vendas que voce fez no mes: ");
        vendas = sc.nextInt();

        comissao = (vendas*4)/100;
        salarioFinal = (comissao + salario);

        System.out.printf("o seu salário com a comissão de vendas este mes é: %.2f", salarioFinal);

        sc.close();

    }
}