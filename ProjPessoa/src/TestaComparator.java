import java.util.Set;
import java.util.TreeSet;

public class TestaComparator {

    public static void main(String[] args) {
        Set<Pessoa> set1 = new TreeSet<>(new ComparadorNome());
        Set<Pessoa> set2 = new TreeSet<>(new ComparadorData());

        Pessoa p1 = new Pessoa("111", "F", new Data(01, 01, 01));
        Pessoa p2 = new Pessoa("222", "E", new Data(01, 02, 02));
        Pessoa p3 = new Pessoa("333", "D", new Data(02, 03, 03));
        Pessoa p4 = new Pessoa("444", "C", new Data(03, 03, 04));
        Pessoa p5 = new Pessoa("555", "B", new Data(04, 04, 05));
        Pessoa p6 = new Pessoa("666", "A", new Data(05, 05, 05));

        set1.add(p5);
        set1.add(p1);
        set1.add(p4);
        set1.add(p3);
        set1.add(p2);
        set1.add(p6);

        set2.add(p5);
        set2.add(p1);
        set2.add(p4);
        set2.add(p3);
        set2.add(p2);
        set2.add(p6);

        System.out.println("---- Set1 - ComparadorNome ----");
        set1.forEach(System.out::println);

        System.out.println("---- Set2 - ComparadorData ----");
        set2.forEach(System.out::println);
    }
}
