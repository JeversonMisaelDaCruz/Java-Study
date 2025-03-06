package expressaoregular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CpfRegex {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu CPF (formato: 123.456.789-00):");
        String cpf = leia.nextLine();
        String regexCpf = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

        Pattern patternCpf = Pattern.compile(regexCpf);
        Matcher matcherCpf = patternCpf.matcher(cpf);

        if (matcherCpf.matches()) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }

        leia.close();
    }
}