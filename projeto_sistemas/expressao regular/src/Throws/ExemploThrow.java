package Throws;

import Exceptions.TryCatch;

import java.security.PrivilegedActionException;
import java.util.Scanner;

public class ExemploThrow {
public static void ValidadeIdade ( int idade) throws IllegalArgumentException{
    if(idade<18){
        throw  new IllegalArgumentException("Não autorizado");
    }else{
        System.out.println("autorizado");
    }
}
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira a sua idade");
        int id = leia.nextInt();
        try {
        ValidadeIdade(id);
        }catch (IllegalArgumentException error){
            System.out.println("erro capturado"+ error.getMessage());
        }

    }
}
