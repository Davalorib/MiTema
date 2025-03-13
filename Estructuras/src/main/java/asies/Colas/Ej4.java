package asies.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ej4 {

    static Scanner ent = new Scanner(System.in);
    static Deque<String> lista = new LinkedList<>();

    public static void main(String[] args) {


        menu();



    }

    public static void menu(){

        System.out.println("\n--- LISTA DE LA COMPRA ---");
        System.out.println("1. Añadir producto al final");
        System.out.println("2. Eliminar primer producto");
        System.out.println("3. Eliminar producto por nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar producto");
        System.out.println("6. Mostrar lista actual");
        System.out.println("X. Salir");

        System.out.print("\nSeleccione una opción: ");
        elec(ent.next());

    }

    public static void elec(String a){

        System.out.println("\n-----------------------------");
        switch (a){
            case "1":
                System.out.print("\nProducto a añadir: ");
                lista.offerLast(ent.next());
                menu();
                break;
            case "2":
                if (!lista.isEmpty()) System.out.println("\nProducto eliminado: " + lista.pollFirst());
                else System.out.println("La lista está vacía");
                menu();
                break;
            case "3":
                System.out.print("\nProducto a eliminar: ");
                String b = ent.next();
                if (lista.contains(b)) lista.remove(b);
                else System.out.println("Ese producto no está");
                menu();
                break;
            case "4":
                if (!lista.isEmpty()) System.out.println("\nEl primer producto es: " + lista.peekFirst());
                else System.out.println("La lista está vacía");
                menu();
                break;
            case "5":
                System.out.print("\nProducto a buscar: ");
                if (lista.contains(ent.next())) System.out.println("Ese producto está");
                else System.out.println("Ese producto no está");
                menu();
                break;
            case "6":
                if (!lista.isEmpty()){
                    System.out.println("\nLista de productos: ");
                    int cont = 1;
                    for (String si : lista){
                        System.out.println(cont + ". " + si);
                        cont++;
                    }
                }
                else System.out.println("La lista está vacía");
                menu();
                break;
            case "X":
                System.out.print("\nok, adios");
                break;
            default:
                System.out.println("\nNo inventes");
                menu();
                break;
        }


    }

}
