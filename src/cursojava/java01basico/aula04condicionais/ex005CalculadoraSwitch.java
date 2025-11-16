package cursojava.java01basico.aula04condicionais;

import java.util.Scanner;

// O switch permite que haja comparação de uma varíavel
public class ex005CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Escolha uma operação( +, -, *, /): ");
        String opera = sc.nextLine();


        /*
         if (operador == '+') {
            resultado = num1 + num2;
        } else if (operador == '-') {
            resultado = num1 - num2;
        } else if (operador == '*') {
            resultado = num1 * num2;
        } else if (operador == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: divisão por zero!");
                sc.close();
                return;
            }
        } else {
            System.out.println("Operador inválido!");
            sc.close();
            return;
        }*/



        switch(opera){
            case "+":
                System.out.println("Soma : "+(num1+num2));
                break;
            case "-":
                System.out.println("Subtração: "+(num1-num2));
                break;
            case "*":
                System.out.println("Multiplicação: "+(num1*num2));
                break;
            case "/":
                if(num2 != 0){
                    System.out.println("Divisão: "+((double)num1 / num2));
                    break;
                }else{
                    System.out.println("Não existe divisão por zero!");
                }
            default:
                System.out.println("Operção inválida");
        }
    }
}
