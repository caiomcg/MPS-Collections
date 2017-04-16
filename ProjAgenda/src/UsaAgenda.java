import agenda.Agenda;
import agenda.Pessoa;

import java.util.ArrayList;

public class UsaAgenda {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.inserePessoa(new Pessoa("Caio", "123", "Rua: teste"));
        agenda.inserePessoa(new Pessoa("Marcelo", "123", "Rua: teste"));
        agenda.inserePessoa(new Pessoa("Wesnydy", "123", "Rua: teste"));
        agenda.inserePessoa(new Pessoa("Raoni", "123", "Rua: teste"));
        agenda.inserePessoa(new Pessoa("Júlia", "123", "Rua: teste"));
        agenda.inserePessoa(new Pessoa("Jaqueline", "123", "Rua: teste"));

        ArrayList<String> nomes = agenda.listarNomes();

        System.out.println(nomes.toString() + "\n");

        for (String nome : nomes) {
            System.out.println(agenda.buscaPessoa(nome));
        }

        System.out.println("\n" + agenda.buscaPessoa("Caio"));

    }
}
