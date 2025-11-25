package cursojava.java01basico.aula05estruturasderepeticao;

public class ex002chaveWHILE {
    // WHILE
    // While executa repetidamente um bloco de código enquanto uma condição for verdadeira
    public static void main(String[] args) {
        int num = 1;
        int soma = 1;
        System.out.println("Soma de um a cem: ");
        while (num <= 100){
            System.out.println(num+" + "+soma+" = "+(soma+num));
            num++;
        }
    }
}
