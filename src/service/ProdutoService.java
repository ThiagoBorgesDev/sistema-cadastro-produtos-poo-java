package service;

import model.Produto;
import repository.ProdutoRepository;

public class ProdutoService {

    private ProdutoRepository repository = new ProdutoRepository();

    // Cadastrar produto
    public void cadastrarProduto(String nome, double preco, int quantidade) {

        if (nome == null || nome.isEmpty()) {
            System.out.println("Erro: nome não pode ser vazio!");
            return;
        }

        if (preco < 0) {
            System.out.println("Erro: preço não pode ser negativo!");
            return;
        }

        if (quantidade < 0) {
            System.out.println("Erro: quantidade não pode ser negativa!");
            return;
        }

        Produto produto = new Produto(nome, preco, quantidade);
        repository.salvar(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }

    // Listar produtos
    public void listarProdutos() {

        if (repository.listar().isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (Produto p : repository.listar()) {
            p.exibir();
        }
    }
}