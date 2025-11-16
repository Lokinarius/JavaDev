package cursojava.java01basico.aula04condicionais;

import java.util.Scanner;

public class ex003ParEPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        // VERIFICAÇÃO
        boolean positivo = num > 0;
        boolean negativo = num < 0;
        boolean par = num %2 == 0;

        // if - else if - else
        // OPERAÇÃO TERNARIA
        // Condicional simples para uma operação lógica
        System.out.println(positivo?"O número é positivo":negativo?"O número é negativo":"O número é zero");
        System.out.println(par?"O número é par":"O número é impar");
    }
}
