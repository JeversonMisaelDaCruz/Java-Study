package agenda;
import java.util.Scanner;

public class Contato {
    String nome;
    String telefone;
    String email;

    public Contato() {
    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void escreverContato(Scanner leia){
        nome = leia.nextLine();
        System.out.println("Escreva o nome do contato");
        nome = leia.nextLine();
        System.out.println("Escreva o telefone do contato");
        telefone = leia.nextLine();
        System.out.println("Escreva o email do contato");
        email = leia.nextLine();
    }
}
