package cursojava.java01basico.aula01tiposprimitivos;

// Classe principal do exemplo
public class ex002tiposPrimitivos {

    // Todo programa Java começa pelo método main()
    public static void main(String[] args) {

        /* TIPOS PRIMITIVOS */

        // int → números inteiros de tamanho médio (mais usado no dia a dia)
        int ano = 2025;

        // byte → tipo inteiro MUITO pequeno (-128 a 127), usado quando queremos economizar memória
        byte idade = 30;

        // short → inteiro pequeno, útil quando precisamos de valores até ~32 mil
        short saldo = 30000;

        // long → inteiros MUITO grandes; precisa do "L" no final para dizer que é long
        long coordenada = 33454758572392872L;

        // float → números decimais pequenos; exige "f" no final para indicar que é float
        float altura = 1.8f;

        // double → número decimal padrão; mais preciso que float
        double peso = 86.54;

        // boolean → guarda verdadeiro (true) ou falso (false)
        boolean verdadeiro = true;

        // char → armazena apenas UM caractere; usa aspas simples
        char letra = 'F';

        // String NÃO é tipo primitivo, mas é muito usada para textos
        String nome = "William";

        // Exibindo valores no console usando concatenação de strings
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
