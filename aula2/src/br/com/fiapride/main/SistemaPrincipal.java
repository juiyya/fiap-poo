package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {

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
        
    	// DEAFIO 
    	
    	// Pet meuPet = new Pet();
    	// meuPet.nome = "Kita";
    	// meuPet.cor = "Preto";
    	// Fabriquei a segunda (Instância 2)
    	// Pet petDoProfessor = new Pet();
    	// petDoProfessor.nome = "Kato";
    	// petDoProfessor.cor = "Branco";
    	// System.out.println("Meu Pet é: " + meuPet.cor);
    	// System.out.println("O do Professor é: " + petDoProfessor.cor);
    	
           
            Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
            System.out.println("Regarga passageiro 1");
            passageiro1.adicionarSaldo(50.0);

            // Criando o segundo passageiro (Objeto 2)
            Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
            System.out.println("Regarga passageiro 2");
            passageiro2.adicionarSaldo(12.5);

            System.out.println("--- Sistema FiapRide ---");
            System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
            System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
            
            System.out.println("Pagando viagem do passageiro 1");
            passageiro1.pagarViagem(20);
            System.out.println("Pagando viagem do passageiro 2");
            passageiro2.pagarViagem(20);

    }
}
    	
    
