package app;

import service.ProdutoService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProdutoService service = new ProdutoService();

        int opcao;

        do {
            System.out.println("===== SISTEMA DE PRODUTOS =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();

                    service.cadastrarProduto(nome, preco, quantidade);
                    System.out.println("Produto cadastrado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("\n=== LISTA DE PRODUTOS ===");
                    service.listarProdutos();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
            }

        } while (opcao != 0);

        scanner.close();
    }
}