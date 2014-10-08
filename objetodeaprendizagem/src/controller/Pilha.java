package controller;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * Classe para manipulcao das respostas atraves de uma Pilha.
 * @author Pedro
 *
 */
public class Pilha {

	private RespostasPilha dados[];
	private int topo;
	/**
	 * Construtor para classe.
	 */
	public Pilha(){
		dados = new RespostasPilha[5];
		topo = -1;
	}
	/**
	 * Metodo para verificar se a Pilha esta vazia.
	 * @return true ou false para saber se a Pilha esta vazia.
	 */
	public boolean vazia(){
		return topo == -1;
	}
	/**
	 * Metodo para verificar se a Pilha esta cheia.
	 * @return true ou false para saber se a Pilha esta cheia.
	 */
	public boolean cheia(){
		return topo==dados.length-1;
	}
	/**
	 * Metodo para colocar um elemento no topo da Pilha.
	 * @param e recebe o valor a ser empilhado.
	 */
	public void empilha(RespostasPilha e){
		if(cheia()){
			System.out.println("Pilha cheia");
		}else{
			topo++;
			dados[topo] = e;
		}
	}
	/**
	 * Metodo para tirar um elemento do topo da Pilha.
	 * @return o elemento removido do topo.
	 */
	public RespostasPilha desempilha(){
		RespostasPilha resp = null;
		if(vazia()){
			System.out.println("Pilha vazia");
		}else{			
			resp = dados[topo];
			topo--;
		}
		return resp;
	}
	/**
	 * Metodo para mostrar os elementos dentro da Pilha.
	 * @return elementos da Pilha.
	 */
	public String mostra(){
		String resp = "";
		
		for (int i = 0; i <= topo; i++) {
			resp = resp + "" + dados[i];
		}
		
		return resp;
	}
	
	
}
