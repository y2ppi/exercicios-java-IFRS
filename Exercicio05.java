import java.util.*;

public class Exercicio05 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float salario, grati, aGrati, imposto, salarioTotal;
    System.out.println("insira seu salário atual: ");
    salario = sc.nextFloat();
    
    grati = (salario*5)/100;
    aGrati = (salario + grati);
    imposto = (salario*7)/100;
    
    salarioTotal = (aGrati - imposto);

    System.out.printf("O seu salário com os descontos é: %.2f", salarioTotal);

    sc.close();
   }
}