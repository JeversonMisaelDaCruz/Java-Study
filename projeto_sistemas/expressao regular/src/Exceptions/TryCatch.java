package Exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try{
            int x = 0;
            int y = 100/x;
            System.out.println("resultado" + y);
        }
        catch(ArithmeticException e){
            System.out.println("Erro " + e.getMessage());
        }
    }
}
