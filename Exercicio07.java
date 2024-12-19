import java.util.*;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, peso1, peso2, peso3;
        System.out.println("insira sua primeira nota: ");
        n1 = sc.nextFloat();
        System.out.println("informe o peso da prova: ");
        peso1 = sc.nextFloat();
        System.out.println("insira sua segunda nota: ");
        n2 = sc.nextFloat();
        System.out.println("informe o peso da prova: ");
        peso2 = sc.nextFloat();
        System.out.println("insira sua terceira nota: ");
        n3 = sc.nextFloat();
        System.out.println("informe o peso da prova: ");
        peso3 = sc.nextFloat();

        float notaPeso1 = (n1*peso1);
        float notaPeso2 = (n2*peso2);
        float notaPeso3 = (n3*peso3);

        float somaNotas = (notaPeso1+notaPeso2+notaPeso3);
        float somaPesos = (peso1+peso2+peso3);

        float mediaPonderada = (somaNotas / somaPesos);
        
        System.out.printf("%.1f", mediaPonderada);

        sc.close();
    }
}