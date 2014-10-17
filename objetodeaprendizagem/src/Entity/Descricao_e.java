package Entity;

/**
 * Classe responsavel pelos modelos dos objetos de aprendizagem
 * @author Hury
 * 
 */
public class Descricao_e {

	private String descricao_res;
	private String descricao_int;
	private String caract;
	private String uso;
	private String dificuldade;
	private String Tipo;

	public Descricao_e() {
		this("", "", "", "", "");
	}

	Descricao_e(String descres, String descint, String cara, String us,
			String dific) {
		descricao_res = descres;
		descricao_int = descint;
		caract = cara;
		uso = us;
		dificuldade = dific;

	}

	/**
	 * metodo para passagem de parametro ao atribulto uso
	 * 
	 * @param uso
	 */
	public void setUso(String uso) {
		this.uso = uso;
	}

	/**
	 * Retorna o atribulto uso
	 * 
	 * @return
	 */
	public String getUso() {
		return uso;
	}

	/**
	 * metodo para passagem de parametro ao atribulto descricao resumida
	 * 
	 * @param descricao_res
	 */
	public void setDescricao_res(String descricao_res) {
		this.descricao_res = descricao_res;
	}

	/**
	 * Retorna o atribulto descrição resumida
	 * @return
	 */
	public String getDescricao_res() {
		return descricao_res;
	}

	/**
	 * metodo para passagem de parametro ao atribulto descrição inteira
	 * 
	 * @param descricao_int
	 */
	public void setDescricao_int(String descricao_int) {
		this.descricao_int = descricao_int;
	}

	/**
	 * Retorna o atribulto descrição inteira
	 * 
	 * @return
	 */

	public String getDescricao_int() {
		return descricao_int;
	}

	/**
	 * metodo para passage de parametro ao atribulto caracteristica
	 * 
	 * @param caract
	 */
	public void setCaract(String caract) {
		this.caract = caract;
	}

	/**
	 * Retorna o atribulto caracteristica
	 * 
	 * @return
	 */
	public String getCaract() {
		return caract;
	}

	/**
	 * metodo para passage de parametro ao atribulto dificuldade
	 * 
	 * @param dificult
	 */

	public void setDificult(String dificult) {
		this.dificuldade = dificult;
	}

	/**
	 * Retorna o atribulto dificuldade
	 * 
	 * @return
	 */
	public String getDificult() {
		return dificuldade;
	}

	/**
	 * Retorna o atribulto tipo
	 * @return the tipo
	 */
	public String getTipo() {
		return Tipo;
	}

	/**
	 * metodo para passage de parametro ao atribulto tipo
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		Tipo = tipo;
	}

}
