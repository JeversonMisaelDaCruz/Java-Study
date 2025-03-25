
public class Carro {
    private String modelo;
    public Carro(String modelo){
        this.modelo = modelo;
    }
    public String Getmodelo(){
        return modelo;
    }
    public  static void main(String[]args){
        Pessoa pessoa = new Pessoa("guilherme");
        Carro carro = new Carro("Marea");

        System.out.println(pessoa.Getnome() + "Tem um carro"+ carro.Getmodelo());
    }
}
