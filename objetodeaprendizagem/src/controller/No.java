/**
 * 
 */
package controller;

import Entity.Perguntas;

/**
 * Classe que controla o no de elementos
 * @author jo�o
 *
 */
public class No {
	public Perguntas dados;
	public No prox;
	
	/**
	 * Construtor da classe No
	 * @param � elemento do no
	 */
	public No(Perguntas e){
		dados=e;
		prox=null;
	}
}
