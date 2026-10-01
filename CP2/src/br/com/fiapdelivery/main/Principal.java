package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.*;

public class Principal {
    public static void main(String[] args) {
        
        Caminhao caminhao = new Caminhao("ABC1234", 500.0, 6);
        Pacote pacote = new Pacote("BR999", 10.5, "Pendente");
        
        Rota rotaCaminhao = new Rota(pacote, caminhao);
        rotaCaminhao.realizarEntrega();

        Moto moto = new Moto("XYZ9876", 20.0, true);
        Rota rotaMoto = new Rota(pacote, moto);
        rotaMoto.realizarEntrega();
    }
}