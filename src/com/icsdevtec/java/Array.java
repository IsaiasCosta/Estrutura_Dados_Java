package com.icsdevtec.java;

import java.security.PublicKey;
import java.util.Arrays;

public class Array {

	private String[] elementos;
	private int tamanho;
	private int posicao;
	private String elemento;

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

	//Adicionar
	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	//Add elementos em qualquer posição
	 public boolean adiciona(int posicao, String elemento) {
		 
		 if(!(posicao>=0 && posicao< tamanho)) {
				throw new  IllegalArgumentException("Posição Inválida ");
			}
		 //mover todos os elementos
		 for(int i = this.tamanho-1;i>=posicao;i--) {
			 this.elementos[i+1]=this.elementos[i];
		 }
		 this.elementos[posicao]=elemento;
		 this.tamanho++;
		 return true;
	 }
	// Busca
	public String busca(int posicao) {

		if(!(posicao>=0 && posicao< tamanho)) {
			throw new  IllegalArgumentException("Posição Inválida ");
		}
		return this.elementos[posicao];
	}
	
	//Verificar se o objeto existe no vetor
	public int busca(String elemento) {
		for(int i=0; i<this.tamanho;i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	
	

	//Tamanho
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuffer s = new StringBuffer();
		s.append("[");
		for(int  i = 0; i <this.tamanho-1;i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();
	}


}
