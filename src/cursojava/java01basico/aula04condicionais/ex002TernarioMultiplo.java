package cursojava.java01basico.aula04condicionais;

import java.util.Scanner;

public class ex002TernarioMultiplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = sc.nextInt();

        String vota = (idade >= 16 && idade < 60)
                ? "Você pode votar!"
                : (idade > 60)
                ? "Seu voto é facultativo"
                : "Voce não pode votar!";

        System.out.println(vota);
    }
}
