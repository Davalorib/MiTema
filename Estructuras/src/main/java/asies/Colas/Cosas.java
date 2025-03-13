package asies.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Cosas {

    public static void main(String[] args) {

//        Queue<String> cola = new ArrayBlockingQueue<>(2);
//
//        cola.offer("Marruecos");
//        cola.offer("España");
//        cola.offer("Francia");
//
//        System.out.println(cola);
//        cola.poll();
//        System.out.println(cola);
//
//
//        Queue<Integer> cola2 = new LinkedList<>();
//        cola2.offer(12);
//        cola2.offer(21);
//        cola2.offer(3);
//
//        System.out.println(cola2.peek());
//
//        while(!cola2.isEmpty()) System.out.println(cola2.poll());
//
//        cola2.add(2); //en las colas no de puede poner por el medio cosas
//
//        LinkedList<Integer> lista = new LinkedList<>();
//        lista.add(2,14);


        Deque<String> burguers = new LinkedList<>();

        burguers.offer("Big Mac");
        burguers.offerFirst("Cuarto de Libra");
        burguers.offerLast("McPollo");
        burguers.pollLast();

        System.out.println(burguers);

    }

}
