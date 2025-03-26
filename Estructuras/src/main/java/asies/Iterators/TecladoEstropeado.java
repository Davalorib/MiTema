package asies.Iterators;

import java.util.LinkedList;
import java.util.ListIterator;

public class TecladoEstropeado {
    static java.util.Scanner ent;
    public static boolean casoDePrueba() {
        if (!ent.hasNext())
            return false;
        else {
            LinkedList<Character> letritas = new LinkedList<>();
            ListIterator<Character> it = letritas.listIterator();
            for (char c:ent.nextLine().toCharArray()){
                switch (c){
                    case '-':
                        while (it.hasPrevious()){
                            it.previous();
                        }
                        break;
                    case '+':
                        while (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '*':
                        if(it.hasNext()){
                            it.next();
                        }
                        break;
                    case '3':
                        if(it.hasNext()){
                            it.next();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(c);
                        break;
                }
            }
            for (char c:letritas) {
                System.out.print(c);
            }
            System.out.println();
            return true;
        }
    }
    public static void main(String[] args) {
        ent = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}