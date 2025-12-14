package notas;

import java.util.Scanner;
import java.util.Arrays;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas? ");
        int qtdeNotas = entrada.nextInt();
        double[] notas = new double[qtdeNotas];

        for (int n = 0; n < notas.length; n++) {
            
            System.out.println("Informe a nota " + (n + 1) + ": ");
            String entradaNota = entrada.next();
            entradaNota = entradaNota.replace(",", ".");

            double nota = Double.parseDouble(entradaNota);

            if (nota >= 0 && nota <= 10) {
                notas[n] = nota;

            } else {
                System.out.println("Digite uma nota entre 0 e 10!");
            }

        }

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("");
        System.out.printf("A média é %.2f \n ", media);
        System.out.println("");
        System.out.println(Arrays.toString(notas));
        System.out.println("");

        entrada.close();

    }

}
