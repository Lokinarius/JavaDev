package cursojava.java01basico.aula01tiposprimitivos;

import java.util.Scanner;

public class ex003String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Como você se chama? ");
        String nome = sc.nextLine();

        String mensagem = ", como foi o seu dia?";
        String saudacao = "Olá, ";
        int tamanhoNome = nome.length();
        boolean eOGoku = nome.equals("Goku");

        System.out.println(saudacao + nome + mensagem);
        System.out.println("Seu nome tem " + tamanhoNome + " letras");
        System.out.println(eOGoku);

    }

}
