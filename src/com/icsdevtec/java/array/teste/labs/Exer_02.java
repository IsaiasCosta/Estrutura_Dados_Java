package com.icsdevtec.java.array.teste.labs;

import java.util.ArrayList;

import com.icsdevtec.java.Lista;

public class Exer_02 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("1");
		arrayList.add("3");
		arrayList.add("7");
		arrayList.add("k");

		System.out.println(arrayList);
		System.out.println(arrayList.indexOf("g"));

		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("3");
		lista.adiciona("C");
		lista.adiciona("3");

		System.out.println(lista.ultimaPosicao("3"));
	}

}
