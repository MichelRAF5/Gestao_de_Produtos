package application;

import entities.Produto;

public class GestaoProdutos {
    static void main(String[] args) {
        Produto produto = new Produto("Teclado Mecânico", 250.0, 15);

        System.out.println(produto);
        produto.adicionarEstoque(5);
        produto.setPreco(-50);
        produto.removerEstoque(2);
        System.out.println(produto);
    }
}
