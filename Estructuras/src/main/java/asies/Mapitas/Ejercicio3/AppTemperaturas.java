package asies.Mapitas.Ejercicio3;

public class AppTemperaturas {

    public static void main(String[] args) {

        RegistroTemperaturas registro = new RegistroTemperaturas();
        registro.insertar("Mutxamel",18.6);
        System.out.println(registro);
        registro.insertar("Sanvi",19.6);
        registro.actualizar("Mutxamel");
        registro.consultar();
        registro.verTodas();
    }

}
