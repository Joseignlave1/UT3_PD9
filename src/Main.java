import java.util.Stack;

public class Main {

    public static boolean controlCorchetes(char[] listaEntrada) {
        Stack<Character> controlStack = new Stack<>();
        for(char c: listaEntrada) {
            if(c == '{') {
                controlStack.push(c);
            } else if(c == '}') {
                controlStack.pop();
            }
        }
        return controlStack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        char[] testList = {'{','}','{','{','}','}'};

        System.out.println(controlCorchetes(testList));
    }

    /*
        Lenguaje Natural: Recorro el Array, mientras los caractéres sean iguales a '{' los añado a la pila
        Cuándo encuentro un caractér '}', indica que hay un cierre, por lo que quito al carácter que está en la pila.
        Si la pila está vacía, significa que hay un corchete que cierra para cada corchete que abre, indicando que los cierres
        se hicieron correctamente.
     */
}