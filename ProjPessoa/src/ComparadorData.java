import java.util.Comparator;

/**
 * Created by Marcelo on 16/04/2017.
 */
public class ComparadorData implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getData_nascimento().compareTo(o2.getData_nascimento());
    }
}
