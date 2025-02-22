//Escribe un programa que utilice una lista (ArrayList), un conjunto (HashSet) y un mapa (HashMap)
//para almacenar una serie de valores y luego realice operaciones sobre ellos (añadir, buscar, eliminar).


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EjercicioCollections {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("uno");
        lista.add("dos");
        lista.add("tres");

        System.out.println(lista);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.indexOf("uno"));

        System.out.println();

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("uno");
        arrayList.add("dos");
        arrayList.add("tres");

        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("dos"));

        System.out.println();

        //Hashmap works like a pythong dictionary, it is a map that stores key-value pairs.
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("uno", "1");
        mapa.put("dos", "2");
        mapa.put("tres", "3");
        System.out.println(mapa.get("uno"));

        System.out.println();

        HashSet<String> set = new HashSet<>();
        set.add("uno");
        set.add("dos");
        set.add("tres");
        set.add("uno");
        set.add("dos");
        set.add("tres");

        System.out.println(set);
        System.out.println(set.size());
        for (String item : set) {
            System.out.println(item);
        }
    }
}
