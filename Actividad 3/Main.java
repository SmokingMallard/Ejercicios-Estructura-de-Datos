/**
* Autor: Patricio Calvo Valdés
* Fecha: /09/2025
* Descripción: Actividad 3
**/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Menú principal
            System.out.println("\n--- Menú de opciones ---");
            System.out.println("1. Calcular término de Fibonacci");
            System.out.println("2. Verificar suma de subconjuntos");
            System.out.println("3. Resolver Sudoku");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            String entrada = sc.next();

            // Solo permite opciones válidas
            if (!entrada.matches("[1-4]")) {
                System.out.println("Opción no válida. Intente de nuevo.");
                continue;
            }

            int opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 1:
                    // Fibonacci
                    System.out.print("Ingrese el valor de n: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Entrada inválida. Debe ser un número entero.");
                        sc.next();
                        break;
                    }
                    int n = sc.nextInt();
                    int resultado = Fibonacci.fibonacci(n);
                    System.out.println("El término " + n + " de Fibonacci es: " + resultado);
                    break;
                case 2:
                    // Subset Sum simplificado
                    System.out.println("Escriba los números separados por espacio (ejemplo: 1 2 3 4):");
                    sc.nextLine();
                    String numeros = sc.nextLine();
                    String[] partes = numeros.trim().split("\\s+");
                    int[] conjunto = new int[partes.length];
                    for (int i = 0; i < partes.length; i++) {
                        try {
                            conjunto[i] = Integer.parseInt(partes[i]);
                        } catch (NumberFormatException e) {
                            System.out.println("Solo se permiten números enteros.");
                            conjunto = null;
                            break;
                        }
                    }
                    if (conjunto == null) break;
                    System.out.print("¿Qué suma objetivo desea buscar?: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Entrada inválida. Debe ser un número entero.");
                        sc.next();
                        break;
                    }
                    int objetivo = sc.nextInt();
                    boolean existe = SubsetSum.existeSubconjunto(conjunto, objetivo);
                    if (existe) {
                        System.out.println("¡Sí existe un subconjunto que suma " + objetivo + "!");
                    } else {
                        System.out.println("No existe subconjunto que sume " + objetivo + ".");
                    }
                    break;
                case 3:
                    // Sudoku con validación estricta de formato y líneas en blanco
                    System.out.println("\nCopia el siguiente tablero, reemplaza los '0' por los números de tu Sudoku, y pégalo aquí:");
                    System.out.println("+-------+-------+-------+");
                    System.out.println("| 0 0 0 | 0 0 0 | 0 0 0 |");
                    System.out.println("| 0 0 0 | 0 0 0 | 0 0 0 |");
                    System.out.println("| 0 0 0 | 0 0 0 | 0 0 0 |");
                    System.out.println("+-------+-------+-------+");
                    System.out.println("| 0 0 0 | 0 0 0 | 0 0 0 |");
                    System.out.println("| 0 0 0 | 0 0 0 | 0 0 0 |");
                    System.out.println("| 0 0 0 | 0 0 0 | 0 0 0 |");
                    System.out.println("+-------+-------+-------+");
                    System.out.println("| 0 0 0 | 0 0 0 | 0 0 0 |");
                    System.out.println("| 0 0 0 | 0 0 0 | 0 0 0 |");
                    System.out.println("| 0 0 0 | 0 0 0 | 0 0 0 |");
                    System.out.println("+-------+-------+-------+");
                    System.out.println("\nPega el tablero aquí, incluyendo los símbolos y espacios exactamente igual:");

                    int[][] tablero = new int[9][9];
                    sc.nextLine(); // Limpia el buffer
                    int filaActual = 0;
                    int lineasProcesadas = 0;
                    boolean formatoValido = true;
                    while (filaActual < 9 && formatoValido) {
                        if (!sc.hasNextLine()) {
                            formatoValido = false;
                            break;
                        }
                        String linea = sc.nextLine().trim();
                        lineasProcesadas++;
                        // Ignora líneas vacías
                        if (linea.isEmpty()) {
                            formatoValido = false;
                            break;
                        }
                        // Solo procesa líneas que empiezan con '|'
                        if (!linea.startsWith("|")) continue;
                        String[] valores = linea.replace("|", "").replace("+", "").trim().split("\\s+");
                        if (valores.length != 9) {
                            formatoValido = false;
                            break;
                        }
                        int col = 0;
                        for (String valor : valores) {
                            if (valor.equals("")) continue;
                            try {
                                tablero[filaActual][col] = Integer.parseInt(valor);
                                col++;
                                if (col == 9) break;
                            } catch (NumberFormatException e) {
                                formatoValido = false;
                                break;
                            }
                        }
                        if (col != 9) {
                            formatoValido = false;
                            break;
                        }
                        filaActual++;
                    }
                    // Verifica que se hayan leído exactamente 9 filas válidas y que no haya errores de formato
                    if (!formatoValido || filaActual != 9) {
                        System.out.println("No se siguieron las instrucciones corectamente. Asegúrese de pegar el tablero completo con el formato correcto.");
                        break;
                    }
                    if (SudokuSolver.resolverSudoku(tablero)) {
                        System.out.println("\nSolución del Sudoku:");
                        imprimirTablero(tablero);
                    } else {
                        System.out.println("No se pudo resolver el Sudoku.");   
                    }
                    break;
                case 4:
                    // Salir
                    continuar = false;
                    System.out.println("¡Hasta luego!");
                    break;
            }
        }
        sc.close();
    }

    // Imprime el tablero de Sudoku
    private static void imprimirTablero(int[][] tablero) {
        System.out.println("+-------+-------+-------+");
        for (int i = 0; i < 9; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(tablero[i][j] + " ");
                if ((j + 1) % 3 == 0) System.out.print("| ");
            }
            System.out.println();
            if ((i + 1) % 3 == 0) System.out.println("+-------+-------+-------+");
        }
    }
}