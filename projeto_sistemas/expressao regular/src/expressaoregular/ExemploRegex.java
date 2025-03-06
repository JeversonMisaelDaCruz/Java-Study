package expressaoregular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploRegex {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("digite um cep");
        String cep;
        System.out.println("Digite cep no formato XXXXXXX-XXX");
        cep = leia.nextLine();
        String regex = "\\d(5)-\\d(3)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cep);

        if (matcher.matches()) {
            System.out.println("CEP valido");
        } else {
            System.out.println("CEP invalido");
        }
    }
}
