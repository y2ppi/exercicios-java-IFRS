import java.util.*;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, altura, areaTriangulo;
        System.out.println("insira o tamanho da base do triangulo: ");
        base = sc.nextInt();
        System.out.println("insira a altura do triangulo: ");
        altura = sc.nextInt();

        areaTriangulo = (base*altura);

        System.out.println(areaTriangulo);

        sc.close();
    }
}