package com.icsdevtec.java.array.teste.labs;

import java.util.ArrayList;

import com.icsdevtec.java.Lista;

public class Exer_3 {

	public static void main(String[] args) {

		// busca e remove da lista .
		
		
		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");


		System.out.println(lista);
		lista.remove("A");
		System.out.println(lista);
		lista.remove("D");
		System.out.println(lista);
		lista.remove("F");
		System.out.println(lista);

	}

}
