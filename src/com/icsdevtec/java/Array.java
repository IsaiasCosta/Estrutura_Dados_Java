package com.icsdevtec.java;

import java.security.PublicKey;

public class Array {

	private String[] elementos;
	private int tamanho;

	public Array(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/*
	 * public void adiciona(String elemento) { // verificando se a elemento null for
	 * (int i = 0; i < this.elementos.length; i++) { if(this.elementos[i]==null) {
	 * this.elementos[i]=elemento; break; } }
	 * 
	 * 
	 * }
	 */

	/*public void adiciona(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
		} else {
			throw new Exception("Array com a capacidade de elemento completa !!!");
		}
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
	}*/
	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
}
