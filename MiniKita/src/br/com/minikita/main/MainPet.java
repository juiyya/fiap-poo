package br.com.minikita.main;

import br.com.minikita.model.Cachorro;
import br.com.minikita.model.Gato;
import br.com.minikita.model.Pet;
import br.com.minikita.model.Tutor;
import java.util.ArrayList;
import java.util.List;

public class MainPet {
    public static void main(String[] args) {
        Tutor tutora = new Tutor("Julia");
        
        List<Pet> meusPets = new ArrayList<>();
        
        meusPets.add(new Cachorro("Kita", tutora, 9.5));
        meusPets.add(new Gato("Neko", tutora));

        System.out.println("=== TESTE POLIMÓRFICO: BANDA DOS PETS ===");

        for (Pet pet : meusPets) {
            System.out.print(pet.getNome() + " diz: ");
            System.out.println(pet.emitirSom()); 
        }
    }
}