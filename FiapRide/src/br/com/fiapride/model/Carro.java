package br.com.fiapride.model;

public class Carro extends Veiculo {
    // atributo exclusivo do Carro (a mae n tem isso)
    private int capacidadePassageiros;

    public Carro(String placa, String modelo, int capacidadePassageiros) {

        super(placa, modelo); // repassando os atributos para o construtor da mae resolver

        this.setCapacidadePassageiros(capacidadePassageiros); // aqui o carro resolve oq é dele
    }

    // getters e setters exclusivos do carro  
    public int getCapacidadePassageiros() {
        return this.capacidadePassageiros;
    }

    private void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
}