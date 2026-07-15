import java.util.Scanner;

public class Mercadinho {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] produtos = {
            "Arroz",
            "Feijão",
            "Macarrão",
            "Leite",
            "Café",
            "Açúcar"
        };

        double[] precos = {
            28.90,
            8.50,
            6.99,
            5.80,
            18.90,
            4.50
        };

        System.out.println("===== LISTA DE PRODUTOS =====");
        System.out.println("1 - Mostrar todos");
        System.out.println("2 - Mostrar produtos pares");
        System.out.println("3 - Mostrar produtos ímpares");

        System.out.print("Escolha uma opção: ");
        int opcao = leitor.nextInt();

        System.out.println("\n===== PRODUTOS =====");

        for(int i = 0; i < produtos.length; i++) {

            int numeroProduto = i + 1;

            if(opcao == 1) {
                System.out.println(
                    numeroProduto + " - " + produtos[i] + " - R$ " + precos[i]
                );
            }

            else if(opcao == 2 && numeroProduto % 2 == 0) {
                System.out.println(
                    numeroProduto + " - " + produtos[i] + " - R$ " + precos[i]
                );
            }

            else if(opcao == 3 && numeroProduto % 2 != 0) {
                System.out.println(
                    numeroProduto + " - " + produtos[i] + " - R$ " + precos[i]
                );
            }
        }

        // ====================================================================
        // NOVA SELEÇÃO DE PRODUTO (ACEITA NÚMERO OU NOME)
        // ====================================================================
        System.out.print("\nDigite o número ou nome do produto para consultar: ");
        String busca = leitor.next(); // Lê a entrada como texto (String)

        int indice = -1; // -1 indica que o produto ainda não foi encontrado

        // 1. O usuário digitou um número? (Verifica se o primeiro caractere é um dígito)
        if (Character.isDigit(busca.charAt(0))) {
            int escolha = Integer.parseInt(busca); // Converte o texto "4" no número 4
            indice = escolha - 1; // Ajusta para o índice do array (0 a 5)
        } 
        // 2. Se não digitou número, busca pelo nome no array de produtos
        else {
            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i].equalsIgnoreCase(busca)) {
                    indice = i; // Encontrou o produto no índice i
                    break;
                }
            }
        }

        // 3. Exibe o resultado de forma limpa
        System.out.println("\n===== PRODUTO ESCOLHIDO =====");
        if (indice >= 0 && indice < produtos.length) {
            System.out.println("Nome: " + produtos[indice]);
            System.out.println("Preço: R$ " + precos[indice]);
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }

        leitor.close();
    }
}
