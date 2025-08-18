public class Convertidor {

    private int precedencia(char op) {
        switch (op) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
            default: return 0;
        }
    }

    private boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public String infijoAPostfijo(String expr) {
        StringBuilder salida = new StringBuilder();
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == ' ') continue;

            if (Character.isDigit(c) || c == '.') {
                while (i < expr.length() && (Character.isDigit(expr.charAt(i)) || expr.charAt(i) == '.')) {
                    salida.append(expr.charAt(i));
                    i++;
                }
                salida.append(' ');
                i--;
            } else if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    salida.append(pila.pop()).append(' ');
                }
                pila.pop();
            } else if (esOperador(c)) {
                while (!pila.isEmpty() && precedencia(c) <= precedencia(pila.peek()) && pila.peek() != '(') {
                    salida.append(pila.pop()).append(' ');
                }
                pila.push(c);
            }
        }

        while (!pila.isEmpty()) {
            salida.append(pila.pop()).append(' ');
        }

        return salida.toString().trim();
    }
}
