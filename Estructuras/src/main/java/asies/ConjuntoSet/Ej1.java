package asies.ConjuntoSet;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ej1 {

    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {

        Set<String> hola = new LinkedHashSet<>();
        System.out.print("Escribe una frase: ");

        String[] frase = ent.nextLine().split(" ");

        for (String a : frase) {
            hola.add(a.toLowerCase());
        }

        System.out.println("Palabras únicas: " + hola);

    }

}
