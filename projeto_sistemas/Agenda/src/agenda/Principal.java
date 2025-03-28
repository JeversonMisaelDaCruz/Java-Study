package agenda;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int escolha = 0;
        int i = 0;

        Scanner leia = new Scanner(System.in);
        Persistencia persistencia = new Persistencia();
        Contato contato = new Contato();
        persistencia.criarArquivo();

        while(escolha<3){

            System.out.println("O que voce quer fazer? 1 - inserir contato ; 2 - listar contatos ; 3 - sair");
            escolha = leia.nextInt();

            switch(escolha){
                case 1:

                    while (i<2){

                        contato.escreverContato(leia);
                        System.out.println("Quer escrever mais um contato?");
                        System.out.println("1 para sim, 2 para nao");
                        i = leia.nextInt();
                        persistencia.inserir(contato);

                    }
                    break;
                case 2:

                    persistencia.lerArquivo();

                    break;
                case 3:
                    System.out.println("Tchau");
                    break;
            }
        }

    }
}

