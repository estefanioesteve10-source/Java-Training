import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Set<String> hash = new HashSet<>();
        Set<String> linked = new LinkedHashSet<>();
        Set<String> tree = new TreeSet<>();

        List.of("Banana", "Maçã", "Abacaxi").forEach(fruta -> {
            hash.add(fruta);
            linked.add(fruta);
            tree.add(fruta);
        });

        System.out.println("HashSet: " + hash);      // Saída provável: [Maçã, Abacaxi, Banana]
        System.out.println("Linked: " + linked);     // Saída: [Banana, Maçã, Abacaxi] (Ordem de inserção)
        System.out.println("TreeSet: " + tree);      // Saída: [Abacaxi, Banana, Maçã] (Ordem alfabética)
    }
}