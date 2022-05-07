package atividadeSupermercado;

public class Produto {

    private int codProduto;
    private String descricao;
    private double preco;
    private int quantidade;

    void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    void setPreco(double preco) {
        this.preco = preco;
    }

    void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    int getCodProduto() {
        return this.codProduto;
    }

    String getDescricao() {
        return this.descricao;
    }

    double getPreco() {
        return this.preco;
    }

    int getQuantidade() {
        return this.quantidade;
    }
    
    void cadastrarProduto(int codProduto, String descricao, double preco, int quantidade) {
        setCodProduto(codProduto);
        setDescricao(descricao);
        setPreco(preco);
        setQuantidade(quantidade);
        System.out.println("Produto " + descricao + " cadastrado!");
    }

    void ajustarEstoque(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    void diminuirEstoque(int total) {
        this.quantidade = this.quantidade - total;
    }
}