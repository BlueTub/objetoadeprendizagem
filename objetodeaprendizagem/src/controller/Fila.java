package controller;
/**
 * Classe para manipulacao das respostas respondidas do usuario atraves de uma Fila.
 * @author Pedro
 *
 */
public class Fila {
	
	private int dado[];
	private int tamanho;
	/**
	 * Construto da Classe.
	 */
	public Fila(){
		dado = new int[5];
		tamanho = 0;
	}
	/**
	 * Metodo para saber se a Fila esta vazia.
	 * @return true ou false para verificacao.
	 */
	public boolean vazia(){
		return tamanho == 0;
	}
	/**
	 * Metodo para verificar se a Fila esta cheia.
	 * @return true ou false para verificacao.
	 */
	public boolean cheia(){
		return tamanho == dado.length;
	}
	/**
	 * Metodo para adicionar um elemento a Fila
	 * @param e elemento que sera adicionado
	 */
	public void adiciona(int e){
		if(cheia()){
			System.out.println("cheia..");
		} else {
			dado[tamanho] = e;
			tamanho++;
		}
	}
	/**
	 * Metodo para retornar um elemento da Fila
	 * @return elemento removido
	 */
	public int remove(){
		int resp = 0;
		if(vazia()){
			System.out.println("fila vazia");
		} else {
			resp = dado[tamanho-1];
			tamanho--;
		}
		return resp;
	}
	/**
	 * Metodo para mostrar todos elementos da Fila
	 * @return elementos da Fila
	 */
	public String mostra(){
		String resp = "";
		if(vazia()){
			System.out.println("vazia no mostra..");
		} else {
			for (int i = 0; i < tamanho; i++) {
				resp = resp + "" + dado[i];
			}
		}
		return resp;
	}
	
    /**
     * método que remove o primeiro elemento de um fila
     * @return elemento removido
     */
    public int removeInicio(){
        int resp=0;
        if (vazia()){
            System.out.println("ERRO! Lista Vazia");
        } else {
            resp = dado[0];
            for (int i=1;i<=tamanho-1;i++){
                dado[i-1]=dado[i];
            }
            tamanho--;
        }
    return resp;
    }
	
}
