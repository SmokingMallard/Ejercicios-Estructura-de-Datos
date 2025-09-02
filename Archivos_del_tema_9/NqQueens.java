public class NqQueens {
    static int N = 8;
    static int[] board = new int[N];
    static int solutionCount = 0; // Contador de tableros

    static void printBoard() {
        solutionCount++;
        System.out.println("Tablero " + solutionCount);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i] == j) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Resuelve la determinación para la reina en la fila
     * que se le está indicando
     * @param row fila a evaluar
     */
    public static void solve(int row) {
        if (row == N) {
            printBoard();
            return;
        }
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row] = col;
                solve(row + 1);
            }
        }
    }

    /**
     * Verifica si no colisiona con las reinas ya colocadas
     * @param row fila
     * @param col columna
     * @return true si es seguro colocar la reina en esa posición
     */
    static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        solve(0);
    }
}
