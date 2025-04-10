package asies.Lambdas;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class Producto {

    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre, double precio, String cateagoria){

        this.nombre = nombre;
        this.precio = precio;
        this.categoria = cateagoria;

    }

}
