package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Main {
	
	public static void main(String[] args) {
		
		Veiculo veiculo1 = new Veiculo("Carlos", "ABC-1234");

		veiculo1.adicionarGasolina(50);
		veiculo1.gastarGasolina(30);
		
		System.out.println("Dono: " + veiculo1.getIndividuo() + " | Placa: " + veiculo1.getPlaca() + "| Gasolina: " + veiculo1.getGasolina());		
	}
}
