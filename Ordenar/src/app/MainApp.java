/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import bubble.BubbleSort;
import insertion.InsertionSort;
import intercalacao.Intercalacao;
import selection.SelectionSort;

/**
 *
 * @author Gabriel Henrique
 */
public class MainApp {

	public static void main(String[] args) {

		BubbleSort b = new BubbleSort(70000);
		b.carregar();
		// b.imprimir();
		System.out.println("BUBBLE SORT");
		System.out.println("-------------------");
		b.imprimeTempoOrdenacao(b.getVetor());
		System.out.println("-------------------");
		// b.imprimir();

		InsertionSort i = new InsertionSort(70000);
		i.carregar();
		// i.imprimir();
		System.out.println("INSERTION SORT");
		System.out.println("-------------------");
		i.imprimeTempoOrdenacao(i.getVetor());
		System.out.println("-------------------");
		// i.imprimir();

		SelectionSort s = new SelectionSort(70000);
		s.carregar();
		System.out.println("SELECTION SORT");
		System.out.println("-------------------");
		s.imprimeTempoOrdenacao(s.getVetor());
		System.out.println("-------------------");

		Intercalacao in = new Intercalacao();
		in.carregar(23, 17, 8, 15, 9, 12, 19, 7);
		in.intercalacao(0, 1, 2, in.getVetor());
		in.intercalacao(2, 3, 4, in.getVetor());
		in.intercalacao(4, 5, 6, in.getVetor());
		in.intercalacao(6, 7, 8, in.getVetor());
		in.intercalacao(0, 2, 4, in.getVetor());
		in.intercalacao(4, 6, 8, in.getVetor());
		in.intercalacao(0, 4, 8, in.getVetor());
		in.imprimir();
		
	}
}
