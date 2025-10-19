package cursojava.java01basico.aula02operadoreslogicoserelacionais;

import java.util.Scanner;

public class ex001OperadoresLogicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para verdadeiro e 0 para falso");
        System.out.println("Digite 0 primeiro número: ");
        int primeiro = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundo = sc.nextInt();

        boolean pchave = (primeiro == 1);
        boolean schave = (segundo == 1);

        // OPERAÇÕES LÓGICAS
        boolean e = pchave && schave;
        boolean ou = pchave || schave;
        boolean naoum = !pchave;
        boolean naodois = !schave;

        System.out.println("Operação (AND)&&: " + e);
        System.out.println("Operação (OR)||: "+ ou);
        System.out.println("Operação (NOT) !: " + naoum);
        System.out.println("Operação (NOT) !: "+ naodois);
    }
}
