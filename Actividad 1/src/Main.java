import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
            System.out.println("1. Insertar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Ejemplos de tipos de datos");
            System.out.println("6. Insertar contacto");
            System.out.println("0. Salir");

            String opcionInput = sc.nextLine();
            try {
                opcion = Integer.parseInt(opcionInput);
            } catch (NumberFormatException e) {
                opcion = -1; // Para que caiga en default
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
