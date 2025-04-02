package asies.Mercadaw;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AppZonaClientes {

    static Scanner ent = new Scanner(System.in);
    static Cliente cliente;

    public static void main(String[] args) {

        Mercadaw mercadaw = new Mercadaw();
        Mercadaw.generarClientes();
        autenticacion(Mercadaw.getClientes());
        iniciarCompra();
        cliente.verPedido();
    }

    static void autenticacion(Set<Cliente> clientes){
        for (Cliente c:clientes){ System.out.println(c); }
        System.out.println("\n*** COMPRA ONLINE DE MERCADAW ***\n");
        boolean si = false;
        for (int i = 0; i < 3; i++) {
            System.out.print("Usuario: ");
            String usuario = ent.next();
            System.out.print("Contraseña: ");
            String contra = ent.next();
            for (Cliente c:clientes){
                if (c.getUsuario().equalsIgnoreCase(usuario) && c.getContrasenya().equals(contra)){
                    cliente=c;
                    si = true;
                    break;
                }
            }
            if (si) {
                break;
            }
            System.out.println(i<2 ? "\nAlgo no coincide o no existe! Vuelve a intentarlo...\n" : "\nERROR DE AUTENTICACIÓN\n");
        }
    }

    static void iniciarCompra(){
        System.out.println("\nBIENVENID@ " + cliente.getUsuario() + "!\n");
        cliente.crearPedido();
        boolean si;
        do {
            si = false;
            imprimirProductos();
            System.out.println("\n=================================================\n");
            System.out.print("        Elige un producto: ");
            try {
                String producto = ent.next().toUpperCase();
                System.out.println("\n=================================================\n");
                Producto producto1 = Producto.valueOf(producto);
                cliente.insertarProducto(producto1);
                System.out.print("Has añadido "+ producto +" con un precio de "+ producto1.getPresio() +"€. Importe total del carrito: "
                        + cliente.importePedido() +"€. ¿Quieres añadir más productos a tu carrito de la compra? [S/N]: ");
                boolean repetir;
                do {
                    repetir = false;
                    switch (ent.next().toLowerCase()) {
                        case "s":
                            si = true;
                            break;
                        case "n":
                            break;
                        default:
                            System.out.print("Elige una opción válida [S/N]: ");
                            repetir = true;
                    }
                } while (repetir);
            } catch (IllegalArgumentException e){
                System.out.println("El producto no existe! Elige otro.\n");
                si = true;
            }
        }while (si);
    }

    static void imprimirProductos(){
        System.out.println("Añade productos a tu lista de la compra...\n");
        for (Producto p:Producto.values()) {
            System.out.println("        "+ p.name() +" precio ("+ p.getPresio() +"€)\n");
        }
    }

    static void imprimirDespedida(){}

    static void menuElec(){
        System.out.println("¿QUÉ DESEA HACER?");
        System.out.println("        [1]. Aplicar promo.");
        System.out.println("        [2]. Mostrar resumen ordenado por uds.");
        System.out.println("        [3]. Terminar pedido.");

        boolean repetir;
        do {
            repetir = false;
            switch (ent.next()) {
                case "1":
                    System.out.println("Aplicar promo.");
                    break;
                case "2":
                    System.out.println("Mostrar resumen ordenado por uds.");
                    break;
                case "3":
                    System.out.println("Terminar pedido.");
                    break;
                default:
                    System.out.print("Elige una opción válida [S/N]: ");
                    repetir = true;
            }
        } while (repetir);
    }

}
