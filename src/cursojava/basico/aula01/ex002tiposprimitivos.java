package cursojava.basico.aula01;

public class ex002tiposprimitivos {
    // JAVA É UMA LIGUAGEM FORTEMENTE TIPADA
    public static void main(String[] args) {
        /* TIPOS PRIMITIVOS */
        int ano = 2025;
        byte idade = 30; // Feito para economizar memória, bem limitado -128 a 127
        short saldo = 30000;
        long coordenada = 33454758572392872L; //necessita do l no final
        float altura = 1.8f; // necessita do f no final
        double peso = 86.54;
        boolean verdadeiro = true;
        char letra = 'F'; // Caractere único, aspas simples
        String nome = "William";

        System.out.println("Ano: " + ano);
        System.out.println("idade: " + idade);
        System.out.println("saldo: " + saldo);
        System.out.println("coordenadas: " + coordenada);
        System.out.println("altura: " + altura);
        System.out.println("peso: " + peso);
        System.out.println("verdadeiro: " + verdadeiro);
        System.out.println("letra: " + letra);
        System.out.println("nome: " + nome);

    }
}
