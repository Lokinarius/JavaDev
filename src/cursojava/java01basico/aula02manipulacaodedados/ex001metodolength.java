package cursojava.java01basico.aula02manipulacaodedados;

import java.util.Scanner;

public class ex001metodolength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String texto = sc.nextLine();
        int caracteres = texto.length();

        System.out.println("A frase digitad foi: " + texto);
        System.out.println("e ela possui " + caracteres + " caracteres");

        sc.close();
    }
}
