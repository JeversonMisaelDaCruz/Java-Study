import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira o numero");
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        if(numero % 2 == 0){
            System.out.println("par");
        }else {
            System.out.println("impar");
        }
    }
}