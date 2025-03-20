package asies.Pilas;

import java.util.Scanner;
import java.util.Stack;

public class Ej2 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        Stack<Integer> pila = new Stack<>();

        System.out.print("Introduce el primer número: ");
        pila.push(ent.nextInt());
        System.out.print("Introduce el segundo número: ");
        pila.push(ent.nextInt());
        System.out.print("Introduce el tercer número: ");
        pila.push(ent.nextInt());

        System.out.println("Números en order inverso:");
        while(!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

    }

}
