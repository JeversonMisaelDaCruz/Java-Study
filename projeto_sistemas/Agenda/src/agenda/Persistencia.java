package agenda;

import java.io.*;

public class Persistencia {

    private final String arquivo = "Contatos.txt";

    public void criarArquivo() {
        File file = new File(arquivo);
        try {
            if (file.createNewFile()){
                System.out.println("Arquivo criado com sucesso!");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo!");
        }
    }
    public void inserir(Contato contato) {
        FileWriter filewriter = null;
        try {
            filewriter = new FileWriter(arquivo, true);
            BufferedWriter buffer = new BufferedWriter(filewriter);
            buffer.write(contato.getNome() + ";" + contato.getTelefone() + ";" + contato.getEmail());
            buffer.newLine();
            buffer.close();
        } catch (IOException e) {
            System.out.println("Erro ao inserir contato!");
        }

    }
    public void lerArquivo() {

        try {
            FileReader leitor = new FileReader("Contatos.txt");
            BufferedReader lerArquivo = new BufferedReader(leitor);
            String linha;
            linha = lerArquivo.readLine();
            while (linha != null) {
                String valores [] = linha.split(";");
                Contato contato = new Contato();
                contato.setNome(valores[0]);
                contato.setTelefone(valores[1]);
                contato.setEmail(valores[2]);
                System.out.println(contato.getNome());
                System.out.println(contato.getTelefone());
                System.out.println(contato.getEmail());
                linha = lerArquivo.readLine();
            }
            lerArquivo.close();
        } catch (IOException e) {
            System.out.println("Erro ao abrir arquivo");
        }


    }
    public void editarArquivo(String nomeAntigo, Contato contatoEditado) {
        File arquivoTemp = new File("Contatos_temp.txt");

        try (BufferedReader lerArquivo = new BufferedReader(new FileReader(arquivo));
             BufferedWriter buffer = new BufferedWriter(new FileWriter(arquivoTemp))) {

            String linha;
            while ((linha = lerArquivo.readLine()) != null) {
                String[] valores = linha.split(";");
                if (valores[0].equalsIgnoreCase(nomeAntigo)) {
                    buffer.write(contatoEditado.getNome() + ";" + contatoEditado.getTelefone() + ";" + contatoEditado.getEmail());
                } else {
                    buffer.write(linha);
                }
                buffer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ao editar arquivo!");
            return;
        }

        if (!arquivoTemp.renameTo(new File(arquivo))) {
            System.out.println("Erro ao substituir o arquivo original!");
        } else {
            System.out.println("Contato editado com sucesso!");
        }
    }


}
