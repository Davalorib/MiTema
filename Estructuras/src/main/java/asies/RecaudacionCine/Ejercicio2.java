package asies.RecaudacionCine;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ejercicio2 {

    static Random random = new Random();
    static Queue<Persona> cola = new LinkedList<>();

    public static void main(String[] args) {

        generarCola();
        System.out.println("Hay " + cola.size() + " personas a la cola.");
        System.out.println("La recaudación ha sido de " + pagar() + "€");

    }

    public static void generarCola(){

        int num = random.nextInt(251);

        for (int i = 0; i < num; i++) {
            cola.offer(new Persona(random.nextInt(97)+3));
        }

    }

    public static double pagar(){

        double importe = 0;

        while (!cola.isEmpty()){
            importe += obtenerPrecio(cola.poll().getEdad());
        }

        return importe;
    }

    public static double obtenerPrecio(int edad){

        if (edad >= 3 && edad<=10) return 1;
        else if (edad > 10 && edad < 18) return 2.5;
        else return 3.5;

    }

}
