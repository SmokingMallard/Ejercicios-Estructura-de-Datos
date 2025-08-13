public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Registrar libros
        biblioteca.registrarLibro(new Libro("El Quijote", "Miguel de Cervantes", 1605));
        biblioteca.registrarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));

        // Registrar socios
        biblioteca.registrarSocio(new Socio("Juan", "Pérez", 1));
        biblioteca.registrarSocio(new Socio("María", "López", 2));

        // Mostrar libros disponibles
        System.out.println("Libros en la biblioteca:");
        biblioteca.mostrarLibros();

        // Prestar un libro
        System.out.println("\nPrestando 'Cien años de soledad' a socio #1...");
        biblioteca.prestarLibro("Cien años de soledad", 1);

        // Mostrar libros después del préstamo
        System.out.println("\nEstado de libros después del préstamo:");
        biblioteca.mostrarLibros();
    }
}
