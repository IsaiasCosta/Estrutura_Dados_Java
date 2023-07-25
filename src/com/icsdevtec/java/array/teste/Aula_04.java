package com.icsdevtec.java.array.teste;

import com.icsdevtec.java.Array;

public class Aula_04 {

	public static void main(String[] args) {

		Array array = new Array(10); 

		array.adiciona("elemento_01");
		array.adiciona("elemento_02");
		array.adiciona("elemento_03");
		System.out.println(array.tamanho());
		
		System.out.println(array);
	}

}
