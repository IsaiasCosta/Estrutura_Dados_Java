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
		this.aumentarCapacidade();
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
		this.aumentarCapacidade();
		//Mover todos os elementos
		for(int i = this.tamanho-1;i>=posicao;i--) {
			this.elementos[i+1]=this.elementos[i];
		}
		this.elementos[posicao]=elemento;
		this.tamanho++;
		return true;
	}
	//Adiconar Capacidade no Vetor

	private void aumentarCapacidade(){
		if(this.tamanho==this.elementos.length) {
			String[]elementosNovos = new String[this.elementos.length*2];
			for(int i=0;i<this.elementos.length;i++) {
				elementosNovos[i]=this.elementos[i];
			}
			this.elementos=elementosNovos;
		}
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
	//Remover elemento da posiçãodo Vetor

	public void remove(int posicao) {
		if(!(posicao>=0 && posicao< tamanho)) {
			throw new  IllegalArgumentException("Posição Inválida ");
		}
		for(int i =posicao; i<this.tamanho-1;i++) {
			this.elementos[i]=this.elementos[i+1];
		}
		this.tamanho --;
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
