package asies.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ej2 {

    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();

        cola.offer("Imprimir documento 1");
        cola.offer("Imprimir documento 2");
        cola.offer("Imprimir documento 3");
        cola.offer("Imprimir documento 4");
        cola.offer("Imprimir documento 5");

        System.out.println("Estado inicial de la cola de impresión: " + cola);

        while(!cola.isEmpty()) {
            System.out.println("Procesando: " + cola.poll());
            System.out.println("Estado de la cola después de procesar el tranajo: " + cola);
        }

        System.out.println("Acabé");

    }

}
