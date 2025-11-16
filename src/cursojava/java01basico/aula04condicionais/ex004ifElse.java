package cursojava.java01basico.aula04condicionais;

import java.util.Scanner;

public class ex004ifElse {
    // Operadores relacionais
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        // diferente do ternario, o if-else é podem  ser mais estruturados , alem de possuirem uma maior legibilidade
        if(num1 > num2){
            System.out.println("O primeiro número ,"+num1+", é maior que o segundo número ,"+num2);
        } else if (num2 > num1) {
            System.out.println("O segundo número ,"+num2+", é maior que o primeiro número ,"+num1);
        } else {
            System.out.println("Os dois números são iguais");
        }
    }
}
