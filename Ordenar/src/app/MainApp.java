
package app;

import bubble.BubbleSort;
import insertion.InsertionSort;
import merge.MergeSort;
import quick.QuickSort;
import selection.SelectionSort;

/**
 *
 * @author Gabriel Henrique
 */
public class MainApp {

	public static void main(String[] args) {
/*
		BubbleSort b = new BubbleSort(20000);
		b.carregar();
		System.out.println("BUBBLE SORT");
		System.out.println("-------------------");
		b.imprimeTempoOrdenacao(b.getVetor());
		System.out.println("-------------------");

		InsertionSort i = new InsertionSort(20000);
		i.carregar();
		System.out.println("INSERTION SORT");
		System.out.println("-------------------");
		i.imprimeTempoOrdenacao(i.getVetor());
		System.out.println("-------------------");

		SelectionSort s = new SelectionSort(20000);
		s.carregar();
		System.out.println("SELECTION SORT");
		System.out.println("-------------------");
		s.imprimeTempoOrdenacao(s.getVetor());
		System.out.println("-------------------");

		MergeSort m = new MergeSort(20000);
		m.carregar();
		System.out.println("MERGE SORT");
		System.out.println("-------------------");
		m.imprimeTempoOrdenacao(m.getVetor());
		System.out.println("-------------------");
		*/
		QuickSort q = new QuickSort();
		q.carregar(2,1,8,-2,0,3);
		q.ordenar(q.getVetor());
		q.imprimir();
		/*System.out.println("QUICK SORT");
		System.out.println("-------------------");
		m.imprimeTempoOrdenacao(m.getVetor());
		System.out.println("-------------------");*/

	}
}
