package asies.Mercadaw;

import java.util.Scanner;
import java.util.Set;

public class AppZonaClientes {

    static Scanner ent = new Scanner(System.in);
    static Cliente cliente;

    public static void main(String[] args) {

        boolean si;
        new Mercadaw();
        do {
            si = false;
            Mercadaw.generarClientes();
            autenticacion(Mercadaw.getClientes());
            try {
                iniciarCompra();
                cliente.getPedido().verPedido();
                menuElec();
                System.out.print("\n¿Quieres volver a iniciar sesión? [S/N]: ");
                switch (ent.next().toLowerCase()){
                    case "s":
                        si = true;
                        break;
                    case "n":
                        System.out.println("\nPOR FAVOR VUELVA PRONTO");
                        break;
                    default:
                        System.out.println("\nELECCIÓN NO VALIDA");
                        System.err.println("\nABORTANDO PROGRAMA");
                        break;
                }
            } catch (NullPointerException e) {
                System.err.println("ABORTANDO PROGRAMA");
            }
        }while (si);
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
        System.out.println("\nBIENVENID@ " + cliente.getUsuario() + "!");
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
                        + String.format("%.2f", cliente.importePedido()) +"€. ¿Quieres añadir más productos a tu carrito de la compra? [S/N]: ");
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
                            break;
                    }
                } while (repetir);
            } catch (IllegalArgumentException e){
                System.out.println("El producto no existe! Elige otro.\n");
                si = true;
            }
        }while (si);
    }

    static void imprimirProductos(){
        System.out.println("\nAñade productos a tu lista de la compra...\n");
        for (Producto p:Producto.values()) {
            System.out.println("        "+ p.name() +" precio ("+ p.getPresio() +"€)\n");
        }
    }

    static void imprimirDespedida(){
        System.out.println("\n=================================================\n");
        System.out.println("GRACIAS POR SU PEDIDO. Se lo mandaremos a la dirección "+ cliente.getDireccion());
    }

    static void menuElec(){
        System.out.println("¿QUÉ DESEA HACER?\n");
        System.out.println("        [1]. Aplicar promo.");
        System.out.println("        [2]. Mostrar resumen ordenado por uds.");
        System.out.println("        [3]. Eliminar productos.");
        System.out.println("        [X]. Terminar pedido.");
        System.out.println("\n=================================================\n");
        System.out.print("        Elige una opción: ");
        boolean repetir;
        do {
            repetir = false;
            switch (ent.next().toLowerCase()) {
                case "1":
                    System.out.println("\n=================================================\n");
                    if (cliente.isPromociones()){
                        System.out.println("YA HAS APLICADO TUS PROMOS.");
                    }else{
                        cliente.setPromociones();
                        cliente.getPedido().aplicarPromo3x2();
                        cliente.getPedido().aplicarPromo10();
                        System.out.println("PROMO 3x2 y 10% APLICADAS.");
                    }
                    cliente.getPedido().verPedido();
                    menuElec();
                    break;
                case "2":
                    cliente.getPedido().verPedidoOrdenado();
                    menuElec();
                    break;
                case "3":
                    if (cliente.isPromociones()){
                        System.out.println("\n=================================================\n");
                        System.out.println("NO PUEDES QUITAR PRODUCTOS SI YA HAS APLICADO TUS PROMOS.\n");
                    }else {
                        cliente.getPedido().verPedido();
                        boolean si2;
                        do {
                            si2 = false;
                            System.out.print("        Introduce el producto a quitar: ");
                            try {
                                String producto = ent.next().toUpperCase();
                                System.out.println("\n=================================================\n");
                                cliente.getPedido().quitarProductos(Producto.valueOf(producto));
                                cliente.getPedido().comprobar();
                                cliente.getPedido().verPedido();
                            } catch (IllegalArgumentException e) {
                                System.out.println("El producto no existe! Elige otro.\n");
                                si2 = true;
                            }
                        }while (si2);
                    }
                    menuElec();
                    break;
                case "x":
                    imprimirDespedida();
                    break;
                default:
                    System.out.print("        Elige una opción válida [1/2/3/X]: ");
                    repetir = true;
                    break;
            }
        } while (repetir);
    }

}
