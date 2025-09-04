/**
* Autor: Patricio Calvo Valdés
* Fecha: /09/2025
* Descripción: Actividad 3
**/

public class SudokuSolver {

    // Método principal para resolver el Sudoku usando backtracking
    public static boolean resolverSudoku(int[][] tablero) {
        // Busca una celda vacía en el tablero
        for (int fila = 0; fila < 9; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                // Si la celda está vacía (valor 0)
                if (tablero[fila][columna] == 0) {
                    // Prueba números del 1 al 9 en la celda vacía
                    for (int num = 1; num <= 9; num++) {
                        // Verifica si el número es válido en la posición actual
                        if (esValido(tablero, fila, columna, num)) {
                            tablero[fila][columna] = num; // Asigna el número
                            // Llama recursivamente para resolver el resto del tablero
                            if (resolverSudoku(tablero)) {
                                return true;
                            }
                            // Si no se puede resolver, deshace el cambio (backtracking)
                            tablero[fila][columna] = 0;
                        }
                    }
                    // Si ningún número es válido, retorna falso
                    return false;
                }
            }
        }
        // Si no hay celdas vacías, el Sudoku está resuelto
        return true;
    }

    // Verifica si es válido colocar un número en la posición dada
    private static boolean esValido(int[][] tablero, int fila, int columna, int num) {
        // Verifica la fila y la columna
        for (int i = 0; i < 9; i++) {
            if (tablero[fila][i] == num || tablero[i][columna] == num) {
                return false;
            }
        }
        // Verifica el subcuadro 3x3
        int inicioFila = (fila / 3) * 3;
        int inicioColumna = (columna / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[inicioFila + i][inicioColumna + j] == num) {
                    return false;
                }
            }
        }
        // Si pasa todas las verificaciones, es válido
        return true;
    }
}