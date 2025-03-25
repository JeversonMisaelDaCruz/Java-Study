package br.com.jeverson.ex7;

import java.util.Scanner;

//Programa que leia o nome de 10 pessoas e informe os nomes concatenados
public class ex7 {
    public static void main(String[] args){
        String[] nomes = new String[10];
        System.out.println("Digite o nome de 10 pessoas vamos concatenar todos eles");
            Scanner scanner = new Scanner(System.in);
        for (int i = 0;i<10;i++){
            nomes[i] = scanner.nextLine();

        }
        System.out.println(nomes);
    }
}
