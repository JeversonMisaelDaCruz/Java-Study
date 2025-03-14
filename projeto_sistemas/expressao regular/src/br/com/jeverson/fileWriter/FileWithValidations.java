package br.com.jeverson.fileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileWithValidations {
    public static void main(String[]args){
        File arquivo = new File("arquivo.txt");
        boolean existe = arquivo.exists() && arquivo.length()>0;
        try{
            FileWriter escritor = new FileWriter("exemplo.txt");
            BufferedWriter buffer = new BufferedWriter(escritor);
            if(existe){
                buffer.newLine();
                //Atividade e pedir para que o usuario insir algo
                buffer.write("");
            }
        }catch (IOException e){
         Logger.getLogger(FileWithValidations.class.getName()).log(Level.SEVERE,null, e);
        }
    }
}
