import java.util.*;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado, areaQuadrado;
        System.out.println("insira o tamanho dos lados do quadrado: ");
        lado = sc.nextInt();

        areaQuadrado = (lado*lado);

        System.out.println(areaQuadrado);

        sc.close();
    }
}