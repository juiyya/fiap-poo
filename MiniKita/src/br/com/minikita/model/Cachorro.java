package br.com.minikita.model;

public class Cachorro extends Pet {
    private double nivelFaro;

    public Cachorro(String nome, Tutor dono, double nivelFaro) {
        super(nome, "Cachorro", dono); 
        this.nivelFaro = nivelFaro;
    }

    public void farejar() {
        System.out.println(this.getNome() + " está a farejar o chão... (Nível: " + this.nivelFaro + ")");
    }
}