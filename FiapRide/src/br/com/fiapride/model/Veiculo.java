package br.com.fiapride.model;

public abstract class Veiculo {
    
    // atributos privados (encapsulamento)
    private String placa;
    private String modelo;
    private double nivelCombustivel;

    // construtor
    public Veiculo(String placa, String modelo) {
        this.setPlaca(placa);
        this.modelo = modelo; 
        System.out.println("Registro inicial: Um " + this.modelo + " nasceu com a placa " + this.placa);
    }

    public String getPlaca() { return this.placa; }
    public String getModelo() { return this.modelo; }

    public abstract void exibirTipo();

    // COMPORTAMENTO PÚBLICO
    public void atualizarPlaca(String novaPlaca) {
        System.out.println("Solicitada atualização de placa no Detran para o veiculo " + this.modelo + "...");
        this.setPlaca(novaPlaca); 
    }

    public String calcularAutonomia() {
        return "Autonomia não definida para um veículo genérico.";
    }
    public void abastecer(int quantidade) {
        this.setNivelCombustivel(this.getNivelCombustivel() + quantidade);
    }

    public double getNivelCombustivel() {
        return this.nivelCombustivel;
    }

    private void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    // SETTERS PRIVADOS
    // O modificador é 'private'. Ninguém de fora da classe consegue usar.
    private void setPlaca(String novaPlaca) {
        // Regra de negócio: a placa não pode ser nula nem vazia
        if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
            this.placa = novaPlaca;
            System.out.println("Sucesso: A placa agora é " + this.placa);
        } else {
            System.out.println("Erro de Validação: A placa informada é invalida!");
        }
    }
}