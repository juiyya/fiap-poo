package br.com.fiapdelivery.model;
public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void realizarEntrega() {
        System.out.println("Levando pacote " + pacote.getCodigo()
                + " no veiculo " + veiculo.getPlaca());
    }
}
