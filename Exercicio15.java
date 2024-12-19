import java.util.*;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temperaturaCelsius, temperaturaFahrenheit;
        System.out.println("insira a temperatura em graus celsius: ");
        temperaturaCelsius = sc.nextFloat();

        temperaturaFahrenheit = (9*temperaturaCelsius/5)+32;

        System.out.printf("temperatura transformada de Celsius para Fahrenheit: %.2f", temperaturaFahrenheit);

        sc.close();
    }
}