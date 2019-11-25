package intercalacao;

import ordenar.MetodoOrdenacaoAbstrato;

public class Intercalacao extends MetodoOrdenacaoAbstrato{
	
	public Intercalacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intercalacao(int tamanho) {
		super(tamanho);
		// TODO Auto-generated constructor stub
	}

	public void intercalacao(int p, int q, int r, int[] vetor){
		int aux[] = new int[r - p];
		int i = p;
		int j = q;
		int k = 0;
		while (i < q && j < r) {
			if (vetor[i] < vetor[j]) {
				aux[k] = vetor[i];
				i++;
			} else {
				aux[k] = vetor[j];
				j++;
			}
			k++;
		}
		while (i < q) {
			aux[k] = vetor[i];
			i++;
			k++;
		}
		while (j < r) {
			aux[k] = vetor[j];
			j++;
			k++;
		}
		for(i = p; i<r; i++) {
			vetor[i] = aux[i-p];
		}

	}

	@Override
	public void ordenar(int[] array) {
		// TODO Auto-generated method stub
		
	}
}
