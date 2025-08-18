public class Stack<T> {

    private Node<T> top;

    // Clase interna Node
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor vacío
    public Stack() {
        top = null;
    }

    // Push
    public void push(T value) {
        Node<T> node = new Node<>(value);
        node.next = top;
        top = node;
    }

    // Pop
    public T pop() {
        if (isEmpty()) throw new RuntimeException("Pila vacía");
        T value = top.data;
        top = top.next;
        return value;
    }

    // Peek
    public T peek() {
        if (isEmpty()) throw new RuntimeException("Pila vacía");
        return top.data;
    }

    // Vacía
    public boolean isEmpty() {
        return top == null;
    }
}
