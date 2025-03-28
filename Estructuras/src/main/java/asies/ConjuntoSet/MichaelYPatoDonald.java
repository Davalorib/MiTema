package asies.ConjuntoSet;

import java.util.Set;
import java.util.TreeSet;

public class MichaelYPatoDonald {

    static java.util.Scanner ent;

    public static boolean casoDePrueba() {
        int a = ent.nextInt();
        if (a==0){
            return false;
        } else {
            Set<String> cumples = new TreeSet<>();
            boolean si = false;
            for (int i = 0; i < a; i++) {
                String[] fecha = ent.next().split("/");
                if (cumples.contains(fecha[0] + " " + fecha[1])) {
                    si = true;
                    ent.nextLine();
                    break;
                }else {
                    cumples.add( fecha[0] + " " + fecha[1] );
                }
            }
            System.out.println((si) ? "SI" : "NO");
            return true;
        }
    }

    public static void main(String[] args) {
        ent = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
