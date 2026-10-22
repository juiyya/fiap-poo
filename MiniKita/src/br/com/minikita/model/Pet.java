package br.com.minikita.model;

public class Pet {
    private String nome;
    private String especie;
    private double energia;
    private Tutor dono; 

    public Pet(String nome, String especie, Tutor dono) {
        this.setNome(nome);
        this.setEspecie(especie);
        this.dono = dono;
        this.setEnergia(10.0);
    }

    public Tutor getDono() { return this.dono; }

    private void setEnergia(double valor) {
        if (valor > 100.0) {
            this.energia = 100.0;
        } else if (valor < 0.0) {
            this.energia = 0.0;
        } else {
            this.energia = valor;
        }
    }

    public double getEnergia() { return this.energia; }
    public String getNome() { return this.nome; }

    private void setNome(String nome) { this.nome = nome; }

    public String getEspecie() { return this.especie; }
    
    private void setEspecie(String especie) { this.especie = especie; }

    public String emitirSom() { return "O pet faz um barulho genérico."; }

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
            System.out.println("Erro: Energia insuficiente para brincar.");
            return;
        }
        this.setEnergia(this.energia - esforco);
        System.out.println(this.nome + " brincou bastante! Energia caiu para: " + this.energia);
    }

    public void dormir() {
        this.setEnergia(this.energia + 30.0);
        System.out.println(this.nome + " tirou uma soneca. Energia atual: " + this.energia);
    }
}