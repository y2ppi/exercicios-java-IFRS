import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, sub;
        System.out.println("insira o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("insira o segundo número: ");
        n2 = sc.nextInt();

        sub = n1 - n2;

        System.out.println(sub);

        sc.close();
    }
}