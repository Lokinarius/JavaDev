package cursojava.java01basico.aula02manipulacaodedados;

import java.util.Scanner;

public class ex005manipulacaoDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        String res1 = Integer.toString(num1);
        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();
        String res2 = Integer.toString(num2);


        //
        System.out.println("A soma entre " + num1 + " e " +  num2 + " é " + (num1+num2)+ ". e sua forma em String é " + (res1 + res2) );
    }
}
