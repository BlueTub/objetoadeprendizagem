/**
 * 
 */
package Entity;


/**
 * Tipo Abstrato de dados
 * @author joão
 * @version 04/10
 */
public class Perguntas {

	private String respostas[];
	
	/**
	 * Construtor 
	 * @param enunciado enunciado das perguntas
	 * @param respotas vetor com as respostas
	 */
	public Perguntas(String[] perguntas) {
		this.respostas = perguntas;
	}

	/** 
	 * Método de acesso ao enunciado e respotas
	 * @return respostas das perguntas
	 */
	public String[] getRespostas() {
		return respostas;
	}

	/**
	 * Método modificador para o atributo respotas
	 * @param respostas respostas da perguntas
	 */
	public void setRespostas(String[] respostas) {
		this.respostas = respostas;
	}

	
}