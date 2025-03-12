package asies.Colas;

import java.util.Stack;

public class Ej3 {

    public static void main(String[] args) {

        Stack<String> pila = new Stack<>();

        String si = "((2+3)*(5-1))";

        for (String token : si.split("")) {
            if (token.equals("(")) {
                pila.push(token);
            } else if (token.equals(")")) {
                pila.push(token);
                if (pila.contains("(")){
                    pila.pop();
                    pila.pop();
                }
            }
        }

        if (pila.isEmpty()){
            System.out.println("Ta bien");
        } else {
            System.out.println("Ta mal");
        }

    }
}