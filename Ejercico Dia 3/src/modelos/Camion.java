package modelos;

public class Camion extends Vehiculo {
    public Camion(String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio, precio);
    }

    @Override
    public double calcularDescuento() {
        return getPrecio() * 0.10;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Camión");
    }
}