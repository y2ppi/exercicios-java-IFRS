import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float nota1, nota2, nota3, media;
       System.out.println("insira a primeira nota: ");
       nota1 = sc.nextFloat();
       System.out.println("insira a segunda nota: ");
       nota2 = sc.nextFloat();
       System.out.println("insira a terceira nota: ");
       nota3 = sc.nextFloat();

       media = (nota1+nota2+nota3)/3;

       System.out.printf("%.1f\n", media);

       sc.close();
    }
}