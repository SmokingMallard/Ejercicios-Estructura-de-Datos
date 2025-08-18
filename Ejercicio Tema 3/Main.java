import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una expresión infija:");
        String infija = sc.nextLine();

        Convertidor convertidor = new Convertidor();
        Evaluador evaluador = new Evaluador();

        String postfija = convertidor.infijoAPostfijo(infija);
        System.out.println("Expresión postfija: " + postfija);

        double resultado = evaluador.evaluarPostfijo(postfija);
        System.out.println("Resultado: " + resultado);
    }
}
