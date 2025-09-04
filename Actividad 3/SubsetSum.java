/**
* Autor: Patricio Calvo Valdés
* Fecha: /09/2025
* Descripción: Actividad 3
**/

public class SubsetSum {

    // Método recursivo para verificar si existe un subconjunto con suma igual al objetivo
    public static boolean existeSubconjunto(int[] nums, int objetivo) {
        // Llama al método auxiliar iniciando desde el último índice
        return existeSubconjuntoAux(nums, nums.length - 1, objetivo);
    }

    // Método auxiliar recursivo
    private static boolean existeSubconjuntoAux(int[] nums, int index, int objetivo) {
        // Caso base: si el objetivo es 0, se encontró un subconjunto
        if (objetivo == 0) {
            return true;
        }
        // Caso base: si no quedan elementos y objetivo no es 0
        if (index < 0) {
            return false;
        }
        // Caso recursivo: incluir o no el elemento actual
        // Verifica si se puede formar el objetivo con o sin el elemento actual
        return existeSubconjuntoAux(nums, index - 1, objetivo) ||
               existeSubconjuntoAux(nums, index - 1, objetivo - nums[index]);
    }
}