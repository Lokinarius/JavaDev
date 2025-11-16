package cursojava.java01basico.aula04condicionais;

import java.util.Scanner;

public class ex001EqualsTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o usuário");
        String user = sc.nextLine();
        System.out.println("Digite a senha");
        String pass = sc.nextLine();


        boolean userapp = (user.equals("Admin")? true : false);
        boolean passapp = (pass.equals("Admin")? true : false);
        String app = (userapp && passapp) ? "Acesso permitido" : "Acesso negado";

        System.out.println(app);
    }
}
