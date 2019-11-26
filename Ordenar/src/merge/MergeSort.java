package merge;

import intercalacao.Intercalacao;
import ordenar.MetodoOrdenacaoAbstrato;

public class MergeSort extends MetodoOrdenacaoAbstrato {

	public MergeSort() {
		super();

	}

	public MergeSort(int tamanho) {
		super(tamanho);

	}

	@Override
	public void ordenar(int[] array) {
		/*
		if (array.length > 2) {
			int p = 0;
			int r = array.length;
			int q = (p + r) / 2;
			int[] aux = new int[r - q];
		}
		*/
		merge(0, array.length, array);
	}
	public void merge (int inicio, int tamanho, int[] vetor) {
		if(inicio < tamanho-1) {
			int divisao = (inicio+tamanho)/2;
			merge(inicio, divisao, vetor);
			merge(divisao,tamanho, vetor);
			Intercalacao.intercalacao(inicio, divisao, tamanho, vetor);
		}
	}

}
