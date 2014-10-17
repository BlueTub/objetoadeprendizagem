/**
 * 
 */
package Entity;

/**
 * Classe que tratara os atributos da configuração
 * @author joão
 *@version 17/10
 */
public class Configuracao_e {
	private int Fonte;
	private String look;
	
	/**
	 * Método para pegar a fonte
	 * @return the fonte
	 */
	public int getFonte() {
		return Fonte;
	}
	/**
	 * Método para alterar a fonte
	 * @param fonte seta a fonte
	 */
	public void setFonte(int fonte) {
		Fonte = fonte;
	}
	/**
	 * Método para pegar o look and feel
	 * @return the look 
	 */
	public String getLook() {
		return look;
	}
	/**
	 * Método para alterar o estilo
	 * @param look the look to set
	 */
	public void setLook(String look) {
		this.look = look;
	}
}
