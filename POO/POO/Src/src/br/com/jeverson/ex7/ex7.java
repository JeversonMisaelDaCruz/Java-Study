package br.com.jeverson.ex7;

import java.util.Scanner;

class Ex7 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de 10 pessoas e vamos concatenar todos eles:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        StringBuilder nomesContatenados = new StringBuilder();
        for (int i = 0; i < nomes.length; i++) {
            nomesContatenados.append(nomes[i]);
            if (i < nomes.length - 1) {
                nomesContatenados.append(", ");
            }
        }

        System.out.println("\nNomes concatenados:");
        System.out.println(nomesContatenados.toString());

        scanner.close();
    }
}