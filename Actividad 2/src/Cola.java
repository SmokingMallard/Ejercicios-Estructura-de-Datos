/**
* Autor: Patricio Calvo Valdés
* Fecha: 21/08/2025
* Descripción: Implementación de Cola usando lista ligada
**/

public class Cola<T> {
    private Node<T> frente;
    private Node<T> fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    // Agrega un elemento al final de la cola (enqueue)
    public void encolar(T dato) {
        Node<T> nuevo = new Node<>(dato);
        if (estaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.next = nuevo;
            fin = nuevo;
        }
    }

    // Elimina y retorna el elemento del frente de la cola (dequeue)
    public T desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return null;
        }
        T dato = frente.data;
        frente = frente.next;
        if (frente == null) fin = null;
        return dato;
    }

    // Retorna el elemento del frente sin eliminarlo
    public T verFrente() {
        if (estaVacia()) return null;
        return frente.data;
    }

    // Verifica si la cola está vacía
    public boolean estaVacia() {
        return frente == null;
    }

    // Muestra los elementos de la cola
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía.");
            return;
        }
        Node<T> temp = frente;
        System.out.print("Frente -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
