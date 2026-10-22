package br.com.fiapride.model;

public class Veiculo {
    
    // atributos privados (encapsulamento)
    private String placa;
    private String modelo;

    // construtor
    public Veiculo(String placa, String modelo) {
        this.setPlaca(placa);
        this.modelo = modelo; 
        System.out.println("Registro inicial: Um " + this.modelo + " nasceu com a placa " + this.placa);
    }

    // getters apenas leitura
    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    // COMPORTAMENTO PÚBLICO
    // Este é o método que o programa principal vai chamar. Ele representa uma ação real.
    public void atualizarPlaca(String novaPlaca) {
        System.out.println("Solicitada atualização de placa no Detran para o veiculo " + this.modelo + "...");
        this.setPlaca(novaPlaca); 
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