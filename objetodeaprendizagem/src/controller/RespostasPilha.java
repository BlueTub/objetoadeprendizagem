package controller;
/**
 * Metodo para controle das respostas.
 * @author Pedro
 *
 */
public class RespostasPilha {

	private String[] resp;
	/**
	 * Construtor da classe.
	 */
	public RespostasPilha(String[] e) {
		this.resp = e;
	}
	/**
	 * Metodo para pegar um valor.
	 * @return valor da pergunta
	 */
	public String[] getResp() {
		return resp;
	}
	/**
	 * Metodo para colocar um valor.
	 * @param resp valor para colocar.
	 */
	public void setResp(String[] resp) {
		this.resp = resp;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
