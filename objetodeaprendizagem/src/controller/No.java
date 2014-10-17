/**
 * 
 */
package controller;

import Entity.Perguntas;

/**
 * Classe que controla o no de elementos
 * @author joão
 *
 */
public class No {
	public Perguntas dados;
	public No prox;
	
	/**
	 * Construtor da classe No
	 * @param é elemento do no
	 */
	public No(Perguntas e){
		dados=e;
		prox=null;
	}
}
