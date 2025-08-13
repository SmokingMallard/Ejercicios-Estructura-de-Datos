package modelos;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    public Vehiculo (String marca, String modelo, int año, double precio)
    this.marca = marca;
    this.model = modelo;
    this.año = año;
    this.precio = precio;
}

public String getMarca() {return marca; }
public String getModelo() {return modelo; }
public int getAño() { return año; }
public double getPrecio() { return precio; }

public String setMarca(String marca) {this.marca = marca; }
public String setModelo(String modelo) {this.modelo = modelo; }
public int setAño(int año) { this.año = año }
public double setPrecio(double precio) { this.precio = precio}

public abstract double calcularDescuento()

public void mostrarInformacion() {
    System.out.println("Marca: " + marca + " " modelo + " " año + " " precio + "")
}
