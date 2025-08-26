public class PriorityQueue<T extends Comparable<T>> {
    private PriorityNode<T>[] heap;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = (PriorityNode<T>[]) new PriorityNode[capacity];
    }

    public void push(int priority, T data) {
        if (size == capacity) {
            throw new IllegalStateException("La cola está llena");
        }
        PriorityNode<T> node = new PriorityNode<>(priority, data);
        heap[size] = node;
        siftUp(size);
        size++;
    }

    // Imprime los datos en orden ascendente de prioridad
    public void show() {
        // Copia los nodos actuales
        PriorityNode<T>[] copia = new PriorityNode[size];
        System.arraycopy(heap, 0, copia, 0, size);

        // Ordena la copia por prioridad
        java.util.Arrays.sort(copia, (a, b) -> Integer.compare(a.getPriority(), b.getPriority()));

        System.out.print("Elementos en orden ascendente de prioridad:\n");
        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i].getData());
            if (i < copia.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    // ...el resto de la clase igual...
    private void siftUp(int idx) {
        while (idx > 0) {
            int parent = (idx - 1) / 2;
            if (heap[idx].getPriority() < heap[parent].getPriority()) {
                swap(idx, parent);
                idx = parent;
            } else {
                break;
            }
        }
    }

    private void siftDown(int idx) {
        while (true) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int smallest = idx;

            if (left < size && heap[left].getPriority() < heap[smallest].getPriority()) {
                smallest = left;
            }
            if (right < size && heap[right].getPriority() < heap[smallest].getPriority()) {
                smallest = right;
            }
            if (smallest != idx) {
                swap(idx, smallest);
                idx = smallest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        PriorityNode<T> temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
//