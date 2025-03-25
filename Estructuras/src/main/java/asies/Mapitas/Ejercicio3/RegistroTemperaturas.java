package asies.Mapitas.Ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperaturas {

    static Scanner ent = new Scanner(System.in);
    private Map<String,Double> map;

    public RegistroTemperaturas(){
        map = new HashMap<>();
    }

    public void insertar(String ciudad, Double temperatura){
        map.put(ciudad,temperatura);
        System.out.println("Temperatura de " + temperatura + " registrados para " +ciudad);
    }

    public void actualizar(String ciudad){
        System.out.println("Qué temperatura hace en " + ciudad + "?");
        map.put(ciudad, ent.nextDouble());
        System.out.println("Temperatura actualizada en " + ciudad);
    }

    public void consultar(){
        System.out.print("Introduce la ciudad a consultar: ");
        String ciudad = ent.next();
        if (map.containsKey(ciudad)){
            System.out.println("Temperatura en " + ciudad + ": " + map.get(ciudad) + "º");
        } else {
            System.out.println("No existen registros para " + ciudad);
        }
    }

    public void verTodas(){
        System.out.println("TEMPERATURAS REGISTRADAS");
        for (Map.Entry<String,Double> m:map.entrySet()){
            System.out.println(m.getKey() + ": " + m.getValue() + "º");
        }
    }

    @Override
    public String toString() {
        return "RegistroTemperaturas{" +
                "map=" + map +
                '}';
    }
}
