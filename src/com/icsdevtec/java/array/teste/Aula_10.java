package com.icsdevtec.java.array.teste;

import com.icsdevtec.java.ArrayObjetos;

public class Aula_10 {

	public static void main(String[] args) {
		ArrayObjetos array = new ArrayObjetos(3);

		Contato contato1 = new Contato("Contato1","(31)3368-5989", "contato1@yahoo.com");
		Contato contato2 = new Contato("Contato2","(27)3764-5281", "contato2@yahoo.com");
		Contato contato3 = new Contato("Contato3","(32)3488-4889", "contato3@yahoo.com");
		Contato contato4 = new Contato("Contato4","(28)3268-5489", "contato4@yahoo.com");
		array.adiciona(contato1);
		array.adiciona(contato2);
		array.adiciona(contato3);
		System.out.println(" Tamanho = " + array.tamanho());

		System.out.println(array);
		int pos = array.busca(contato2);
		if(pos > -1) {
			System.out.println("Elemento  existe no array ");
		}else {
			System.out.println("Elemento não existe no array ");
		}
		array.adiciona(contato4);
		System.out.println(array);
	}

}
