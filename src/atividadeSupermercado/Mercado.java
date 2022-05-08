package atividadeSupermercado;

public class Mercado {

    /**
     * Um supermercado vende diferentes tipos de produtos. Cada produto tem um
     * preço e uma quantidade em estoque. Um pedido de um cliente é composto por
     * vários produtos. O pedido pode ser pago em dinheiro, cheque ou cartão.
     *
     * @param args
     */

    public static void main(String[] args) {
        Produto produtoLaranja = new Produto(01, "Laranja", 2.0, 300);
        Produto produtoMaca = new Produto(02, "Maças", 3, 200);
        Produto produtoLeite = new Produto(03, "Leite Integral", 3.5, 500);
        
        Cliente clienteMikke = new Cliente("Mikke Nienow",1);

        Pedido Pedido01 = new Pedido(clienteMikke, 1, "Dinheiro");
        Pedido01.inserirPedido(produtoLaranja, 5);
        Pedido01.inserirPedido(produtoMaca, 10);
        Pedido01.inserirPedido(produtoLeite, 12);

        Pedido01.listarPedidos();

        System.out.println("Total das compras: R$ " + Pedido01.valorTotal());

        System.out.println("Total de laranjas restantes " + produtoLaranja.getQuantidade());
        System.out.println("Total de caixas de leite restantes " + produtoLeite.getQuantidade());
        System.out.println("Total de maças restantes " + produtoMaca.getQuantidade());
        System.out.println("Total de maças restantes " + produtoMaca.getQuantidade());

    }
}
