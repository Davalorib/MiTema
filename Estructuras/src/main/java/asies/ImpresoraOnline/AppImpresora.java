package asies.ImpresoraOnline;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppImpresora {

    private static final String ID_PC = "PC1234";
    static LinkedHashSet<Peticion> colaPeticion = new LinkedHashSet<>();

    public static void main(String[] args) {

        anyadirDocumento("prueba.pdf");
        anyadirDocumento("hola.txt");
        anyadirDocumento("expediente.pdf");
        anyadirDocumento("prueba.pdf");
        System.out.println();
        imprimirDocumento();
        System.out.println(colaPeticion);
        System.out.println("Quedan " + numCola() + " peticiones en la cola");
        verTodo();
        imprimirTodo();

    }

    public static void anyadirDocumento(String nombre_archivo) {

        if (nombre_archivo.endsWith(".pdf")) {
            if (colaPeticion.add(new Peticion(ID_PC,nombre_archivo))){
                System.out.println("Archivo " + nombre_archivo + " añadido a la cola de impresión.");
            } else {
                System.out.println("El archivo " + nombre_archivo + " ya existe en la cola de impresión.");
            }

        } else {
            System.out.println("El archivo " + nombre_archivo + " no tiene el formato correcto.");
        }

    }

    public static void imprimirDocumento(){

        System.out.println("Imprimiendo... " + colaPeticion.getFirst().getNombre_archivo());
        colaPeticion.removeFirst();

    }

    public static int numCola(){
        return colaPeticion.size();
    }

    public static void verTodo(){
        System.out.println(colaPeticion);
    }

    public static void imprimirTodo(){
        while (!colaPeticion.isEmpty()) imprimirDocumento();

        System.out.println("La cola ha finalizado");
    }
}
