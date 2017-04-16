package banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by caiomcg on 16/04/17.
 */
public class Banco {
    private Map<Cliente, ArrayList<Conta>> contas;

    public Banco() {
        contas = new HashMap<>();
    }

    public void inserir(Conta conta, Cliente cliente) {
        ArrayList<Conta> userAccounts = buscaContasDeUmCliente(cliente.getCpf());
        if (buscaConta(conta.getNumero()) == null) {
            userAccounts.add(conta);
        }
        contas.put(cliente, userAccounts);
    }

    public Conta buscaConta(String numero) {
        for (Map.Entry<Cliente, ArrayList<Conta>> entry : contas.entrySet()) {
            for (Conta conta : entry.getValue()) {
                if (conta.getNumero().equals(numero)) {
                    return conta;
                }
            }
        }
        return null;
    }

    public Cliente buscaCliente(String cpf) {
        for (Map.Entry<Cliente, ArrayList<Conta>> entry : contas.entrySet()) {
            if (entry.getKey().getCpf().equals(cpf)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public ArrayList<Conta> buscaContasDeUmCliente(String cpf) {
        Cliente findClient = this.buscaCliente(cpf);
        if (findClient != null) {
            return contas.get(findClient);
        }
        return new ArrayList<>();
    }
}
