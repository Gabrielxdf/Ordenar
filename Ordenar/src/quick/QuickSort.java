package quick;

import ordenar.MetodoOrdenacaoAbstrato;

public class QuickSort extends MetodoOrdenacaoAbstrato {
	public QuickSort() {
	}

	public QuickSort(int tamanho) {
		super(tamanho);
	}

	@Override
	public void ordenar(int[] array) {
		quick(array, 0, array.length -1);
	}

	public void quick(int[] vetor, int inicio, int fim) {
		int i = inicio;
		int j = fim;
		int pivo = vetor[(i + j) / 2];

		while (i <= j) {
			while (vetor[i] < pivo) {
				i++;
			}
			while (vetor[j] > pivo) {
				j--;
			}
			if (i <= j) {
				this.trocar(i, j);
				i++;
				j--;
			}
		}
		if (inicio < j) {
			quick(vetor, inicio, j);
		}
		if (i < fim) {
			quick(vetor, i, fim);
		}
	}
}
