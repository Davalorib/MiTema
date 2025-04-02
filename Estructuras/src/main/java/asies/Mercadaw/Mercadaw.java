package asies.Mercadaw;

import java.util.*;

public class Mercadaw {

    static Set<Cliente> clientes;

    public Mercadaw(){
        clientes = new HashSet<>();
    }

    static void generarClientes(){
        clientes.add(new Cliente());
    }

    static Set<Cliente> getClientes(){
        return Collections.unmodifiableSet(clientes);
    }

}
