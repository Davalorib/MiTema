package asies.Mercadaw;

import lombok.Getter;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

@Getter
public class Cliente {

    static Scanner ent = new Scanner(System.in);

    static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static Random random = new Random();

    private final String DIREC = "Calle falsa, 123";

    private String usuario;
    private String contrasenya;
    private String direccion;
    private Pedido pedido;
    boolean promociones;

    public Cliente(){
        setUsuario();
        this.contrasenya = "";
        setContrasenya();
        this.pedido = null;
        this.promociones = false;
        this.direccion = DIREC;
    }

    private void setUsuario() {
        System.out.print("\nDame tu usuario: ");
        this.usuario = ent.next();
    }

    private void setContrasenya() {
        StringBuilder contra = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            contra.append(CARACTERES.charAt(random.nextInt(CARACTERES.length())));
        }
        this.contrasenya = contra.toString();
    }

    public void setPromociones(){
        this.promociones = true;
    }

    public void crearPedido(){
        this.pedido = new Pedido();
    }

    public void insertarProducto(Producto producto){
        this.pedido.insertarProductos(producto);
    }

    public double importePedido(){
        return pedido.getImporte_total();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(usuario, cliente.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(usuario);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                "// contrasenya='" + contrasenya + '\'' +
                "// direccion='" + direccion + '\'' +
                "// pedido=" + pedido +
                "// promociones=" + promociones +
                '}';
    }
}
