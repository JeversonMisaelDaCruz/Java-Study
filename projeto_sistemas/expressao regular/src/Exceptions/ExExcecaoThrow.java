package Exceptions;

import java.util.Scanner;

public class ExExcecaoThrow {
    public static void main(String [] args) {
        Scanner leia = new Scanner(System.in);
        int idade = leia.nextInt();
        if(idade<18){
            throw new IllegalAccessException("idade minima é 18 anos");
        }
        leia.close();
    }
}
