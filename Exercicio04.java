import java.util.*;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float preco, desconto, novoPreco;
        System.out.println("insira o preço atual do produto: ");
        preco = sc.nextFloat();

        desconto = (preco*10)/100;

        novoPreco = (preco - desconto);
        
        System.out.printf("O novo preco do produto é: %.2f", novoPreco);
        
        sc.close();
    }
}