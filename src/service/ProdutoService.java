package app;

import service.ProdutoService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProdutoService service = new ProdutoService();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE PRODUTOS =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Atualizar produto");
            System.out.println("5 - Remover produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();

                    service.cadastrarProduto(nome, preco, quantidade);
                    break;

                case 2:
                    service.listarProdutos();
                    break;

                case 3:
                    System.out.print("Nome do produto: ");
                    service.buscarProduto(scanner.nextLine());
                    break;

                case 4:
                    System.out.print("Nome do produto: ");
                    String nomeAtualizar = scanner.nextLine();

                    System.out.print("Novo preço: ");
                    double novoPreco = scanner.nextDouble();

                    System.out.print("Nova quantidade: ");
                    int novaQtd = scanner.nextInt();

                    service.atualizarProduto(nomeAtualizar, novoPreco, novaQtd);
                    break;

                case 5:
                    System.out.print("Nome do produto: ");
                    service.removerProduto(scanner.nextLine());
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}