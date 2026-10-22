package br.com.fiapride.main;

import br.com.fiapride.model.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // 1. Criamos uma lista da SUPERCLASSE que aceita qualquer herdeiro
        List<Veiculo> frota = new ArrayList<>();
        
        // CORREÇÃO: Adicionado o 3º parâmetro exigido pelos construtores da Aula 6
        // Carro exige: placa, modelo, capacidadePassageiros
        frota.add(new Carro("ABC-1234", "Honda Civic", 4));
        
        // Moto exige: placa, modelo, isEletrica
        frota.add(new Moto("DEF-5678", "Honda CG 160", false));

        System.out.println("--- RELATÓRIO DE AUTONOMIA DA FROTA ---");
        
        // O mesmo comando produz resultados diferentes!
        for (Veiculo veiculo : frota) {
            System.out.println("Veiculo: " + veiculo.getModelo());
            
            // se for Carro, usa a conta do carro. Se for Moto, usa a da moto.
            veiculo.abastecer(50);
            System.out.println(veiculo.calcularAutonomia());
            System.out.println("---------------------------------------");
        }
    }
}