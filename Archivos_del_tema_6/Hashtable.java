import java.util.LinkedList;
import java.util.List;

public class Hashtable<E> {

    public static final int M = 10; // Tamaño del listado cambiado a 10
    List<E>[] data = new List[M]; // Arreglo de Listas

    @SuppressWarnings("unchecked")
    public Hashtable() {
        for (int i = 0; i < M; i++) {
            data[i] = new LinkedList<>();
        }
    }

    /**
     * Hashfunction división
     * @param value Valor a encontrar su hashfunction
     * @return key
     */
    private int hashfunction(E value) {
        int result = 0;
        // Asumiendo que el valor se puede castear a entero
        result = ((Integer) value) % M;
        return result;
    }

    public void put(E value) {
        int key = hashfunction(value);
        data[key].add(value);
    }

    public boolean contains(E value) {
        int key = hashfunction(value);
        return data[key].contains(value);
    }

    public void printTable() {
        for (int i = 0; i < M; i++) {
            System.out.print(i + ": ");
            for (E val : data[i]) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}