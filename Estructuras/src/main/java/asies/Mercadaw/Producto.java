package asies.Mercadaw;

public enum Producto {

    MANZANAS(2.3),PAN(1),ARROZ(3.5),POLLO(4.3),LECHE(1.3),ACEITE(8.3),HUEVOS(3.3),TOMATES(4),PASTA(0.9);

    private double presio;

    Producto(double presio){this.presio=presio;}

    public double getPresio(){return presio;}

}
