package cursojava.java01basico.aula03operadoreslogicoserelacionais;
import java.util.Scanner;

public class ex001OperadoresAritimeticos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[CALCULADORA]");
        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println("A soma de "+ numero1+" e "+numero2+" é: "+soma);
        System.out.println("A subtração de "+ numero1+" e "+numero2+" é: "+subtracao);
        System.out.println("A multiplicação de "+ numero1+" e "+numero2+" é: "+multiplicacao);
        System.out.println("A divisão de "+ numero1+" e "+numero2+" é: "+divisao);
        System.out.println("O resto de divisão do "+ numero1+" com o "+numero2+" é: "+resto);

    }
}
