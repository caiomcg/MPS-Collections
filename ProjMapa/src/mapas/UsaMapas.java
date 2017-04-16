package mapas;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by caiomcg on 16/04/17.
 */
public class UsaMapas {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        TreeMap<String, String> treeUsers = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        users.put("ronaldo", "123");
        users.put("romario", "1234");
        users.put("roberto", "12345");

        treeUsers.put("ronaldo", "123");
        treeUsers.put("romario", "1234");
        treeUsers.put("roberto", "12345");

        System.out.println(users.toString());
        System.out.println(treeUsers.toString());
    }
}
