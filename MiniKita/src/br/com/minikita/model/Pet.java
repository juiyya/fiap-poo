package br.com.minikita.model;

public class Pet {
    private String nome;
    private String especie;
    private double energia;

    public Pet(String nome, String especie) {
        this.setNome(nome);
        this.setEspecie(especie);
        this.setEnergia(10.0); 
    }

    private void setEnergia(double valor) {
        if (valor > 100.0) {
            this.energia = 100.0;
            System.out.println("Max level! A energia de " + this.nome + " está no máximo (100.0).");
        } else if (valor < 0.0) {
            this.energia = 0.0;
        } else {
            this.energia = valor;
        }
    }

    public double getEnergia() {
        return this.energia;
    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return this.especie;
    }

    private void setEspecie(String especie) {
        this.especie = especie;
    }

    public void alimentar(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade de comida deve ser maior que 0.");
            return; 
        }
        this.setEnergia(this.energia + quantidade);
        System.out.println(this.nome + " comeu. Energia subiu para: " + this.energia);
    }

    public void brincar(double esforco) {
        if (esforco <= 0) {
            System.out.println("Erro: Esforço para brincar é inválido.");
            return;
        }
        if (this.energia < esforco) {
            System.out.println("Erro: Energia insuficiente. " + this.nome + " está muito cansado para brincar.");
            return;
        }
        this.setEnergia(this.energia - esforco);
        System.out.println(this.nome + " brincou bastante! Energia caiu para: " + this.energia);
    }

    public void dormir() {
        this.setEnergia(this.energia + 30.0);
        System.out.println(this.nome + " tirou uma soneca e recuperou energia! Energia atual: " + this.energia);
    }
}