package atividadeSupermercado;

import java.util.ArrayList;

public class Pedido {
    private itemDePedido itemPedido = new itemDePedido();
    private Cliente cliente;
    private int nPedido;
    private String pagamento;
    private ArrayList<itemDePedido> listaItemPedido = new ArrayList<>();

    public itemDePedido getItemPedido() {
        return this.itemPedido;
    }

    void setItemPedido(itemDePedido itemPedido) {
        this.itemPedido = itemPedido;
    }

    Cliente getCliente() {
        return this.cliente;
    }

    void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    int getnPedido() {
        return this.nPedido;
    }

    void setnPedido(int nPedido) {
        this.nPedido = nPedido;
    }

    String getPagamento() {
        return this.pagamento;
    }

    void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public ArrayList<itemDePedido> getListaItemPedido() {
        return this.listaItemPedido;
    }

    void setListaItemPedido(ArrayList<itemDePedido> listaItemPedido) {
        this.listaItemPedido = listaItemPedido;
    }
    
    double valorTotal(){
    double totalFinal=0;
        for (int i=0 ; i < this.listaItemPedido.size();i++){
            itemDePedido pedido;
            double totalPorItem=0;
            pedido = this.listaItemPedido.get(i);
            totalPorItem = pedido.getQuantidade()*pedido.getProduto().getPreco();
            totalFinal = totalFinal + totalPorItem;
        }
    return totalFinal;
    }
    
    void listarPedidos(){
            for (int i=0 ; i < this.listaItemPedido.size();i++){
            itemDePedido pedido;
            double totalPorItem=0;
            pedido = this.listaItemPedido.get(i);
            System.out.println(i+" - "+pedido.getProduto().getDescricao()+" - "+pedido.getQuantidade()+" Preço un. R$: "+pedido.getProduto().getPreco());
            }
    }
    
    void inserirPedido(Produto produtoId, int quantidade){
        itemDePedido itemPedido = new itemDePedido();
        itemPedido.setProduto(produtoId);
        itemPedido.setQuantidade(quantidade);
        produtoId.diminuirEstoque(quantidade);
        this.listaItemPedido.add(itemPedido);
    }
    
    
    
}
