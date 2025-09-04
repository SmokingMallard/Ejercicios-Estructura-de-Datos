/**
* Autor: Patricio Calvo Valdés
* Fecha: /09/2025
* Descripción: Actividad 3
**/

public class Fibonacci {

    // Función recursiva para calcular el enésimo número de Fibonacci
    public static int fibonacci(int n) {
        // Caso base: si n es 0, retorna 0
        if (n == 0) {
            return 0;
        }
        // Caso base: si n es 1, retorna 1
        if (n == 1) {
            return 1;
        }
        // Caso recursivo: suma los dos anteriores
        // Llama a la función para n-1 y n-2
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}