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
	         resp= resp+" "+aux.dados;
	         aux=aux.prox;
	     }
	     return resp;
	 }
	 
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
