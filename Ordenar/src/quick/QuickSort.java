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
		//tudo na esquerda tem que ser menor que o pivo
		//e tudo na direita tem que ser maior que o pivo
		while (i <= j) {
			//procura um maior que o pivo na esquerda
			while (vetor[i] < pivo) {
				i++;
			}
			//procura um menor que o pivo na direita
			while (vetor[j] > pivo) {
				j--;
			}
			//troca a esquerda com a direita
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
