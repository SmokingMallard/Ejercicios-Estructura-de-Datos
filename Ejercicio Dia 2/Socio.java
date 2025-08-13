public class Socio {
    private String nombre;
    private String apellido;
    private int numeroSocio;

    public Socio(String nombre, String apellido, int numeroSocio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSocio = numeroSocio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    @Override
    public String toString() {
        return numeroSocio + ": " + nombre + " " + apellido;
    }
}
