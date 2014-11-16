package Entity;

import javax.swing.JLabel;

/**
 * Classe entidade para linguagem
 * @author Hury
 * 
 */
public class Linguagem_e {

	private JLabel label;
	private int linguagem;
    private int formulario;
	/**
	 * Construtor
	 * 
	 * @param label
	 * @param linguagem
	 */
	public Linguagem_e(JLabel label, int linguagem, int formulario) {
		super();
		this.label = label;
		this.linguagem = linguagem;
		this.formulario = formulario;
	}

	/**
	 * @return the label
	 */
	public JLabel getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(JLabel label) {
		this.label = label;
	}

	/**
	 * @return the linguagem
	 */
	public int getLinguagem() {
		return linguagem;
	}

	/**
	 * @param linguagem
	 *            the linguagem to set
	 */
	public void setLinguagem(int linguagem) {
		this.linguagem = linguagem;
	}

	/**
	 * @return the formulario
	 */
	public int getFormulario() {
		return formulario;
	}

	/**
	 * @param formulario the formulario to set
	 */
	public void setFormulario(int formulario) {
		this.formulario = formulario;
	}
	

}
