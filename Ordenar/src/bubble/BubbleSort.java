/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble;

import ordenar.MetodoOrdenacaoAbstrato;

/**
 *
 * @author Gabriel Henrique
 */
public class BubbleSort extends MetodoOrdenacaoAbstrato {

    public BubbleSort(int tamanho) {
        super(tamanho);
    }
    public BubbleSort(){
        super();
    }

    @Override
    public void ordenar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }
}
