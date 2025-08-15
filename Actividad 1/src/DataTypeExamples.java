public class DataTypeExamples {

    // Interfaz para ejemplo de tipo abstracto
    interface Informacion {
        String obtenerInfo();
    }

    // Clase Contacto como tipo de dato complejo y que implementa la interfaz
    static class Contacto implements Informacion {
        String nombre;
        String direccion;
        String telefono;

        public Contacto(String nombre, String direccion, String telefono) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        @Override
        public String obtenerInfo() {
            return nombre + " - " + telefono;
        }

        @Override
        public String toString() {
            return nombre + " | " + direccion + " | " + telefono;
        }
    }

    public static void ejemploPrimitivo() {
        int numero = 42;
        System.out.println("Ejemplo de tipo primitivo: int = " + numero);
    }

    public static void ejemploComplejo() {
        Contacto c = new Contacto("Juan Pérez", "Calle Falsa 123", "555-1234");
        System.out.println("Ejemplo de tipo complejo: " + c);
    }

    public static void ejemploAbstracto() {
        Informacion info = new Contacto("Ana López", "Av. Siempre Viva 742", "555-5678");
        System.out.println("Ejemplo de tipo abstracto (Interfaz): " + info.obtenerInfo());
    }
}
