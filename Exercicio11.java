import java.util.*;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoNascimento, anoAtual, idadeAnos, idadeMeses, idadeDias, idadeSemanas;
        System.out.println("informe o seu ano de nascimento: ");
        anoNascimento = sc.nextInt();
        System.out.println("informe o ano que estamos: ");
        anoAtual = sc.nextInt();

        idadeAnos = (anoAtual - anoNascimento);
        idadeMeses = (idadeAnos*12);
        idadeDias = (idadeAnos*365);
        idadeSemanas = (idadeAnos*52);

        System.out.println("sua idade: " + idadeAnos);
        System.out.println("sua idade em meses: " + idadeMeses);
        System.out.println("sua idade em dias: " + idadeDias);
        System.out.println("sua idade em semanas: " + idadeSemanas);

        sc.close();
    }
}