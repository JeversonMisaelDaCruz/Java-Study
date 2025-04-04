package br.com.jeverson.ex12;
//Exercício 2: Classe Conta Bancária (Com métodos para depositar, sacar e exibir saldo)
class conta{
    String dono;
    double saldo;


    public conta(String dono,double saldo){
        this.dono = dono;
        this.saldo = saldo;

    }

    public void exibirSaldo(){
        System.out.println("seu saldo atual e:"+ saldo);
    }

    public void sacar(double valorSaque){
        System.out.println("voce esta sacando:" + valorSaque);
        this.saldo -= valorSaque;
        System.out.println("seu saldo atual agora e:"+ saldo);
    }

    public void depositar(double valorDeposito) {
        System.out.println("voce esta depositando:"+valorDeposito);
        this.saldo += valorDeposito;
        System.out.println("seu saldo atual agora e:"+saldo);
    }

}

class ex12 {
    public static void main(String[] args) {
    conta Minhaconta = new conta("jeverson",1000);
    Minhaconta.depositar(500);
    Minhaconta.sacar(500);
    Minhaconta.exibirSaldo();

    }
}
