import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Estructuras de la actividad 2
        Pila<String> historialComandos = new Pila<>();
        Cola<String> procesos = new Cola<>();

        // Estructura de la actividad 1
        System.out.println("Seleccione el tipo de lista:");
        System.out.println("1. Simplemente enlazada");
        System.out.println("2. Doblemente enlazada");
        System.out.println("3. Circular");

        int tipo = 0;
        while (true) {
            String input = sc.nextLine();
            try {
                tipo = Integer.parseInt(input);
                if (tipo >= 1 && tipo <= 3) break;
                else System.out.println("Elija una de las opciones mostradas.");
            } catch (NumberFormatException e) {
                System.out.println("Elija una de las opciones mostradas.");
            }
        }

        boolean isDoubly = (tipo == 2);
        boolean isCircular = (tipo == 3);

        LinkedList<Object> lista = new LinkedList<>(isDoubly, isCircular);

        int opcion = -1;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Insertar elemento en lista");
            System.out.println("2. Eliminar elemento de lista");
            System.out.println("3. Buscar elemento en lista");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Ejemplos de tipos de datos");
            System.out.println("6. Insertar contacto");
            System.out.println("7. Ejecutar comando (pila)");
            System.out.println("8. Deshacer último comando");
            System.out.println("9. Agregar proceso a cola");
            System.out.println("10. Ejecutar proceso de cola");
            System.out.println("11. Mostrar pila y cola");
            System.out.println("0. Salir");

            String opcionInput = sc.nextLine();
            try {
                opcion = Integer.parseInt(opcionInput);
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un valor (texto): ");
                    String valor = sc.nextLine();
                    lista.insert(valor);
                    break;
                case 2:
                    System.out.print("Valor a eliminar: ");
                    String elim = sc.nextLine();
                    lista.delete(elim);
                    break;
                case 3:
                    System.out.print("Valor a buscar: ");
                    String busq = sc.nextLine();
                    System.out.println(lista.search(busq) ? "Encontrado" : "No encontrado");
                    break;
                case 4:
                    lista.display();
                    break;
                case 5:
                    DataTypeExamples.ejemploPrimitivo();
                    DataTypeExamples.ejemploComplejo();
                    DataTypeExamples.ejemploAbstracto();
                    break;
                case 6:
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Dirección: ");
                    String dir = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String tel = sc.nextLine();
                    lista.insert(new DataTypeExamples.Contacto(nom, dir, tel));
                    break;
                case 7:
                    System.out.print("Ingrese comando a ejecutar: ");
                    String cmd = sc.nextLine();
                    historialComandos.push(cmd);
                    System.out.println("Comando ejecutado: " + cmd);
                    break;
                case 8:
                    String deshacer = historialComandos.pop();
                    if (deshacer != null) System.out.println("Se deshizo el comando: " + deshacer);
                    break;
                case 9:
                    System.out.print("Ingrese nombre del proceso: ");
                    String proc = sc.nextLine();
                    procesos.encolar(proc);
                    System.out.println("Proceso agregado: " + proc);
                    break;
                case 10:
                    String ejecutar = procesos.desencolar();
                    if (ejecutar != null) System.out.println("Ejecutando proceso: " + ejecutar);
                    break;
                case 11:
                    System.out.println("Historial de comandos (pila):");
                    historialComandos.mostrar();
                    System.out.println("Procesos en cola:");
                    procesos.mostrar();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Elija una de las opciones mostradas.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
