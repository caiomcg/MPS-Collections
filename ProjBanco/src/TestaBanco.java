import banco.Banco;
import banco.Cliente;
import banco.Conta;

import java.util.ArrayList;

public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.inserir(new Conta("123", 22.0), new Cliente("Caio Marcelo", "123"));
        banco.inserir(new Conta("1232", 22.0), new Cliente("Caio Marcelo", "123"));
        banco.inserir(new Conta("1234", 22.0), new Cliente("Marcelo Aguiar", "1234"));
        banco.inserir(new Conta("123451", 22.0), new Cliente("Wesnydy Ribeiro", "12345"));
        banco.inserir(new Conta("123452", 22.0), new Cliente("Wesnydy Ribeiro", "12345"));
        banco.inserir(new Conta("123453", 22.0), new Cliente("Wesnydy Ribeiro", "12345"));

        Cliente cliente  = banco.buscaCliente("123");
        Cliente cliente2 = banco.buscaCliente("1234");
        Cliente cliente3 = banco.buscaCliente("12345");

        if (cliente != null) {
            System.out.println(cliente.toString());
            ArrayList<Conta> contas = banco.buscaContasDeUmCliente(cliente.getCpf());
            System.out.println(contas.toString());
        }
        if (cliente2 != null) {
            System.out.println(cliente2.toString());
            ArrayList<Conta> contas = banco.buscaContasDeUmCliente(cliente2.getCpf());
            System.out.println(contas.toString());
        }
        if (cliente3 != null) {
            System.out.println(cliente3.toString());
            ArrayList<Conta> contas = banco.buscaContasDeUmCliente(cliente3.getCpf());
            System.out.println(contas.toString());
        }

    }
}
