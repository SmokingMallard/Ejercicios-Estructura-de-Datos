public class Evaluador {

    public double evaluarPostfijo(String expr) {
        Stack<Double> pila = new Stack<>();
        String[] tokens = expr.split("\\s+");

        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                pila.push(Double.parseDouble(token));
            } else {
                double b = pila.pop();
                double a = pila.pop();
                switch (token) {
                    case "+": pila.push(a + b); break;
                    case "-": pila.push(a - b); break;
                    case "*": pila.push(a * b); break;
                    case "/": pila.push(a / b); break;
                    case "^": pila.push(Math.pow(a, b)); break;
                }
            }
        }

        return pila.pop();
    }
}
