package br.com.jeverson.ex11;


class Carro {
    private String modelo;
    private int ano;
    private String motor;


    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }


    public void ligarCarro() {
        System.out.println("Você está ligando seu carro modelo " + modelo + ", fabricado no ano de " + ano);
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}


class Ex11 {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Fiat", 2008);


        meuCarro.setModelo("Cringe");


        meuCarro.ligarCarro();
    }
}
