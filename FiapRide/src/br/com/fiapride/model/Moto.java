package br.com.fiapride.model;

public class Moto extends Veiculo {

    @Override
    public void exibirTipo() {
        System.out.println("Sou uma Moto");
    }

    private boolean isEletrica;

    public Moto(String placa, String modelo, boolean isEletrica) {
        super(placa, modelo); 
        this.isEletrica = isEletrica;
    }

    public boolean isEletrica() {
        return this.isEletrica;
    }

    @Override
    public String calcularAutonomia() {
        double kmRestante = this.getNivelCombustivel() * 35.0;
        return "Autonomia: " + kmRestante + " km (Consumo de 35 km/L).";
    }
}