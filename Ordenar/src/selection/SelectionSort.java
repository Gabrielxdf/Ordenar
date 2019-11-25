/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection;

import ordenar.MetodoOrdenacaoAbstrato;

/**
 *
 * @author estagiario
 */
public class SelectionSort extends MetodoOrdenacaoAbstrato {

    public SelectionSort() {
    }

    public SelectionSort(int tamanho) {
        super(tamanho);
    }
// 2,5,1,3,0,9
// 0 5 1 3 2 9
// 0 1 5 3 2 9
// 0 1 2 3 5 9

    @Override
    public void ordenar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int menor = Integer.MAX_VALUE;
            int menorIndice = i;
            boolean flag = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    if (array[j] < menor) {
                        menor = array[j];
                        menorIndice=j;
                        flag = true;
                    }
                }
            }
            if(flag)
            this.trocar(menorIndice, i);
        }
    }

}
