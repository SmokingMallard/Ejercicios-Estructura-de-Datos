public class MazeSolver {
    static int [][] maze = {
        {1,0,0,0},
        {1,1,0,1},
        {0,1,0,0},
        {1,1,1,1}
    };
    
    Static boolean is Safe(int x, int y){
    return (x >= 0 && x < N && y >= 0 && y < M && maze[x][y] == 1);
}
    static int [][] solution = new int[4][4];
    static int N = maze.length;
    static int M = maze[0].length;
    public static void main(String[] args) {
        if(solveMaze(0,0)){
            printSolution();
        } else {
            System.out.println("No solution found");
        }
    }
}

