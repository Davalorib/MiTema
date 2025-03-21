package asies.Ejercicio3;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class AppInformes {

    static Stack<Informe> informes = new Stack<>();
    static Set<String> tipos = new HashSet<>();

    public static void main(String[] args) {

        Informe i1 = new Informe(1,"Rezar",Tipos.PERSONAL);
        Informe i2 = new Informe(2,"Limpiar el setup",Tipos.PERSONAL);
        Informe i3 = new Informe(3,"Firmar",Tipos.EMPRESARIAL);
        Informe i4 = new Informe(4,"Hacer fotocopias",Tipos.ADMINISTRATIVO);
        Informe i5 = new Informe(1,"Rezar a la meca",Tipos.PERSONAL);

        nuevoInforme(i1,i2,i3,i4,i5);

        mostrarInformes();
        System.out.println();
        contadorTipos();
        System.out.println();
        hacerInformes();

    }

    static void nuevoInforme(Informe... informe){
        for (int i = 0; i < informe.length; i++) {
            informes.push(informe[i]);
            tipos.add("Código: " + informe[i].getCodigo() + ", Tipo: " + informe[i].getTipo());
        }
    }

    static void contadorTipos(){
        System.out.println(tipos.size());
    }

    static void mostrarInformes(){
        for (Informe i:informes){
            System.out.println(i);
        }
    }

    static void hacerInformes(){
        while (!informes.isEmpty()){
            System.out.println("Realizando la tarea: " + informes.pop());
        }
    }

}
