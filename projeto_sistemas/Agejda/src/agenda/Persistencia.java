package agenda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Persistencia {
    private  final String arquivo = "Contatos.txt";

    public  void CriarArquivo(){
        File file = new File(arquivo);
        try {
            if(file.createNewFile()){
                System.out.println("Arquivo criado com sucesso");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo");
        }
    }
    public  void inserir(Contato contato){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(arquivo, true);
        BufferedWriter buffer = new BufferedWriter(fileWriter);
        buffer.write(contato.getNome()+ ";"+
                        contato.getTelefone()+";"+
                        contato.getEmail());
        buffer.close();
        }catch (IOException e){
            System.out.println("Erro ao criar contato");
        }
    }
}
