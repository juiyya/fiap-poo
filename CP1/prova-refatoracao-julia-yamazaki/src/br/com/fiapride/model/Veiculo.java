package br.com.fiapride.model;

public class Veiculo {
	
	private String individuo;
	private String placa;
	private double gasolina;
	
	public Veiculo(String individuo, String placa) {
		this.individuo = individuo;
		this.placa = placa;
		this.setGasolina(0); 
	}
	
	public void adicionarGasolina(double valor) {
		if (valor > 0) {
			this.gasolina += valor;
		} else {
			System.out.println("aalor invalido para abastecer.");
		}
	}
	
	public void gastarGasolina(double valor) {
		if (valor > 0 && this.gasolina >= valor) {
			this.gasolina -= valor;
		} else {
			System.out.println("erro: gasolina insuficiente ou valor invalido.");
		}
	}
	
	private void setGasolina(double valor) {
		if (valor >= 0) {
			this.gasolina = valor;
		} else {
			System.out.println("tentativa de adicionar gasolina negativa bloqueada");
		}
	}
	
	public String getIndividuo() {
		return this.individuo;
	}
	
	public String getPlaca() { return this.placa; }
	public double getGasolina() { return this.gasolina; }


	


	
}