package banco;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by caiomcg on 16/04/17.
 */
public class Banco {
    private Map<Conta, Cliente> contas;

    public Banco() {
        contas = new HashMap<>();
    }

    public void inserir(Conta conta, Cliente cliente) {
        this.contas.put(conta, cliente);
    }

    public Conta buscaConta(String numero) {
        return contas.entrySet().stream()
                .filter(accountClientEntry -> accountClientEntry.getKey().getNumber().equals(number))
                .findFirst()
                .get()
                .getKey();
    }

    public Cliente buscaCliente(String cpf) {
        return contas.entrySet().stream()
                .filter(accountClientEntry -> accountClientEntry.getValue().getCpf().equals(cpf))
                .findFirst()
                .get()
                .getValue();
    }

    public List<Conta> buscaContasDeUmCliente(String cpf) {
        return contas.entrySet().stream()
                .filter(accountClientEntry -> accountClientEntry.getValue().getCpf().equals(cpf))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
