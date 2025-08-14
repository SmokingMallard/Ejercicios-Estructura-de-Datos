package modelos;

public class Moto extends Vehiculo {
    public Moto(String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio, precio);
    }

    @Override
    public double calcularDescuento() {
        return getPrecio() * 0.08;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Moto");
    }
}