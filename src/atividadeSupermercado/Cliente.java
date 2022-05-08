package atividadeSupermercado;

public class Cliente {

    private String nome;
    private int codCliente;

    public Cliente(String nome, int codCliente) {
        if (nome == null) {
            throw new IllegalArgumentException("Valor para nome = 'null'");
        }
        if (nome.equals("")) {
            throw new IllegalArgumentException("Valor para nome em branco.");
        } else {
            this.nome = nome;
        }
        this.codCliente = codCliente;
    }

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
}
