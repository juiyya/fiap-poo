package br.com.minikita.model;

public class Gato extends Pet {
    private boolean caiDePe;

    public Gato(String nome, Tutor dono) {
        super(nome, "Gato", dono);
        this.caiDePe = true; 
    }

    public void pular() {
        System.out.println(this.getNome() + " deu um grande salto.");
        if (this.caiDePe) {
            System.out.println("... E caiu em pé, claro!");
        }
    }
    @Override
    public String emitirSom() {
        return "Miau";
    }
}