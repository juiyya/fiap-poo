package br.com.fiapride.main;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        System.out.println("=== FIAPRIDE: Teste de Classes Abstratas ===\n");

        // TESTE 1: Tentar criar Veiculo direto 
        // Veiculo v = new Veiculo("ABC-1234", "Generico"); 

        // TESTE 2: Criar objetos concretos
        Veiculo taxi = new Carro("ABC-1234", "Chevrolet Onix", 4);
        Veiculo mototaxi = new Moto("MOT-9999", "Honda Biz", false);

        System.out.println("Identificação dos Veículos:");
        taxi.exibirTipo();     
        mototaxi.exibirTipo(); 

        System.out.println("\n=== Polimorfismo com Classe Abstrata ===");

        Veiculo[] frota = new Veiculo[] {
            new Carro("CAR-1111", "Fiat Uno", 5),
            new Moto("MOT-2222", "Yamaha", false),
            new Carro("CAR-3333", "Honda Civic", 5)
        };

        for (Veiculo v : frota) {
            v.exibirTipo();
            System.out.println("---");
        }
    }
}