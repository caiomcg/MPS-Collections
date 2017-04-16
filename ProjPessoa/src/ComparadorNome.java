import java.util.Comparator;

/**
 * Created by Marcelo on 16/04/2017.
 */
public class ComparadorNome implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
