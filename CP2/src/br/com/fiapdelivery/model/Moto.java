package br.com.fiapdelivery.model;
public class Moto extends Veiculo {

    private boolean possuiBau;

    public Moto(String placa, double capacidade, boolean possuiBau) {
        super(placa, capacidade);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }
}
