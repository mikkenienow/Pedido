package atividadeSupermercado;

public class Cliente {

    private String nome;
    private int codCliente;

    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    int getCodCliente() {
        return this.codCliente;
    }

    void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    void cadastrar(String nomeCadasto, int codigoCadastro) {
        this.nome = nomeCadasto;
        this.codCliente = codigoCadastro;
    }
}
