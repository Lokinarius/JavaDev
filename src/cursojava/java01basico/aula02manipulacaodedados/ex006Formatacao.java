package cursojava.java01basico.aula02manipulacaodedados;

import java.util.Scanner;

public class ex006Formatacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        double numero = sc.nextDouble();
        String numeroFormatado = String.format("%.2f", numero);

        System.out.println("O número com apenas duas casas decimais fica: "+ numeroFormatado);

        sc.close();
    }
}
