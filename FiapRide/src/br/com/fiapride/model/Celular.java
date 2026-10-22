package br.com.fiapride.model;

// Celular NÃO herda de Veiculo, mas TAMBÉM é Recarregavel
public class Celular implements Recarregavel {

    private String marca;
    private int nivelBateria; // 0-100

    public Celular(String marca) {
        this.marca = marca;
        this.nivelBateria = 0;
    }

    @Override
    public void recarregar(int percentual) {
        if (percentual < Recarregavel.CARGA_MINIMA || percentual > Recarregavel.CARGA_MAXIMA) {
            System.out.println("Erro: Percentual inválido!");
            return;
        }

        this.nivelBateria = percentual;
        System.out.println("Celular " + this.marca + " carregado para " + percentual + "%");
    }

    public int getNivelBateria() {
        return this.nivelBateria;
    }
}