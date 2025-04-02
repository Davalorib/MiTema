package asies.Mercadaw;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Pedido {

    private HashMap<Producto,Integer> pedido;
    private double importe_total;

    public Pedido(){
        this.pedido = new HashMap<>();
        this.importe_total = 0;
    }

    public void insertarProductos(Producto p){
        this.pedido.put(p,pedido.getOrDefault(p,0)+1);
        this.importe_total += p.getPresio();
    }

    public void verPedido(){
        System.out.println("\n=================================================\n");
        System.out.println("RESUMEN DE TU CARRITO DE LA COMPRA:");
        System.out.println("\nProductos:\n");
        for (Map.Entry<Producto,Integer> mapa:pedido.entrySet()){
            System.out.println(mapa.getValue() +" - "+ mapa.getKey() +" ("+ mapa.getKey().getPresio() +"€).");
        }
        System.out.println("\nIMPORTE TOTAL: "+ getImporte_total() +"€.");
        System.out.println("\n=================================================\n");
    }

    public void aplicarPromo3x2(){}

    public void aplicarPromo10(){}

}
