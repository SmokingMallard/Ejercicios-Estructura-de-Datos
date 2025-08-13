import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Socio> socios;

    public Biblioteca() {
        libros = new ArrayList<>();
        socios = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarSocio(Socio socio) {
        socios.add(socio);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; // si no lo encuentra
    }

    public boolean prestarLibro(String titulo, int numeroSocio) {
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null && !libro.isPrestado()) {
            libro.setPrestado(true);
            System.out.println("Libro prestado a socio #" + numeroSocio);
            return true;
        }
        System.out.println("No se pudo prestar el libro: No existe o ya está prestado.");
        return false;
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
