package asies.Pilas;

import java.util.Stack;

public class Ej3 {

    static java.util.Scanner ent;

    public static boolean casoDePrueba() {
        if (!ent.hasNext())
            return false;
        else {
            Stack<String> pila = new Stack<>();

            String si = ent.nextLine();

            for (String token : si.split("")) {
                if (token.equals("(") || token.equals("[") || token.equals("{")) {
                    pila.push(token);
                } else if (token.equals(")")) {
                    pila.push(token);
                    if (pila.contains("(")){
                        pila.pop();
                        pila.pop();
                    }
                }else if (token.equals("]")) {
                    pila.push(token);
                    if (pila.contains("[")){
                        pila.pop();
                        pila.pop();
                    }
                }else if (token.equals("}")) {
                    pila.push(token);
                    if (pila.contains("{")){
                        pila.pop();
                        pila.pop();
                    }
                }
            }

            if (pila.isEmpty()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return true;
        }
    }

    public static void main(String[] args) {
        ent = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}