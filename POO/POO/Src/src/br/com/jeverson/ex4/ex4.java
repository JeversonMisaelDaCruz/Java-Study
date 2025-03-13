package br.com.jeverson.ex4;

import java.util.Scanner;

public class ex4 {
    public  static void main(String[]args){
        int n1,n2,n3;
        System.out.println("Insira tres numeros");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        System.out.println("Insira o segundo numero2");
        new Scanner(System.in);
        n2 = sc.nextInt();
        System.out.println("Insira o terceiro numero");
        new Scanner(System.in);
        n3 = sc.nextInt();
        int total = n1+n2+n3;
            int resultado = total/3;
            if(resultado<7){
                System.out.println("Sua media e maior que 7:"+resultado);
            }else{
            System.out.println("Sua media e "+ resultado);
            }

    }
}
