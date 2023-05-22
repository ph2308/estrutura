import java.util.*;

public class VerificadorDeExpressao {

    public static boolean verificarExpressao(String expressao) {
        Stack<Character> pilha = new Stack<>();
        
        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pilha.isEmpty()) {
                    return false;
                }
                char topo = pilha.pop();
                if ((c == ')' && topo != '(') || (c == ']' && topo != '[') || (c == '}' && topo != '{')) {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }
    
    public static void main(String[] args) {
        String expressao1 = "x+y*(3+z)";
        String expressao2 = "x+y*(3+";
        
        if (verificarExpressao(expressao1)) {
            System.out.println("A expressão " + expressao1 + " está correta");
        } else {
            System.out.println("A expressão " + expressao1 + " está incorreta");
        }
        
        if (verificarExpressao(expressao2)) {
            System.out.println("A expressão " + expressao2 + " está correta");
        } else {
            System.out.println("A expressão " + expressao2 + " está incorreta");
        }
    }
}