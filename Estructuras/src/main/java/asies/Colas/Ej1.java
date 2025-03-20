package asies.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ej1 {

    public static void main(String[] args) {

        Queue<Character> cola = new LinkedList<>();

        cola.offer('1');
        cola.offer('2');
        cola.offer('3');
        cola.offer('4');
        cola.offer('5');

        System.out.println(cola.isEmpty());

        System.out.println(cola.size());

        System.out.println(cola.peek());

        while(!cola.isEmpty()) System.out.println(cola.poll());

    }

}
