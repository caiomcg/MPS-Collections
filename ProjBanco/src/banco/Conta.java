package banco;

/**
 * Created by caiomcg on 16/04/17.
 */
public class Conta {
    private String numero;
    private double saldo;

    public Conta() {
        this("777", 77.0);
    }

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo  = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta: {\"numero\" : " + numero + ", \"saldo\" : " + saldo + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conta account = (Conta) o;

        return numero.equals(account.numero);
    }

    @Override
    public int hashCode() {
        return numero.hashCode();
    }
}
