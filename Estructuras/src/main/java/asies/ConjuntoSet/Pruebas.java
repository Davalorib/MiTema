package asies.ConjuntoSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pruebas {

    public static void main(String[] args) {

        Set<String> conjunto = new HashSet<>();

        conjunto.add("Hola1");
        conjunto.add("Hola2");
        conjunto.add("Hola3");
        conjunto.add("Hola4");
        conjunto.add("Hola2");

        System.out.println(conjunto);

        conjunto.add("Hola5");
        System.out.println(conjunto);


        Set<Integer> conjunto2 = new LinkedHashSet<>();

        conjunto2.add(3);
        conjunto2.add(2);
        conjunto2.add(1);
        conjunto2.add(4);
        conjunto2.add(3);
        conjunto2.add(5);

        System.out.println(conjunto2);

        Set<Integer> conjunto3 = new TreeSet<>();

        conjunto3.add(3);
        conjunto3.add(2);
        conjunto3.add(1);
        conjunto3.add(4);
        conjunto3.add(3);
        conjunto3.add(5);

        System.out.println(conjunto3);

    }

}
