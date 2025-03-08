package br.com.jeverson.fileWriter;

import br.com.jeverson.logging.ExemploLogger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileExemplo {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("exemplo.txt");
            BufferedWriter buffer = new BufferedWriter(escritor);
            buffer.write("Hello World");
            buffer.newLine();
            buffer.write("Hello duck");
            buffer.close();
        } catch (IOException e) {
            Logger.getLogger(FileExemplo.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
