public class Main {
    public static void main(String [] args){
        Set<String> hash = new HashSet<>();
        Set<String> linked = new LinkedHashSet<>();
        Set<String> tree = new TreeSet<>();

        List.of("Banana", "Maçã", "Abacaxi").forEach(fruta -> {
            hash.add(fruta);
            linked.add(fruta);

            System.out.println("HashSet: " + hash);      // Saída provável: [Maçã, Abacaxi, Banana]
            System.out.println("Linked: " + linked);     // Saída: [Banana, Maçã, Abacaxi] (Ordem de inserção)
            System.outree.add(fruta);
        });.println("TreeSet: " + tree);      // Saída: [Abacaxi, Banana, Maçã] (Ordem alfabética)
    }
}

