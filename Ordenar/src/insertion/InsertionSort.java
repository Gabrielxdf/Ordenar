/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion;

import ordenar.MetodoOrdenacaoAbstrato;

/**
 *
 * @author Gabriel Henrique
 */
public class InsertionSort extends MetodoOrdenacaoAbstrato {

    public InsertionSort(int tamanho) {
        super(tamanho);
    }
    public InsertionSort(){
        super();
    }

    @Override
    public void ordenar(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int k = i - 1;
            while (k >= 0) {
                if (array[j] < array[k]) {
                    int aux = array[j];
                    array[j] = array[k];
                    array[k] = aux;
                } else {
                    break;
                }
                k--;
                j--;
            }
        }
    }

}
