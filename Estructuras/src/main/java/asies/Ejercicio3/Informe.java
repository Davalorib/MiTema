package asies.Ejercicio3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor @Getter @ToString
public class Informe {

    private int codigo;
    private String desc;
    private Tipos tipo;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }
}
