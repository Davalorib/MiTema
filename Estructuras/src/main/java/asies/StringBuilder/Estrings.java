package asies.StringBuilder;

public class Estrings {

    public static void main(String[] args) {

        StringBuilder texto = new StringBuilder("Hola ");
        texto.append("Mundo");
        texto.append(" soy David");
        texto.insert(0,"He nacido, ");
        texto.replace(26,31,"Mauro");
        texto.delete(16,22);

        System.out.println(texto);

        texto.reverse();

        System.out.println(texto);

    }

}
