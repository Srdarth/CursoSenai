import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== BOLETIM DO ALUNO =====");

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota do teste: ");
        double nota2 = scanner.nextDouble();

        // 1. Calculamos a média
        double media = (nota1 + nota2) / 2;

        // 2. Criamos a variável que vai guardar a situação (vazia por enquanto)
        String situacao = "";

        // 3. O "if" apenas decide o texto que vai dentro da caixa 'situacao'
        if (media <= 5) {
            situacao = "Reprovado";
        }
        else if (media <= 6) {
            situacao = "Recuperação";
        }
        else {
            situacao = "Aprovado";
        }

        // 4. Mostramos tudo no final de uma vez só!
        System.out.println();
        System.out.println("===== RESULTADO =====");
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao); // Linha única de exibição!

        scanner.close();
    }
}
