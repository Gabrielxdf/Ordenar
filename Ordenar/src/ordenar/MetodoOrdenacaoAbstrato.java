/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

/**
 *
 * @author luizloja
 */
public abstract class MetodoOrdenacaoAbstrato {

    private int vetor[];
    int quantidadedecomparacoes = 0;
    int quantidadedetrocas = 0;

    public MetodoOrdenacaoAbstrato() {

    }

    public MetodoOrdenacaoAbstrato(int tamanho) {
        vetor = new int[tamanho];
    }

    public void carregar() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ((int) (Math.random() * 100));
        }
    }

    public void carregar(int... valores) {
        vetor = new int[valores.length];
        int count = 0;
        for (int i : valores) {
            vetor[count++] = i;
        }
    }

    public void imprimeTempoOrdenacao(int[] array) {
        long tempoInicial = System.currentTimeMillis();
        ordenar(this.getVetor());
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo:" + (((double) (tempoFinal - tempoInicial)) / 1000) + " segundos ");
        System.out.println("Inicio: " + tempoInicial + " Fim: " + tempoFinal);
    }

    public int[] getVetor() {
        return vetor;
    }

    public void imprimir() {
        int count = 1;
        for (int i : vetor) {
            System.out.println("(" + (count++) + ")  " + i);
        }
    }

    public void imprimirString() {
        String elementos = "";
        for (int i : vetor) {
            elementos += "" + i + ", ";
        }
        System.out.println(elementos.replaceAll(", $", ""));
    }

    public boolean estaOrdenado() {
        int i = 1;
        do {
            if (vetor[i - 1] > vetor[i]) {
                return false;
            }
            i++;
        } while (i < vetor.length);

        return true;
    }

    public void trocar(int i, int j) {
        int aux = this.vetor[i];
        this.vetor[i] = this.vetor[j];
        vetor[j] = aux;
    }

    public abstract void ordenar(int[] array);

}
