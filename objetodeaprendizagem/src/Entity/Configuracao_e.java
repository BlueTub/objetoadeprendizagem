/**
 * 
 */
package Entity;

/**
 * Classe que tratara os atributos da configura��o
 * @author jo�o
 *@version 17/10
 */
public class Configuracao_e {
	private int Fonte;
	private String look;
	private String Linguagem;
	private boolean Dautonismo;
	
	/**
	 * M�todo para pegar a fonte
	 * @return the fonte
	 */
	public int getFonte() {
		return Fonte;
	}
	/**
	 * M�todo para alterar a fonte
	 * @param fonte seta a fonte
	 */
	public void setFonte(int fonte) {
		Fonte = fonte;
	}
	/**
	 * M�todo para pegar o look and feel
	 * @return the look 
	 */
	public String getLook() {
		return look;
	}
	/**
	 * M�todo para alterar o estilo
	 * @param look the look to set
	 */
	public void setLook(String look) {
		this.look = look;
	}
	/**
	 * @return the linguagem
	 */
	public String getLinguagem() {
		return Linguagem;
	}
	/**
	 * @param linguagem the linguagem to set
	 */
	public void setLinguagem(String linguagem) {
		Linguagem = linguagem;
	}
	/**
	 * @return the dautonismo
	 */
	public boolean isDautonismo() {
		return Dautonismo;
	}
	/**
	 * @param dautonismo the dautonismo to set
	 */
	public void setDautonismo(boolean dautonismo) {
		Dautonismo = dautonismo;
	}
	
	
}
