package asies.ConjuntoSet;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ej3 {

    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {

        Set<String> hola = new LinkedHashSet<>();

        while (true) {
            System.out.print("Escribe una URL visitada (o 'salir' para terminar): ");
            String a = ent.next();
            if (a.equals("salir")) {
                break;
            }
            hola.add(a);
        }

        int cont = 0;
        for (String c : hola) {
            System.out.println(++cont + ". " + c);
        }
    }

}
