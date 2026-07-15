import java.util.Random;
import java.util.Scanner;

public class JogoDoAluno {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        boolean jogar = true;

        while (jogar) {

            System.out.print("Escolha um número de 0 a 10: ");
            int numeroUsuario = entrada.nextInt();

            int numeroSorteado = random.nextInt(11);

            if (numeroUsuario == numeroSorteado) {
                System.out.println("🎉 Parabéns! Você acertou!");
                jogar = false;
            } else {
                System.out.println("Você errou! O número era " + numeroSorteado);

                System.out.print("Deseja tentar novamente? (S/N): ");
                String resposta = entrada.next();

                if (resposta.equalsIgnoreCase("N")) {
                    jogar = false;
                }
            }
        }

        System.out.println("Fim do jogo!");
        entrada.close();
    }
}
