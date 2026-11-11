package entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else
            System.out.println("Preço não pode ser negativo!");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarEstoque(int qtd) {
        quantidadeEstoque += qtd;
    }

    public void removerEstoque(int qtd) {
        if (quantidadeEstoque >= qtd) {
            quantidadeEstoque -= qtd;
        } else
            System.out.println("A quantidade solicitada para retirada é maior que a quantidade em estoque");
    }

    public double calcularValorTotalEstoque() {
        return preco * quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto: " + nome +
                " | Preco: " + preco +
                " | Estoque=" + quantidadeEstoque +
                " | Valor Total: " + calcularValorTotalEstoque();
    }
}
