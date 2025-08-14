package modelos;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    public Vehiculo(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double calcularDescuento();

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Año: " + año + " | Precio: " + precio);
    }
}
