package Entity;

public class Descricao_e {
	/**
	 * @author Hury
	 */
	public String descricao_res;
	public String descricao_int;
	public String caract;
	public String uso;

	public Descricao_e() {
		this("", "", "", "");
	}

	Descricao_e(String descres, String descint, String cara, String us) {
		descricao_res = descres;
		descricao_int = descint;
		caract = cara;
		uso = us;
	}

}
