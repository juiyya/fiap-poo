package br.com.fiapride.model;

public class Passageiro {
    private String nome;
    private String cpf; 
    private double saldo;

    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf); 
        this.setSaldo(0);
    }
    
    // metodo para pegar o saldo (leitura)
    public double getSaldo() {
    	return this.saldo;
    }
    
    // metodo para definir o saldo (escrita com regra de negocio)
    private void setSaldo(double valor) {
    	if (valor >=0) {
    		this.saldo = valor;
    	} else {
    		System.out.println("erro de segurança: tentativa de definir saldo negativo bloqueada");
    	}
    }
    
    public String getNome() {
    	return this.nome;
    }

    public void adicionarSaldo(double valor) {
        // Regra de negócio: O valor da recarga deve ser positivo
        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
            return; // Interrompe a execução do método
        }
        this.saldo += valor;
        System.out.println("Recarga realizada. Novo saldo: " + this.saldo);
    }

    public void pagarViagem(double custo) {
        // Regra de negócio: O custo deve ser positivo e o saldo deve ser suficiente
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é inválido.");
            return;
        }
        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante: " + this.saldo);
    }
}