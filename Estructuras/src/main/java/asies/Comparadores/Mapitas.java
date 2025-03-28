package asies.Comparadores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapitas {

    public static void main(String[] args) {

        HashMap<String,Double> cubatas = new HashMap<>();
        cubatas.put("Wichinau",7.2);
        cubatas.put("Ron cola",7.);
        cubatas.put("Gintonic",8.);
        cubatas.put("Jaggerbomb",10.5);

        List<Map.Entry<String,Double>> listaMapita = new ArrayList<>(cubatas.entrySet());
        listaMapita.sort(Map.Entry.comparingByValue());

        for (Map.Entry<String,Double> mapita : listaMapita){
            System.out.println("Cubalitres: " + mapita.getKey() + " con precio : " + mapita.getValue());
        }

    }

}
