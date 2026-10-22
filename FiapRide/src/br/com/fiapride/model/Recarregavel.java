package br.com.fiapride.model;

// 'interface' em vez de 'class'
// Todo método é PUBLICO e ABSTRATO por padrão (não precisa escrever)
public interface Recarregavel {

    // Método sem corpo (apenas assinatura)
    // Define QUEM implementa recarregar() DEVE ter este método
    void recarregar(int percentual);

    // Constantes são permitidas em interfaces
    int CARGA_MAXIMA = 100;
    int CARGA_MINIMA = 0;

    // Observação: Em interfaces Java:
    // - Métodos são public abstract por padrão
    // - Atributos são public static final por padrio (constantes)
}