package cursojava.java01basico.aula02manipulacaodedados;

import java.util.Scanner;

public class ex002replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite uma frase: ");
        String texto = sc.nextLine();
        String semVogal = texto.replaceAll("[aAeEiIoOuU]", "*");

        System.out.println("Você digitou " + texto);
        System.out.println("A frase sem vogal ficou: " + semVogal);

        sc.close();
    }
}
