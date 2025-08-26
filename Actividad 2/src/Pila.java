/**
* Autor: Patricio Calvo Valdés
* Fecha: 21/08/2025
* Descripción: Implementación de Pila usando lista ligada
**/

public class Pila<T> {
    private Node<T> cima;

    public Pila() {
        this.cima = null;
    }

    // Agrega un elemento al tope de la pila
    public void push(T dato) {
        Node<T> nuevo = new Node<>(dato);
        nuevo.next = cima;
        cima = nuevo;
    }

    // Elimina y retorna el elemento del tope de la pila
    public T pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return null;
        }
        T dato = cima.data;
        cima = cima.next;
        return dato;
    }

    // Retorna el elemento del tope sin eliminarlo
    public T peek() {
        if (estaVacia()) return null;
        return cima.data;
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return cima == null;
    }

    // Muestra los elementos de la pila
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Node<T> temp = cima;
        System.out.print("Tope -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
