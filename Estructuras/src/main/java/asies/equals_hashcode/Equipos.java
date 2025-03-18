package asies.equals_hashcode;

import java.util.Objects;

public class Equipos {

    private String nombre;
    private int num;

    public Equipos(String nombre, int num) {
        this.nombre = nombre;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "nombre='" + nombre + '\'' +
                ", num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipos equipos = (Equipos) o;
        return num == equipos.num && Objects.equals(nombre, equipos.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, num);
    }

}
