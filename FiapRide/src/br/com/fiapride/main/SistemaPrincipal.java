package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {
        System.out.println("=== FIAPRIDE ===\n");
        // --- TESTE 1: PASSAGEIROS (aula 03) ---
        System.out.println("--- 1. Testando Passageiros ---");

        Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222.222-22");
        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333.333.333-33");

        passageiro1.adicionarSaldo(50.0);
        passageiro2.adicionarSaldo(12.5);

        System.out.println("Passageiro 1: " + passageiro1.getNome() + " | Saldo: R$ " + passageiro1.getSaldo() + " | CPF: " + passageiro1.getCpf());
        System.out.println("Passageiro 2: " + passageiro2.getNome() + " | Saldo: R$ " + passageiro2.getSaldo() + " | CPF: " + passageiro2.getCpf());

        //testando a regra de negócio de viagens
        System.out.println("\n> Pagando viagem de R$ 20.00 para Ana...");
        passageiro1.pagarViagem(20.0);

        System.out.println("> Pagando viagem de R$ 20.00 para Carlos...");
        passageiro2.pagarViagem(20.0); // deve ser bloqueado por saldo insuficiente

        // --- TESTE 2: VEÍCULOS (aula 04) ---
        System.out.println("\n--- 2. Testando Veículos ---");

        // Instanciação obrigando placa e modelo no nascimento
        Veiculo meuCarro = new Veiculo("ABC-1234", "Toyota Corolla");

        System.out.println("Modelo: " + meuCarro.getModelo() + " | Placa: " + meuCarro.getPlaca());

        System.out.println("\n> Solicitando alteração de placa...");
        meuCarro.atualizarPlaca("XYZ-9876");
    }
}