/**
* Autor: Patricio Calvo Valdés
* Fecha: 14/08/2025
* Descripción: Actividad 1 - Tipos de Listas
**/

public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev; // Para lista doblemente enlazada

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
