import java.util.Random;
import java.util.Scanner;

public class jogo {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        Random Random = new Random();

        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {

            int numeroSorteado = Random.nextInt(10);

            System.out.print("Digite um numero entre 0 e 9: ");

            if (!Scanner.hasNextInt()) {
                System.out.println("Digite apenas números!");
                Scanner.next();
                continue;
            }

            int numeroUsuario = Scanner.nextInt();

            if (numeroUsuario < 0 || numeroUsuario > 9) {
                System.out.println("Digite somente números entre 0 e 9!");
                continue;
            }

            if (numeroUsuario == numeroSorteado) {

                System.out.println("Parabéns! Você acertou!");

            } else {

                System.out.println("Você errou!");
                System.out.println("O número era: " + numeroSorteado);

            }
System.out.print("Deseja jogar novamente? (S/N): ");
resposta = Scanner.next();

while (!resposta.equalsIgnoreCase("S") && 
       !resposta.equalsIgnoreCase("N")) {

    System.out.println("Opção inválida!");
    System.out.print("Digite apenas S ou N: ");
    resposta = Scanner.next();

}

        }

        System.out.println("FIM DE JOGO.");

        Scanner.close();

    }
}
