package br.com.jeverson;
//Programa que calcule a raiz cúbica de um número

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        int numero = 0;

        System.out.println("Insira um numero para calcularmos a raiz cubica");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        double cubica = Math.cbrt(numero);
        System.out.println("Seu numero em raiz cubica e:"+ cubica);


    }
}
