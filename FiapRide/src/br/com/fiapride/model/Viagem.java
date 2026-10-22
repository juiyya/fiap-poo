package br.com.fiapride.model;

public class Viagem {

    // 1. atributos simpls
    private String destino;
    private double valor;
    
    // 2. atributos de associação (objetos complexos)
    // Clean Code: O nome da variável indica O PAPEL que o objeto desempenha na Viagem!
    private Passageiro solicitante;
    private Veiculo veiculoUtilizado;

    // 3. construtor (regra de negócio)
    public Viagem(String destino, Passageiro solicitante, Veiculo veiculoUtilizado) {
        this.destino = destino;
        this.solicitante = solicitante;
        this.veiculoUtilizado = veiculoUtilizado;
        this.valor = 0.0; 
        System.out.println("Nova viagem solicitada para: " + this.destino);
    }
    // 4. métodos de ação
    public void exibirResumo() {
        System.out.println("\n--- RESUMO DA VIAGEM ---");
        System.out.println("Destino: " + this.destino);
        // Navegação entre os objetos
        // Eu entro na Viagem -> pego o Solicitante -> pego o Nome dele.
        System.out.println("Passageiro: " + this.solicitante.getNome());
        System.out.println("Veiculo: " + this.veiculoUtilizado.getModelo() + " (Placa: " + this.veiculoUtilizado.getPlaca() + ")\n");
    }

    public String getDestino() { return this.destino; }
    public Passageiro getSolicitante() { return this.solicitante; }
    public Veiculo getVeiculoUtilizado() { return this.veiculoUtilizado; }
}