package banco;

/**
 * Created by caiomcg on 16/04/17.
 */
public class Cliente {
    private String nome;
    private String cpf;

    public Cliente() {
        nome = "Nome e Sobrenome";
        cpf  = "111.111.111-77";
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf  = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente: {\"nome\" : " + nome + ", \"cpf\" : " + cpf + "}";
    }
}
