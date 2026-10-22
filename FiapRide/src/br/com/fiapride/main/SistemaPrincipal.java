package br.com.fiapride.main;

import br.com.fiapride.model.CarroEletrico;
import br.com.fiapride.model.Celular;
import br.com.fiapride.model.Recarregavel;
import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("=== FIAPRIDE: Teste de Interfaces ===");
        System.out.println();

        // Criamos objetos de classes DIFERENTES
        CarroEletrico tesla = new CarroEletrico("TES-9999", "Tesla Model 3");
        Celular iphone = new Celular("iPhone 15");

        // POLIMORFISMO DE INTERFACE:
        // Ambos podem ser tratados como 'Recarregavel'
        Recarregavel[] recarregaveis = new Recarregavel[] {
                tesla,
                iphone
        };

        System.out.println("=== Recarregando Tudo ===");
        for (Recarregavel r : recarregaveis) {
            r.recarregar(85); // Mesmo método, comportamentos diferentes
            System.out.println("---");
        }

        System.out.println();
        System.out.println("=== Múltiplos Tipos ===");

        // CarroEletrico É UM Veiculo E TAMBÉM É UM Recarregavel
        System.out.println("Tesla é um Veiculo? " + (tesla instanceof Veiculo)); // true
        System.out.println("Tesla é Recarregavel? " + (tesla instanceof Recarregavel)); // true

        // Celular NÃO é Veiculo, MAS é Recarregavel
        System.out.println("Celular é um Veiculo? " + (Veiculo.class.isInstance(iphone))); // false
        System.out.println("Celular é Recarregavel? " + (iphone instanceof Recarregavel)); // true

        System.out.println();
        System.out.println("=== Autonomia do Carro Elétrico ===");
        System.out.println(tesla.calcularAutonomia());

        System.out.println();
        System.out.println("=== Bateria do Celular ===");
        System.out.println(iphone.getNivelBateria());
    }
}