package agenda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by caiomcg on 16/04/17.
 */
public class Agenda {
    private Map<String, Pessoa> contatos;

    public Agenda() {
        contatos = new HashMap<>();
    }

    public Pessoa buscaPessoa(String nome) {
        return this.contatos.get(nome);
    }

    public void inserePessoa(Pessoa pessoa) {
        contatos.put(pessoa.getNome(), pessoa);
    }

    public ArrayList<String> listarNomes() {
        ArrayList<String> nomes = new ArrayList<>();

        for (Map.Entry<String, Pessoa> entry : contatos.entrySet()) {
            nomes.add(entry.getKey());
        }

        return nomes;
    }

    public List<Pessoa> listarPessoas() {
        return contatos.entrySet().stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }
}
