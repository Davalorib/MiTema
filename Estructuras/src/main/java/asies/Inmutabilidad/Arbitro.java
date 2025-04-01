package asies.Inmutabilidad;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@ToString
public class Arbitro {

    List<String> lista = new ArrayList<>(Arrays.asList("Gil Manzano","Negreira","Pedro"));

    public List<String> getLista() {

        return Collections.unmodifiableList(lista);
    }


}
