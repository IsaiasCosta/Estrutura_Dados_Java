package com.icsdevtec.java.array.teste.labs;

import com.icsdevtec.java.*;
public class Exer_01 {

	public static void main(String[] args) {

		
		 //Verificando se contem o item na lista
		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		
		System.out.println(lista.contem("F"));
		
		
	}

}
