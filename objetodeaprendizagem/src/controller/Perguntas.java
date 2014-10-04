/**
 * 
 */
package controller;

/**
 * Tipo Abstrato de dados
 * @author jo�o
 * @version 04/10
 */
public class Perguntas {

	private String enunciado;
	private String respostas[];
	
	/**
	 * Construtor 
	 * @param enunciado enunciado das perguntas
	 * @param respotas vetor com as respostas
	 */
	public Perguntas(String enunciado, String[] perguntas) {
		this.enunciado = enunciado;
		this.respostas = perguntas;
	}

	/**
	 * M�todo de acesso ao enunciado
	 * @return enunciado das perguntas
	 */
	public String getEnunciado() {
		return enunciado;
	}

	/**
	 * M�todo modificador para o atributo enunciado
	 * @param enunciado enunciado das perguntas
	 */
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
	/**
	 * M�todo de acesso as respotas
	 * @return respostas das perguntas
	 */
	public String[] getRespostas() {
		return respostas;
	}

	/**
	 * M�todo modificador para o atributo respotas
	 * @param respostas respostas da perguntas
	 */
	public void setRespostas(String[] respostas) {
		this.respostas = respostas;
	}

	
}