package br.com.fiapride.model;

// 'implements' = assina o contrato
public class CarroEletrico extends Veiculo implements Recarregavel {

    private int nivelBateria;

    public CarroEletrico(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public void exibirTipo() {
        System.out.println("Sou um Carro Elétrico");
    }

    // OBRIGATÓRIO: Implementar método da interface
    @Override
    public void recarregar(int percentual) {
        if (percentual < Recarregavel.CARGA_MINIMA || percentual > Recarregavel.CARGA_MAXIMA) {
            System.out.println("Erro: Percentual inválido!");
            return;
        }

        System.out.println("Carro " + this.getModelo() + " recarregado para " + percentual + "%");
        this.setNivelBateria(percentual);

    }

    @Override
    public String calcularAutonomia() {
        double kmRestante = this.getNivelBateria() * 5.0;
        return "Autonomia: " + kmRestante + " km.";
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
}