package banco;

/**
 * Created by caiomcg on 16/04/17.
 */
public class Cliente {
    private String nome;
    private String cpf;

    public Cliente() {
        this("111.111.111-77", "Nome e Sobrenome");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return cpf.equals(cliente.cpf);
    }

    @Override
    public int hashCode() {
        int result = cpf.hashCode();
        result = 31 * result + nome.hashCode();
        return result;
    }
}
