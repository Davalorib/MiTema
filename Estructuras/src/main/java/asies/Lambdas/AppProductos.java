package asies.Lambdas;

import java.util.ArrayList;
import java.util.List;

public class AppProductos {

    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Smartphone",150.0,"Electrónica"));
        listaProductos.add(new Producto("Tablet",72.0,"Electrónica"));
        listaProductos.add(new Producto("Perfume Árabe",40.0,"Perfumes"));
        listaProductos.add(new Producto("Kebab",2.50,"Alimentación"));

        FiltroProducto filtro = (producto) -> {

          if (producto.getCategoria().equals("Electrónica") && producto.getPrecio()>100){
              return true;
          }
          return false;

        };

        List<Producto> productosFiltrados = new ArrayList<>();

        for (Producto p:listaProductos){

            if (filtro.filtrar(p)){
               productosFiltrados.add(p);
            }

        }

        System.out.println("Productos después de filtrar: " + productosFiltrados);

    }

}
