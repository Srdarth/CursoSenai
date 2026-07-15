import java.util.Scanner;

public class MercadinhoAvancado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Nossos arrays de dados pré-cadastrados
        String[] produtos = { "Arroz", "Feijão", "Macarrão", "Leite", "Café", "Açúcar" };
        double[] precos = { 28.90, 8.50, 6.99, 5.80, 18.90, 4.50 };

        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n======== MERCADINHO ========");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Procurar produto");
            System.out.println("3 - Alterar preço");
            System.out.println("4 - Mostrar produto mais caro");
            System.out.println("5 - Mostrar produto mais barato");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    // 1 - LISTAR PRODUTOS
                    System.out.println("\n--- LISTA DE PRODUTOS ---");
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.printf("%d - %s - R$ %.2f\n", (i + 1), produtos[i], precos[i]);
                    }
                    break;

                case 2:
                    // 2 - PROCURAR PRODUTO
                    System.out.print("\nDigite o nome do produto: ");
                    String busca = leitor.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < produtos.length; i++) {
                        if (produtos[i].equalsIgnoreCase(busca)) {
                            System.out.printf("[Achado] %s - R$ %.2f\n", produtos[i], precos[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("[Erro] Produto não cadastrado.");
                    }
                    break;

                case 3:
                    // 3 - ALTERAR PREÇO
                    System.out.print("\nDigite o nome do produto que deseja alterar o preço: ");
                    String produtoAlterar = leitor.nextLine();
                    boolean alterado = false;

                    for (int i = 0; i < produtos.length; i++) {
                        if (produtos[i].equalsIgnoreCase(produtoAlterar)) {
                            System.out.printf("Preço atual de %s é R$ %.2f\n", produtos[i], precos[i]);
                            System.out.print("Digite o novo preço: R$ ");
                            double novoPreco = leitor.nextDouble();
                            leitor.nextLine(); // Limpa buffer

                            // Alterando o valor diretamente na "gaveta" do array!
                            precos[i] = novoPreco; 
                            
                            System.out.println("[Sucesso] Preço atualizado com sucesso!");
                            alterado = true;
                            break;
                        }
                    }
                    if (!alterado) {
                        System.out.println("[Erro] Produto não encontrado para alteração.");
                    }
                    break;

                case 4:
                    // 4 - MOSTRAR MAIS CARO
                    // Começamos assumindo que o primeiro produto (índice 0) é o mais caro
                    int indiceMaisCaro = 0;

                    // Comparamos com o resto do array (começando do índice 1)
                    for (int i = 1; i < precos.length; i++) {
                        if (precos[i] > precos[indiceMaisCaro]) {
                            indiceMaisCaro = i; // Atualizamos o índice do campeão de preço alto
                        }
                    }
                    System.out.printf("\nO produto mais caro é: %s (R$ %.2f)\n", 
                                      produtos[indiceMaisCaro], precos[indiceMaisCaro]);
                    break;

                case 5:
                    // 5 - MOSTRAR MAIS BARATO
                    // Mesma lógica, mas procurando o menor valor
                    int indiceMaisBarato = 0;

                    for (int i = 1; i < precos.length; i++) {
                        if (precos[i] < precos[indiceMaisBarato]) {
                            indiceMaisBarato = i; // Atualizamos o índice do campeão de preço baixo
                        }
                    }
                    System.out.printf("\nO produto mais barato é: %s (R$ %.2f)\n", 
                                      produtos[indiceMaisBarato], precos[indiceMaisBarato]);
                    break;

                case 6:
                    System.out.println("\nSaindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }
        }
        leitor.close();
    }
}
