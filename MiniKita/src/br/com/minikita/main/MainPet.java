package br.com.minikita.main;

import br.com.minikita.model.Cachorro;
import br.com.minikita.model.Gato;
import br.com.minikita.model.Tutor;

public class MainPet {
    public static void main(String[] args) {
        Tutor tutora = new Tutor("Julia");
        
        Cachorro meuCachorro = new Cachorro("Kita", tutora, 9.5);
        Gato meuGato = new Gato("Neko", tutora);

        System.out.println("Tutor Responsável: " + meuCachorro.getDono().getNome());
        System.out.println("Meu pet 1: " + meuCachorro.getNome() + " | Espécie: " + meuCachorro.getEspecie());
        meuCachorro.farejar(); 
        
        System.out.println("\nMeu pet 2: " + meuGato.getNome() + " | Espécie: " + meuGato.getEspecie());
        meuGato.pular(); 
    }
}