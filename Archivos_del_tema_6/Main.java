import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(20);
        int[] valores = new int[10];
        Random rand = new Random();

        System.out.println("Agregando valores aleatorios a la PriorityQueue:");
        for (int i = 0; i < 10; i++) {
            int val = rand.nextInt(100);
            valores[i] = val;
            pq.push(val, val);
            System.out.print(val);
            if (i < 9) System.out.print(", ");
        }
        System.out.println("\n");

        System.out.println("Mostrando en orden ascendente de prioridad:");
        pq.show();
    }
}