/**
* Autor: Patricio Calvo Valdés
* Fecha: 14/08/2025
* Descripción: Actividad 1 - Tipos de Listas
**/

public class LinkedList<T> {
    Node<T> head;
    boolean isDoubly;
    boolean isCircular;

    public LinkedList(boolean isDoubly, boolean isCircular) {
        this.isDoubly = isDoubly;
        this.isCircular = isCircular;
        this.head = null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            if (isCircular) head.next = head;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null && (!isCircular || temp.next != head)) {
            temp = temp.next;
        }
        temp.next = newNode;

        if (isDoubly) {
            newNode.prev = temp;
        }
        if (isCircular) {
            newNode.next = head;
            if (isDoubly) head.prev = newNode;
        }
    }

    public void delete(T data) {
        if (head == null) return;

        Node<T> temp = head;
        Node<T> prev = null;

        do {
            if (temp.data.equals(data)) {
                if (prev != null) prev.next = temp.next;
                else head = temp.next;

                if (isDoubly && temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                if (isCircular && head != null) {
                    Node<T> last = head;
                    while (last.next != head) last = last.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != null && (!isCircular || temp != head));
    }

    public boolean search(T data) {
        if (head == null) return false;

        Node<T> temp = head;
        do {
            if (temp.data.equals(data)) return true;
            temp = temp.next;
        } while (temp != null && (!isCircular || temp != head));
        return false;
    }

    public void display() {
        if (head == null) {
            System.out.println("Lista vacía.");
            return;
        }

        Node<T> temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != null && (!isCircular || temp != head));
        System.out.println(isCircular ? "(circular)" : "null");
    }
}
