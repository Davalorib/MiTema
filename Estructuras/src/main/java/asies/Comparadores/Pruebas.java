package asies.Comparadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Pruebas{

    public static void main(String[] args) {

        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(1,22,13,4,5));

        Collections.sort(nums);
        System.out.println(nums);

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Patri","Ivan","Mauro"));
        Collections.sort(nombres);
        System.out.println(nombres);

        ArrayList<Figuras> figuritas = new ArrayList<>();
        figuritas.add(new Figuras("Cuadrado",20.));
        figuritas.add(new Figuras("Triangulo",30.));
        figuritas.add(new Figuras("Hectágono",12.));
        figuritas.add(new Figuras("Tricontakaiheptágono",69.));
        figuritas.add(new Figuras("Hectágono",13.));

        Collections.sort(figuritas, new CompararPorNombre());
        System.out.println(figuritas);
        Collections.sort(figuritas, new CompararPorNombre().reversed());
        System.out.println(figuritas);

    }

}
