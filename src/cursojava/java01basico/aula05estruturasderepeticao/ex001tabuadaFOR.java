package cursojava.java01basico.aula05estruturasderepeticao;

import java.util.Scanner;

public class ex001tabuadaFOR {
    // FOR
    // Utilizada quando você sabe o número de repetições
    // Inicialização, condição, incremento
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("\nTabuada do número "+ num +": ");

        // FOR
        //(inicialização; condição; incremento)

        for (int numero = 1; numero < 10; numero++) {
            System.out.println(num+" X "+numero+" = "+(num*numero));
        }
        sc.close();
    }
}
