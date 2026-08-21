package br.com.fiapride.model;

public class Pet {
    private String nome;
    private String especie;
    private double energia;

    public Pet(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
        this.energia = 0.0; 
    }

    // acoes

    public void alimentar(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("erro: a quantidade de comida deve ser > 0.");
            return; 
        }
        this.energia += quantidade;
        System.out.println(this.nome + " comeu! energia subiu para: " + this.energia);
    }

    public void brincar(double esforco) {
        if (esforco <= 0) {
            System.out.println("erro: esforço para brincar é inválido.");
            return;
        }
        if (this.energia < esforco) {
            System.out.println("wrro: energia insuficiente. " + this.nome + " não consegue brincar agora.");
            return;
        }
        this.energia -= esforco;
        System.out.println(this.nome + " brincou bastante! energia caiu para: " + this.energia);
    }

    public void dormir() {
        // dormir recupera 10 pontos
        this.energia += 10.0;
        System.out.println(this.nome + " tirou uma soneca. recuperou energia! energia atual: " + this.energia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getEnergia() {
        return energia;
    }

}