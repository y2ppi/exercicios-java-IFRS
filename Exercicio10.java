import java.util.*;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pes;
        double polegadas, jardas, milhas;
        System.out.println("insira a medida em pes: ");
        pes = sc.nextInt();

        polegadas = (pes*12);
        jardas = (pes*3);
        milhas = (pes*5.280);

        System.out.print("polegadas: " + polegadas);
        System.out.print("jardas: " + jardas);
        System.out.printf("milhas: %.5f", milhas);

        sc.close();
    }
}