package br.com.jeversonmisael.aula0603;

public class Principal {
    public static void main (String[] args){
        Pessoa P1 = new Pessoa();
        Pessoa P2 = new Pessoa();
        Pessoa P3 = new Pessoa();

        P1.nome = "joao";
        P1.idade = 22;
        System.out.println(P1.nome);
        System.out.println(P1.idade);
        P2.nome = "Salsicha";
        P2.idade = 12;
        System.out.println(P2.nome);
        System.out.println(P2.idade);
        P3.nome = "Scobby";
        P3.idade = 45;
        System.out.println(P3.nome);
        System.out.println(P3.idade);
    }
}
