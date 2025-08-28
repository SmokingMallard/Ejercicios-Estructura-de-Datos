import java.util.Scanner;

/**
 * Clase que muestra un menú en consola para aplicar tres casos de recursividad:
 * directa (factorial), indirecta (fibonacci) y suma de dígitos.
 */
public class RecursionMenu {

    /**
     * Calcula el factorial de un número usando recursividad directa.
     * @param n número al que se le calcula el factorial
     * @return factorial de n
     */
    public static long factorial(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Calcula el número de Fibonacci en la posición n usando recursividad indirecta.
     * @param n posición en la serie de Fibonacci
     * @return número de Fibonacci en la posición n
     */
    public static long fibonacci(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Suma los dígitos de un número entero positivo usando recursividad.
     * Ejemplo: sumaDigitos(123) = 1 + 2 + 3 = 6
     * @param n número entero positivo
     * @return suma de los dígitos de n
     */
    public static long sumaDigitos(long n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumaDigitos(n / 10);
        }
    }

    /**
     * Muestra un menú en consola para elegir entre calcular el factorial,
     * el número de Fibonacci, la suma de dígitos o salir del programa.
     * El menú se repite usando recursividad (sin bucles).
     * Incluye manejo de errores para evitar que el programa se rompa
     * si el usuario introduce una letra u otro dato no numérico.
     */
    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(); // Imprime un espacio en blanco antes del menú
        System.out.println("=== MENÚ RECURSIVIDAD ===");
        System.out.println("1. Factorial (recursividad directa)");
        System.out.println("   Calcula el factorial de un número usando recursividad directa.");
        System.out.println("2. Fibonacci (recursividad indirecta)");
        System.out.println("   Calcula el número de Fibonacci en una posición usando recursividad indirecta.");
        System.out.println("3. Sumar dígitos de un número (recursividad directa)");
        System.out.println("   Suma los dígitos de un número entero positivo usando recursividad.");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");

        if (!sc.hasNextInt()) {
            System.out.println("Entrada no válida. Debes introducir un número.");
            sc.next(); // Limpiar entrada incorrecta
            mostrarMenu();
            return;
        }
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduce un número para calcular su factorial: ");
                if (!sc.hasNextLong()) {
                    System.out.println("Entrada no válida. Debes introducir un número entero.");
                    sc.next();
                    mostrarMenu();
                    return;
                }
                long numFact = sc.nextLong();
                System.out.println("Factorial de " + numFact + " = " + factorial(numFact));
                mostrarMenu();
                break;
            case 2:
                System.out.print("Introduce la posición para calcular Fibonacci: ");
                if (!sc.hasNextLong()) {
                    System.out.println("Entrada no válida. Debes introducir un número entero.");
                    sc.next();
                    mostrarMenu();
                    return;
                }
                long numFib = sc.nextLong();
                System.out.println("Fibonacci de " + numFib + " = " + fibonacci(numFib));
                mostrarMenu();
                break;
            case 3:
                System.out.print("Introduce un número entero positivo para sumar sus dígitos: ");
                if (!sc.hasNextLong()) {
                    System.out.println("Entrada no válida. Debes introducir un número entero positivo.");
                    sc.next();
                    mostrarMenu();
                    return;
                }
                long numSuma = sc.nextLong();
                if (numSuma < 0) {
                    System.out.println("El número debe ser positivo.");
                    mostrarMenu();
                    return;
                }
                System.out.println("La suma de los dígitos de " + numSuma + " es " + sumaDigitos(numSuma));
                mostrarMenu();
                break;
            case 4:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida.");
                mostrarMenu();
        }
    }

    /**
     * Método principal que inicia el programa mostrando el menú.
     */
    public static void main(String[] args) {
        mostrarMenu();
    }
}
