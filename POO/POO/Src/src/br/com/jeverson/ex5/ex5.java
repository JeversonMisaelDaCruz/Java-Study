package br.com.jeverson.ex5;
//Escreva um programa que leia um dia da semana em formato de número
//(domingo=0, segunda=1, ...) e exiba uma mensagem “Bom” seguido do nome
//do dia.

import java.util.Scanner;

public class ex5 {
    public static void main(String[]args){
        int dia;
        System.out.println("Insira o dia da semana para mensagem de bom dia! em numeros:");
        Scanner sc = new Scanner(System.in);
        dia = sc.nextInt();
        switch (dia){
            case 1:
                System.out.println("Bom dia hoje e segunda feira");
                break;
            case 2:
                System.out.println("Bom dia hoje e terça feira");
                break;
            case 3:
                System.out.println("Bom dia hoje e quarta feira");
                break;
            case 4:
                System.out.println("Bom dia hoje e quinta feira");
                break;
            case 5:
                System.out.println("Bom dia hoje e sexta feira");
                break;
            case 6:
                System.out.println("Bom dia hoje e sabado");
                break;
            case 7:
                System.out.println("Bom dia hoje e domingo");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }

    }
}
