import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Esta variável controla se o programa continua rodando ou fecha
        boolean rodando = true;

        System.out.println("=== BEM-VINDO À SUA CALCULADORA COMPLETA ===");

        // O 'while' vai repetir tudo o que está aqui dentro enquanto 'rodando' for true
        while (rodando) {

            System.out.println("\n=== Escolha a Operação ===");
            System.out.println("1 - Soma (+)");
            System.out.println("2 - Subtração (-)");
            System.out.println("3 - Multiplicação (*)");
            System.out.println("4 - Divisão (/)");
            System.out.println("5 - Resto da Divisão (%)");
            System.out.println("0 - Sair do Programa");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            // Se o usuário digitar 0, nós desligamos o programa imediatamente
            if (opcao == 0) {
                System.out.println("Obrigado por usar a calculadora. Até logo!");
                rodando = false; // Isso faz o 'while' parar na próxima verificação!
                continue; // ***** o resto do código e volta para o teste do while
            }

            // Se o usuário digitar algo inválido (menor que 0 ou maior que 5)
            if (opcao < 0 || opcao > 5) {
                System.out.println("Opção inválida! Tente novamente.");
                continue; // ***** o resto do código e mostra o menu de novo
            }

            // Se a opção for válida e diferente de zero, pedimos os números:
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;
            String operacao = "";
            boolean calculoValido = true; // Ajuda a saber se o cálculo deu certo

            if (opcao == 1) {
                resultado = num1 + num2;
                operacao = "soma";
            } 
            else if (opcao == 2) {
                resultado = num1 - num2;
                operacao = "subtração";
            } 
            else if (opcao == 3) {
                resultado = num1 * num2;
                operacao = "multiplicação";
            } 
            else if (opcao == 4) {
                if (num2 == 0) {
                    System.out.println("Erro: Não é possível dividir por zero!");
                    calculoValido = false;
                } else {
                    resultado = num1 / num2;
                    operacao = "divisão";
                }
            } 
            else if (opcao == 5) {
                if (num2 == 0) {
                    System.out.println("Erro: Não é possível calcular o resto com divisão por zero!");
                    calculoValido = false;
                } else {
                    resultado = num1 % num2; // O operador % pega o resto da divisão
                    operacao = "resto da divisão";
                }
            }

            // Só mostramos o resultado se o cálculo tiver sido válido (ex: sem divisão por zero)
            if (calculoValido) {
                System.out.println("\n-------------------------------------");
                System.out.println("Resultado da " + operacao + ": " + resultado);
                System.out.println("-------------------------------------");
            }
        }

        scanner.close();
    }
}
