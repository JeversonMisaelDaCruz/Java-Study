package br.com.jeverson.ex2;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        System.out.println("Digite um numero:");
        Scanner sc = new Scanner(System.in);
        Integer n1 = sc.nextInt();
        System.out.println("Digite um  segundo numero:");
        Integer n2 = sc.nextInt();
        Integer Soma = n1 + n2;
        System.out.println("Soma:"+Soma);
    }
}
