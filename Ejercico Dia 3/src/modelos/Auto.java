package modelos;

public class Auto extends Vehiculo {
    public Auto(String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio, precio);
    }

    @Override
    public double calcularDescuento() {
        return getPrecio() * 0.05;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Auto");
    }
}