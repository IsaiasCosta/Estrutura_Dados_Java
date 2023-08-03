package com.icsdevtec.java.array.teste.labs;

import com.icsdevtec.java.Lista;

public class Exer_4 {

	public static void main(String[] args) {
		//  


		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");
		

		System.out.println(lista.obtem(0));
		System.out.println(lista.obtem(2));
		System.out.println(lista.obtem(4));
		System.out.println(lista);

	}

}
