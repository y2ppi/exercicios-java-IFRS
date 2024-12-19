import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1, n2, divisao;
    System.out.println("insira o primeiro numero: ");
    n1 = sc.nextInt();
    System.out.println("insira o segundo numero: ");
    n2 = sc.nextInt();

    divisao = (n1 / n2);

    System.out.println(divisao);

    sc.close();
    }
}