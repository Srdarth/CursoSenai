import java.util.Scanner;

public class MiniTabuadaFacil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String[] nomes = {
            "um",
            "dois",
            "três",
            "quatro",
            "cinco",
            "seis",
            "sete",
            "oito",
            "nove",
            "dez"
        };

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i] + " - " + nomes[i]);

        }

        System.out.println("--------------------");

        System.out.print("Escolha um número de 1 a 10: ");
        int escolha = scanner.nextInt();

        if (escolha < 1 || escolha > 10) {

            System.out.println("Número inválido!");

        } else {

            System.out.println("\nTabuada do " + escolha);

            for (int i = 1; i <= 10; i++) {

                int resultado = escolha * i;

                System.out.println(escolha + " x " + i + " = " + resultado);

            }

        }


        scanner.close();

    }
}
