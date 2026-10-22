package br.com.minikita.main;

import br.com.minikita.model.Pet;

public class MainPet {

    public static void main(String[] args) {
        System.out.println("----------- Iniciar Pet ------------");
        Pet meuPet = new Pet("Kita", "Cachorro");

        System.out.println("Pet: " + meuPet.getNome() + " | Espécie: " + meuPet.getEspecie());
        System.out.println("Energia Inicial: " + meuPet.getEnergia());
        System.out.println("------------------------------------\n");

        meuPet.brincar(15.0);       // erro (inicia com 10, esforço é 15)
        
        System.out.println("\n--- Hora de comer ---");
        meuPet.alimentar(20.0);     // sobe para 30
        meuPet.brincar(15.0);       // cai para 15
        
        System.out.println("\n--- Hora de dormir ---");
        meuPet.dormir();            // sobe para 45
        
        System.out.println("\n--- Testando a Regra de Limite (Max 100) ---");
        meuPet.alimentar(150.0);    // força energia acima do limite
    }
}