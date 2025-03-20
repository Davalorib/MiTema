package asies.Mapitas;

import java.util.HashMap;
import java.util.Map;

public class Pruebas {

    public static void main(String[] args) {

        HashMap<String,Integer> mapaNotas = new HashMap<>();

        mapaNotas.put("Ismael",3);
        mapaNotas.put("David",5);
        mapaNotas.put("Antonio",1);
        mapaNotas.put("Cesar",5);

        System.out.println(mapaNotas);

        mapaNotas.put("Ismael",6);

        System.out.println(mapaNotas.get("Ismael"));

        mapaNotas.remove("Antonio");

        System.out.println(mapaNotas);

        if (mapaNotas.containsKey("Cesar")) System.out.println("C# existe");

        if (mapaNotas.containsValue(10)) System.out.println("God cabron, hay un maquina");

        System.out.println(mapaNotas.keySet());
        System.out.println(mapaNotas.values());

        for (String claves:mapaNotas.keySet()){
            System.out.println("Clave: " + claves + " y su nota: " + mapaNotas.get(claves));
        }

        for (Integer notas:mapaNotas.values()){
            System.out.println("Nota: " + notas);
        }

        for (Map.Entry<String,Integer> mapa:mapaNotas.entrySet()){
            System.out.println("Alumno " + mapa.getKey() + " con nota " + mapa.getValue());
        }


    }

}
