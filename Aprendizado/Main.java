package Aprendizado;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
    
        Cadastro cadastro = new Cadastro(nome, email, senha, idade);
        cadastro.Acao();
        scanner.close();
    }
}