package br.com.jeverson.ex1;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        System.out.println("Digite seu nome:");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Seu nome e:"+nome);
    }
}
