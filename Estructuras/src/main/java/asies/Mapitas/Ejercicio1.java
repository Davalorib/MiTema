package asies.Mapitas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Escribe una frase: ");
        String a = ent.nextLine();

        String[] b = a.split(" ");
        Map<String,Integer> mapa = new HashMap<>();

        for (String p : b){
            mapa.put(p,mapa.getOrDefault(p,0)+1);
        }

        for (Map.Entry<String,Integer> palabra: mapa.entrySet()){
            System.out.println(palabra.getKey() + ": " + palabra.getValue());
        }


    }

}
