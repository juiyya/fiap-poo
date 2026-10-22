package br.com.minikita.main;

import br.com.minikita.model.Pet;
import br.com.minikita.model.Tutor;

public class MainPet {
    public static void main(String[] args) {
        System.out.println("----------- Iniciar Pet ------------");
        
        // 1. Instanciar o Tutor
        Tutor tutora = new Tutor("Julia");
        
        // 2. Instanciar o Pet com Associação ao Tutor
        Pet meuPet = new Pet("Kita", "Cachorro", tutora);

        // 3. Provar que a Associação funciona lendo um dado do objeto associado
        System.out.println("Tutor Responsável: " + meuPet.getDono().getNome());
        System.out.println("Pet: " + meuPet.getNome() + " | Espécie: " + meuPet.getEspecie());
        System.out.println("------------------------------------\n");

        meuPet.alimentar(20.0);
    }
}