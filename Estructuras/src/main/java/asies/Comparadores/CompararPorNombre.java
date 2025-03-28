package asies.Comparadores;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Figuras> {

    @Override
    public int compare(Figuras f1, Figuras f2) {
        int resultadoCompararNombre = f1.getNombre().compareTo(f2.getNombre());

        if (resultadoCompararNombre!=0) return resultadoCompararNombre;

        return f1.getSuperficie().compareTo(f2.getSuperficie());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
