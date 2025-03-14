package br.com.jeverson.fileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExemplo {
    public static void main (String[]args){
        try {
            FileReader leitor = new FileReader("exemplo.txt");
            BufferedReader buffer = new BufferedReader(leitor);
            String linha;
            linha = buffer.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = buffer.readLine();
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("erro ao ler o arquivo");
        }
    }
}
