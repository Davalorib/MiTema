package asies.Mercadaw;

import lombok.Getter;

import java.util.*;

@Getter
public class Pedido {

    private final double DESCUENTO = 10;

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
        System.out.println("\nIMPORTE TOTAL: "+ String.format("%.2f", getImporte_total()) +"€.");
        System.out.println("\n=================================================\n");
    }

    public void verPedidoOrdenado(){
        System.out.println("\n=================================================\n");
        System.out.println("RESUMEN DE TU CARRITO DE LA COMPRA:");
        System.out.println("\nProductos:\n");
        List<Map.Entry<Producto,Integer>> listaMapita = new ArrayList<>(pedido.entrySet());
        Collections.sort(listaMapita, new CompararPorCantidad().reversed());
        for (Map.Entry<Producto,Integer> mapita:listaMapita){
            System.out.println(mapita.getValue() +" - "+ mapita.getKey() +" ("+ mapita.getKey().getPresio() +"€).");
        }
        System.out.println("\nIMPORTE TOTAL: "+ String.format("%.2f", getImporte_total()) +"€.");
        System.out.println("\n=================================================\n");
    }

    public void aplicarPromo3x2(){
        double total = 0;
        for (Map.Entry<Producto,Integer> mapita:pedido.entrySet()) {
            int num = mapita.getValue();
            int gratis = num / 3;
            total += (num-gratis) * mapita.getKey().getPresio();
        }
        this.importe_total = total;
    }

    public void aplicarPromo10(){
        this.importe_total *= ((100-DESCUENTO) / 100);
    }

}
