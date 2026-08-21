package br.com.fiapride.main;

import br.com.fiapride.model.Pet;

public class MainPet {

    public static void main(String[] args) {

        Pet meuPet = new Pet("Kita", "Cachorro");

        System.out.println("----------- iniciar pet ------------");
        System.out.println("Pet: " + meuPet.getNome() + " | Espécie: " + meuPet.getEspecie());
        System.out.println("Energia Inicial: " + meuPet.getEnergia());
        System.out.println("------------------------------------");

        meuPet.brincar(15.0);		// tentativa brincar (erro - sem energia)
        meuPet.alimentar(20.0);
        meuPet.brincar(15.0);
        meuPet.dormir();
    }
}