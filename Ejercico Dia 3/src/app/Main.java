package EjercicioDia3.app;

import java.util.ArrayList;
import modelos.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Toyota", "Corolla", 2022, 350000));
        vehiculos.add(new Moto("Yamaha", "FZ", 2023, 90000));
        vehiculos.add(new Camion("Volvo", "FH", 2021, 850000));

        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            double descuento = v.calcularDescuento();
            System.out.println("Descuento: $" + descuento);
            System.out.println("Precio final: $" + (v.getPrecio() - descuento));
            System.out.println("---------------------------");
        }
    }
}