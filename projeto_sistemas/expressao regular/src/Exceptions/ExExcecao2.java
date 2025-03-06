package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExExcecao2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        try{
            System.out.println("informe um valor para x :");
            int x = leia.nextInt();
            int y = 100/x;
            System.out.println("resultado :"+ y);
        }
        catch(ArithmeticException e){
            System.out.println("operacao invalida!");
            System.out.println("Erro " + e.getMessage());

        }
        catch(InputMismatchException e){
            System.out.println("operacao invalida!");
            System.out.println("Error:"+ e.getMessage());
        }
        catch(Exception e){}
    }
}
