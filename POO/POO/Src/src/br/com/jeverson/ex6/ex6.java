package br.com.jeverson.ex6;
//Programa utilizando for que leia 10 números e calcule a média e o maior deles

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        int maior = Integer.MIN_VALUE;

        System.out.println("Insira dez numeros:");

        for(int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();

            soma += numeros[i];

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        double media = (double) soma / 10;

        System.out.println("A média dos números é: " + media);
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}