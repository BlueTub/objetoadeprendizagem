/**
 * 
 */
package controller;

/**
 * @author joão
 *
 */
public class ListaLigada {
	private No inicio;
	/**
	*Construtor
	*/
	public ListaLigada(){
		inicio = null;
	}
	/**
	*Metodo que verifica se a lista esta vazia
	*@return se lista esta vazia retorna true
	*        caso contrario false 
	*/
	public boolean vazia(){
	   return inicio==null;
	}
	
	/**
	Metodo que adiciona um no com o novo elemento
	no inicio da lista
	@param valor e o novo elemento
	*/
	public void adicionaInicio(Perguntas valor){
	    No novo = new No(valor);
		 novo.prox = inicio;
		 inicio = novo;
	}
	
	 public String mostra(){
	     if(vazia())
	         return "Não há elementos na lista";
	          String resp="";
	     No aux=inicio;
	     while (aux != null){
	         resp= resp+(" "+aux.dados);
	         aux=aux.prox;
	     }
	     return resp;
	 }
	 
}
