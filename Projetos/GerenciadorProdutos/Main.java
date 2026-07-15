import java.util.Scanner;

public class GerenciadorProdutos {
    public static void main(String[] args) {
        // O Scanner serve para ler o que o usuário digita no teclado
        Scanner leitor = new Scanner(System.in);

        // Criamos nossos dois arrays com capacidade para exatamente 6 itens
        String[] nomes = new String[6];
        double[] precos = new double[6];

        System.out.println("=== CADASTRO DE PRODUTOS ===");

        // 1. Usamos um loop 'for' para repetir a leitura 6 vezes (de 0 a 5)
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º produto: ");
            nomes[i] = leitor.nextLine();

            System.out.print("Digite o preço do " + (i + 1) + "º produto: ");
            precos[i] = leitor.nextDouble();
            
            // Esse comando limpa o teclado para que o próximo 'nextLine' funcione sem bugs
            leitor.nextLine(); 
            System.out.println("---------------------------------");
        }

        // 2. Menu de opções para o usuário escolher o que quer ver
        System.out.println("\nO que você deseja fazer?");
        System.out.println("1 - Listar TODOS os produtos");
        System.out.println("2 - Ver um produto ESPECÍFICO");
        System.out.print("Sua opção: ");
        int opcao = leitor.nextInt();

        // 3. Processando a escolha do usuário
        if (opcao == 1) {
            System.out.println("\n=== LISTA DE TODOS OS PRODUTOS ===");
            for (int i = 0; i < 6; i++) {
                // O %.2f serve para mostrar o preço com apenas 2 casas decimais
                System.out.printf("Produto: %s - Preço: R$ %.2f\n", nomes[i], precos[i]);
            }
        } 
        else if (opcao == 2) {
            System.out.print("\nDigite o número do produto que deseja ver (de 1 a 6): ");
            int posicaoDesejada = leitor.nextInt();

            // Proteção: o usuário digita de 1 a 6, mas nosso array vai de 0 a 5!
            if (posicaoDesejada >= 1 && posicaoDesejada <= 6) {
                int indiceReal = posicaoDesejada - 1; // Ajustamos para o índice do Java
                System.out.printf("\n[Produto %d] Nome: %s | Preço: R$ %.2f\n", 
                                  posicaoDesejada, nomes[indiceReal], precos[indiceReal]);
            } else {
                System.out.println("Posição inválida! Escolha um número de 1 a 6.");
            }
        } 
        else {
            System.out.println("Opção inválida!");
        }

        leitor.close(); // Fechamos o leitor para economizar memória do computador
    }
}
