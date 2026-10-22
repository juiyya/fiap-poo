package br.com.minikita.main;

import br.com.minikita.model.Brincavel;
import br.com.minikita.model.Cachorro;
import br.com.minikita.model.VideoGame;
import br.com.minikita.model.Tutor;

public class MainPet {
    public static void main(String[] args) {
        System.out.println("=== TESTE DE INTERFACES ===");

        Tutor tutora = new Tutor("Julia");
        Cachorro meuCachorro = new Cachorro("Kita", tutora, 9.5);

        meuCachorro.alimentar(50); // dar energia antes de brincar

        VideoGame nintendo = new VideoGame("Nintendo Switch");

        // array tipado pela INTERFACE, agrupando dois objetos que não são parentes
        Brincavel[] opcoesDeLazer = new Brincavel[] { meuCachorro, nintendo };

        System.out.println("\nIniciando as brincadeiras:");
        for (Brincavel lazer : opcoesDeLazer) {
            lazer.iniciarBrincadeira();
            System.out.println("---");
        }
    }
}