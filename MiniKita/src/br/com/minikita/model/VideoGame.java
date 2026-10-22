package br.com.minikita.model;

public class VideoGame implements Brincavel {
    private String console;

    public VideoGame(String console) {
        this.console = console;
    }

    @Override
    public void iniciarBrincadeira() {
        System.out.println("Iniciando uma partida no " + this.console + "... (Gastando eletricidade)");
    }
}