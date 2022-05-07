package atividadeSupermercado;

public class itemDePedido {

    private Produto produto;
    private int quantidade;

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
