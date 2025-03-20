package asies.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ej3 {

    public static void main(String[] args) {

        Queue<String> playlist = new LinkedList<>();

        playlist.offer("El último día de nuestras vida - Dani Martín");
        playlist.offer("Caminando por la vida - Melendi");
        playlist.offer("Bulería - David Bibal");
        playlist.offer("Rosas - La Oreja de Van Gogh");

        System.out.println("Estado inicial de la playlist: " + playlist);

        while(!playlist.isEmpty()) {
            System.out.println("Reproduciendo... " + playlist.poll());
            System.out.println("Estado de la playlist después de reproducir la canción: " + playlist);
        }

        System.out.println("Fin");

    }

}
