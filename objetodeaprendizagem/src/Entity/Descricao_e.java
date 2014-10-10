package Entity;

public class Descricao_e {
	/**
	 * @author Hury
	 */
	public String descricao_res;
	public String descricao_int;
	public String caract;
	public String uso;
	public String dificuldade;
	

	public Descricao_e() {
		this("", "", "", "","");
	}

	Descricao_e(String descres, String descint, String cara, String us,String dific) {
		descricao_res = descres;
		descricao_int = descint;
		caract = cara;
		uso = us;
		dificuldade = dific;
		
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	public String getUso() {
		return uso;
	}
	public void setDescricao_res(String descricao_res) {
		this.descricao_res = descricao_res;
	}
	public String getDescricao_res() {
		return descricao_res;
	}
	public void setDescricao_int(String descricao_int) {
		this.descricao_int = descricao_int;
	}
	public String getDescricao_int() {
		return descricao_int;
	}
	public void setCaract(String caract) {
		this.caract = caract;
	}
	public String getCaract() {
		return caract;
	}
	public void setDificult(String dificult) {
		this.dificuldade = dificult;
	}
	public String getDificult() {
		return dificuldade;
	}
	
//TODO Utiliza gettes e settes, tornar classe totalmente encapsulada.
	
}
