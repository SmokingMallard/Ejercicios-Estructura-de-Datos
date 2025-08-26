import java.util.Random;

public class Codigo_06_03 {
    public static void main(String[] args) {
        Hashtable<Integer> numbers = new Hashtable<>();

        Random rand = new Random();
        System.out.println("Números insertados:");
        for (int i = 0; i < 20; i++) {
            int num = rand.nextInt(100); // Números random entre 0 y 99
            System.out.print(num + " ");
            numbers.put(num);
        }
        System.out.println("\n\nTabla Hash:");
        numbers.printTable();
    }
}
