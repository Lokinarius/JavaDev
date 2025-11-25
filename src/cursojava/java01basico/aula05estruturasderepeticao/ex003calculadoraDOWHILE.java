package cursojava.java01basico.aula05estruturasderepeticao;

import java.util.Scanner;

public class ex003calculadoraDOWHILE {
    // DO WHILE
    // O Do While precisa de uma condição LÓGICA/BOOLEANA  para encerrar o loop

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("==== CALCULADORA ====");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();


            double num1 = 0, num2 = 0;
            if(opcao >= 1 && opcao <= 4){
                System.out.println("Digite um numero: ");
                num1 = sc.nextDouble();
                System.out.println("Digite outro numero: ");
                num2 = sc.nextDouble();
            }

            switch (opcao){
                case 1:
                    System.out.println(num1+" + "+num2+" = "+(num1 + num2));
                    break;
                case 2:
                    System.out.println(num1+" - "+num2+" = "+(num1 - num2));
                    break;
                case 3:
                    System.out.println(num1+" x "+num2+" = "+(num1 * num2));
                    break;
                case 4:
                    if(num2==0){
                        System.out.println("Não existe divisão por zero");
                        break;
                    }else{
                        System.out.println(num1+" / "+num2+" = "+(num1 / num2));
                        break;
                    }
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }while (opcao != 5);

        sc.close();
    }

}
