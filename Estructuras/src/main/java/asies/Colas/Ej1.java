package asies.Colas;

import java.util.Stack;

public class Ej1 {

    public static void main(String[] args) {

        Stack<String> pila = new Stack<>();

        pila.push("a");
        pila.push("e");
        pila.push("i");
        pila.push("o");
        pila.push("u");

        System.out.println(pila.isEmpty());
        System.out.println(pila.size());
        System.out.println(pila.peek());

        while(!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

    }

}
