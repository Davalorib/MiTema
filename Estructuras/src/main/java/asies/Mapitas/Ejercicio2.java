package asies.Mapitas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {

        Map<Character,Integer> map = new LinkedHashMap<>();

        System.out.print("Dame la palabra: ");

        for (Character p:ent.next().toCharArray()){
            map.put(p,map.getOrDefault(p,0)+1);
        }

        for (Map.Entry<Character,Integer> palabra: map.entrySet()){
            System.out.println(palabra.getKey() + ": " + palabra.getValue());
        }

    }

}
