package asies.Diccionario;

import java.util.Scanner;

public class AppDiccionario {

    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {

        Diccionario d = new Diccionario();

        d.nuevoPar("Perro","Dog");
        d.nuevoPar("Mesa","Table");
        d.nuevoPar("Coche","Car");
        d.nuevoPar("Madre","Mom");
        d.nuevoPar("Hola","Hello");
        d.nuevoPar("Silla","Chair");

        double cont1 = 0;
        double cont2 = 0;
        double cont3 = 0;

        do{
            System.out.println();
            String p = d.palabraAleatoria();
            System.out.println(p + ": " + d.primeraLetraTraduccion(p) + "...");
            System.out.print("Indique la respuesta: ");
            String p2 = ent.next();
            if (p2.equalsIgnoreCase(d.traduce(p))){
                System.out.println("¡CORRECTO!");
                cont2++;
            }
            else if (p2.equalsIgnoreCase("fin")) {
                break;
            } else{
                System.out.println("¡NO! La respuesta correcta es " + d.traduce(p));
                cont3++;
            }
            cont1++;
        } while(true);

        System.out.println("\nFIN DEL PROGRAMA");
        System.out.println("Total preguntas: " + cont1);
        System.out.println("Total aciertos: " + cont2);
        System.out.println("Total errores: " + cont3);
        System.out.println("Aciertos: " + (cont2/cont1)*100 + "%");

    }

}
