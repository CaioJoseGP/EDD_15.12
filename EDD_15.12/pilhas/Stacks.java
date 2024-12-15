package pilhas;

import java.util.Stack;

public class Stacks {
    private static Stack<String> pilha = new Stack<>();

    public static String inverterString(String frase) {
        StringBuilder resultado = new StringBuilder(frase);
        String reverse = resultado.reverse().toString();

        return reverse;
    }

    public static String[] separarString(String reverse) {
        String[] palavras = reverse.split(" ");

        return palavras;
    }

    public static void criarPilha(String[] palavras) {
        for(String iterar : palavras) {
            pilha.push(iterar);
        }
    }

    public static String puxarPilha() {
        StringBuilder resultado = new StringBuilder();

        while(!pilha.isEmpty()) {
            resultado.append(pilha.pop() + " ");
        }

        return resultado.toString();
    }
}