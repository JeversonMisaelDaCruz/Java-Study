package agenda;

import java.util.Scanner;

//Criar um objeto contato nome luke skywalker
public class Principal {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um nome:");
        String nome = scanner.next();
        System.out.println("Insira o telefone:");
        String telefone = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o email:");
        String email = scanner.next();
        Contato contato = new Contato(nome, telefone, email);
        Persistencia persistencia = new Persistencia();
        persistencia.CriarArquivo();
        persistencia.inserir(contato);
    }
}
