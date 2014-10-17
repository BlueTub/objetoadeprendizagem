/**
 * 
 */
package controller;

import Entity.Perguntas;

/**
 * Classe que armazena as perguntas em uma lista ligada
 * @author joão
 *
 */
public class ListaLigada {
	private No inicio;
	/**
	* Construtor da lista ligada
	*/
	public ListaLigada(){
		inicio = null;
	}
	/**
	* Metodo que verifica se a lista esta vazia
	* @return se lista esta vazia retorna true
	*        caso contrario false 
	*/
	public boolean vazia(){
	   return inicio==null;
	}
	
	/**
	* Método que adiciona um no com o novo elemento
	* no inicio da lista
	* @param valor e o novo elemento
	*/
	public void adicionaInicio(Perguntas valor){
	    No novo = new No(valor);
		 novo.prox = inicio;
		 inicio = novo;
	}
	 
	 /**
	 * Método que remove um elemento do final da lista
	 * @return elemento removido
	 */
	 public Perguntas removeFinal(){
		    Perguntas r=null;
			 if (vazia())
			    System.out.println("ERRO!Lista Vazia!");
		    else 
			   if (inicio.prox==null)
				{
				   r=inicio.dados;
					inicio=null;
				} else
				  {
			         No aux1=inicio;
						No aux2=null;
						while (aux1.prox != null){
						    aux2=aux1;
							 aux1=aux1.prox;
						}
						r=aux1.dados;
						aux2.prox=null;
					}
		    return r;
		 }
	 
}
