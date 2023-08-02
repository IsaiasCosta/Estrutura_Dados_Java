package com.icsdevtec.java.array.teste;

import com.icsdevtec.java.ArrayObjetos;
import com.icsdevtec.java.Lista;

public class Aula_11 {

	public static void main(String[] args) {

		Lista<Contato> array = new Lista<Contato>(1);

		Contato contato1 = new Contato("Contato1","(31)3368-5989", "contato1@yahoo.com");

		array.adiciona(contato1);
		System.out.println(array);
	}

}
