package com.icsdevtec.java.array.teste;

import com.icsdevtec.java.Array;

public class Aula_06 {

	public static void main(String[] args) {

		Array array  = new Array(10);
		
		
		array.adiciona("elemento 01");
		array.adiciona("elemento 02");	
		array.adiciona("elemento 03");
		
		System.out.println(array.busca("Elemento 01"));

	}

}
