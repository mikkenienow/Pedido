package atividadeSupermercado;

public class itemDePedido {

    private Produto produto;
    private int quantidade;

    public itemDePedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    Produto getProduto() {
        return produto;
    }

    void setProduto(Produto produto) {
        this.produto = produto;
    }

    int getQuantidade() {
        return quantidade;
    }

    void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
