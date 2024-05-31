package exerciciosFundamentos;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o usuário: ");
        String usuario = entrada.nextLine();
        
        System.out.println("\nDigite a senha: ");
        String senha = entrada.nextLine();
        
        System.out.println("\nAcesso liberado");
        
        entrada.close();
    }
}
