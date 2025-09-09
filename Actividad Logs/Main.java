import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de ejercicios:");
            System.out.println("1. Insertar 20 números aleatorios y contar búsquedas fallidas");
            System.out.println("2. Insertar nombres de alumnos y buscar uno específico");
            System.out.println("3. Insertar años de nacimiento y buscar 1990");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    ejercicioNumerosAleatorios();
                    break;
                case 2:
                    ejercicioNombresAlumnos(sc);
                    break;
                case 3:
                    ejercicioAniosNacimiento();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    // Ejercicio 1
    private static void ejercicioNumerosAleatorios() {
        try {
            ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda("log_ej1.txt");
            Random rand = new Random();
            int[] numeros = new int[20];
            for (int i = 0; i < 20; i++) {
                numeros[i] = rand.nextInt(100) + 1;
                arbol.insertar(numeros[i]);
            }
            int fallidas = 0;
            int objetivo = numeros[rand.nextInt(20)];
            while (true) {
                int intento = rand.nextInt(100) + 1;
                if (arbol.buscar(intento)) {
                    if (intento == objetivo) break;
                } else {
                    fallidas++;
                }
            }
            System.out.println("Búsquedas fallidas antes de encontrar uno correcto: " + fallidas);
            arbol.cerrarLog();
        } catch (IOException e) {
            System.out.println("Error en el log: " + e.getMessage());
        }
    }

    // Ejercicio 2
    private static void ejercicioNombresAlumnos(Scanner sc) {
        try {
            ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda("log_ej2.txt");
            Random rand = new Random();
            char[] letras = new char[20];
            System.out.print("Letras generadas: ");
            for (int i = 0; i < 20; i++) {
                letras[i] = (char) (rand.nextInt(26) + 'A'); // Letras mayúsculas aleatorias
                System.out.print(letras[i] + " ");
                arbol.insertar((int) letras[i]);
            }
            System.out.println();

            System.out.print("Ingrese la letra a buscar: ");
            String buscar = sc.nextLine().toUpperCase();
            if (buscar.length() != 1 || buscar.charAt(0) < 'A' || buscar.charAt(0) > 'Z') {
                System.out.println("Entrada inválida. Debe ser una sola letra A-Z.");
            } else {
                boolean encontrado = arbol.buscar((int) buscar.charAt(0));
                System.out.println(encontrado ? "Alumno encontrado." : "Alumno NO encontrado.");
            }
            arbol.cerrarLog();
        } catch (IOException e) {
            System.out.println("Error en el log: " + e.getMessage());
        }
    }

    // Ejercicio 3
    private static void ejercicioAniosNacimiento() {
        try {
            ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda("log_ej3.txt");
            Random rand = new Random();
            int[] anios = new int[20];
            int contador1990 = 0;

            for (int i = 0; i < 20; i++) {
                anios[i] = rand.nextInt(1996 - 1990) + 1990; // Aleatorio entre 1990 y 1995
                arbol.insertar(anios[i]);
                if (anios[i] == 1990) {
                    contador1990++;
                }
            }

            System.out.print("Años generados: ");
            for (int anio : anios) {
                System.out.print(anio + " ");
            }
            System.out.println();

            if (contador1990 > 0) {
                System.out.println("Cantidad de personas que nacieron en 1990: " + contador1990);
            } else {
                System.out.println("Nadie nació en 1990.");
            }
            arbol.cerrarLog();
        } catch (IOException e) {
            System.out.println("Error en el log: " + e.getMessage());
        }
    }
}