package br.com.jeverson.ex10;
// Programa que calcule a raiz cúbica de um número
import java.util.Scanner;

class ex10 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double numero;
         System.out.println("Insira um numero vamos fazer a raiz cubica do mesmo.");
         numero = scanner.nextDouble();
         numero = Math.cbrt(numero);
         System.out.println("A raiz cubica e:"+ numero);
        scanner.close();
     }

}
