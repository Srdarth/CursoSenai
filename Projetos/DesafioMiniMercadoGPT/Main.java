import java.util.Scanner;

public class MiniMercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] produtos = {"Arroz", "Feijão", "Macarrão", "Café", "Açúcar", "Óleo", "Sal", "Leite", "Farinha", "Manteiga"};
        double[] precos = {25.50, 8.90, 5.50, 12.00, 4.50, 7.20, 3.00, 6.00, 5.00, 9.50};

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n========= MERCADO =========");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Buscar produto");
            System.out.println("3 - Mostrar produtos pares");
            System.out.println("4 - Mostrar produtos ímpares");
            System.out.println("5 - Calcular valor médio");
            System.out.println("6 - Produto mais caro");
            System.out.println("7 - Produto mais barato");
            System.out.println("8 - Aplicar desconto de 10%");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println((i + 1) + " - " + produtos[i] + " - R$ " + precos[i]);
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome ou o índice do produto: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < produtos.length; i++) {
                        // Verifica se o primeiro caractere é dígito (índice)
                        if (Character.isDigit(busca.charAt(0))) {
                            if (Integer.parseInt(busca) == (i + 1)) {
                                System.out.println(produtos[i] + " - R$ " + precos[i]);
                                encontrado = true;
                            }
                        } else if (produtos[i].equalsIgnoreCase(busca)) {
                            System.out.println(produtos[i] + " - R$ " + precos[i]);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("Produto não encontrado.");
                    break;

                case 3:
                    for (int i = 0; i < produtos.length; i++) {
                        if ((i + 1) % 2 == 0) System.out.println(produtos[i]);
                    }
                    break;

                case 4:
                    for (int i = 0; i < produtos.length; i++) {
                        if ((i + 1) % 2 != 0) System.out.println(produtos[i]);
                    }
                    break;

                case 5:
                    double soma = 0;
                    for (double p : precos) soma += p;
                    System.out.println("Preço médio: R$ " + (soma / precos.length));
                    break;

                case 6:
                    int maisCaroIdx = 0;
                    for (int i = 1; i < precos.length; i++) {
                        if (precos[i] > precos[maisCaroIdx]) maisCaroIdx = i;
                    }
                    System.out.println("Produto: " + produtos[maisCaroIdx] + " | Preço: R$ " + precos[maisCaroIdx]);
                    break;

                case 7:
                    int maisBaratoIdx = 0;
                    for (int i = 1; i < precos.length; i++) {
                        if (precos[i] < precos[maisBaratoIdx]) maisBaratoIdx = i;
                    }
                    System.out.println("Produto: " + produtos[maisBaratoIdx] + " | Preço: R$ " + precos[maisBaratoIdx]);
                    break;

                case 8:
                    for (int i = 0; i < precos.length; i++) {
                        precos[i] -= (precos[i] * 0.10);
                    }
                    System.out.println("Desconto aplicado com sucesso!");
                    break;
            }
        }
        scanner.close();
    }
}
