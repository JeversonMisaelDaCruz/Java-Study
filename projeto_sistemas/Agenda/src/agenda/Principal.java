package agenda;

import java.util.Scanner;

//Criar um objeto contato nome luke skywalker
public class Principal {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        Persistencia persistencia = new Persistencia();
        persistencia.CriarArquivo();
        persistencia.inserir(contato);
        System.out.println("Insira um nome:");
        String nome = scanner.next();
        System.out.println("Insira o telefone:");
        String telefone = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o email:");
        String email = scanner.next();
        Contato contato = new Contato(nome, telefone, email);

        String opcao;
        Int escolha;
    while (escolha<=3)
        switch (opcao){
            case 1:
                for(i=0,i>2;i++){
                    contato Contato = new contato(nome,telefon, email);
                    System.out.println("Insira um nome:");
                    String nome = scanner.next();
                    System.out.println("Insira o telefone:");
                    String telefone = scanner.next();
                    scanner.nextLine();
                    System.out.println("Insira o email:");
                    String email = scanner.next();
                    Contato contato = new Contato(nome, telefone, email);
                    System.out.println("deseja inserir um novo usuario? se sim digite 1, se não 2");
                }
                break;
            case 2:
                break;
            case 3:
                break;
        }


    }
}
