package entity;

/**
 * Tipo abstrato para o questionario 
 * @author João
 * 
 */
public class Questionario_e {

	private String enunciado;
	private String[] perguntas;
	private String[] respostas;

	/**
	 * construtor
	 * 
	 * @param enunciado
	 * @param perguntas
	 * @param respostas
	 */

	public Questionario_e(String enunciado, String[] perguntas,
			String[] respostas) {
		super();
		this.enunciado = enunciado;
		this.perguntas = perguntas;
		this.respostas = respostas;

	}

	/**
	 * @return the enunciado
	 */
	public String getEnunciado() {
		return enunciado;
	}

	/**
	 * @param enunciado
	 *            the enunciado to set
	 */
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	/**
	 * @return the perguntas
	 */
	public String[] getPerguntas() {
		return perguntas;
	}

	/**
	 * @param perguntas
	 *            the perguntas to set
	 */
	public void setPerguntas(String[] perguntas) {
		this.perguntas = perguntas;
	}

	/**
	 * @return the respostas
	 */
	public String[] getRespostas() {
		return respostas;
	}

	/**
	 * @param respostas
	 *            the respostas to set
	 */
	public void setRespostas(String[] respostas) {
		this.respostas = respostas;
	}

}
