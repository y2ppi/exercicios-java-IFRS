import java.util.*;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float horasTrabalhadas, salarioMinimo, decimoHora, salarioBruto, imposto, salarioTotal;
        System.out.println("informe o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextFloat();
        System.out.println("digite o salário minimo da empresa: ");
        salarioMinimo = sc.nextFloat();

        // cada hora trabalhada vale um décimo do salário minimo
        decimoHora = salarioMinimo/10;

        // salario bruto equivale a horas trabalhadas * valor hora trabalhada

        salarioBruto = horasTrabalhadas*decimoHora;

        // imposto equivale a 3% do salário bruto

        imposto = (salarioBruto*3)/100;

        salarioTotal = (salarioBruto - imposto);

        System.out.printf("salário a receber: %.2f", salarioTotal);

        sc.close();
    }
}