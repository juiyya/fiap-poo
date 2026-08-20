package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Pet;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
       //  Passageiro passageiro1 = new Passageiro();
        // passageiro1.nome = "Ana Silva";
        // passageiro1.saldo = 50.0;

        // Criando o segundo passageiro (Objeto 2)
        // Passageiro passageiro2 = new Passageiro();
        // passageiro2.nome = "Carlos Souza";
        // passageiro2.saldo = 12.50;

        // Exibindo os dados no Console
        // System.out.println("--- Sistema FiapRide ---");
        // System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
        // System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
        
    	Pet meuPet = new Pet();
    	meuPet.nome = "Kita";
    	meuPet.cor = "Preto";
    	// Fabriquei a segunda (Instância 2)
    	Pet petDoProfessor = new Pet();
    	petDoProfessor.nome = "Kato";
    	petDoProfessor.cor = "Branco";
    	System.out.println("Meu Pet é: " + meuPet.cor);
    	System.out.println("O do Professor é: " + petDoProfessor.cor);
    }
}