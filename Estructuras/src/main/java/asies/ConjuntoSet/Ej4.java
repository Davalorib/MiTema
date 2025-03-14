package asies.ConjuntoSet;

import java.util.Set;
import java.util.TreeSet;

public class Ej4 {

    public static void main(String[] args) {

        Set<Integer> conjunto = new TreeSet<>();
        Set<Integer> conjunto2 = new TreeSet<>();

        conjunto.add(5);
        conjunto.add(8);
        conjunto.add(1);
        conjunto.add(15);

        conjunto2.add(14);
        conjunto2.add(6);
        conjunto2.add(2);
        conjunto2.add(5);
        conjunto2.add(12);

        mezclados(conjunto, conjunto2);
    }

    static public void mezclados(Set<Integer> a, Set<Integer> b) {

        int aint = a.size();
        int bint = b.size()+a.size();

        Set<Integer> conjunto3 = new TreeSet<>();

        for (Integer bla : a) {
            conjunto3.add(bla);
        }
        for (Integer bla : b) {
            conjunto3.add(bla);
        }

        System.out.println(conjunto3);

    }

}
