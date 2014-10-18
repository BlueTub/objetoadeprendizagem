package Entity;

import javax.swing.JLabel;
/**
 * 
 * @author Hury
 *
 */
public class Linguagem_e {

	private JLabel label;
	private int Linguagem;
	
	public Linguagem_e(JLabel label, int linguagem) {
		super();
		this.label = label;
		Linguagem = linguagem;
	}

	/**
	 * @return the label
	 */
	public JLabel getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(JLabel label) {
		this.label = label;
	}

	/**
	 * @return the linguagem
	 */
	public int getLinguagem() {
		return Linguagem;
	}

	/**
	 * @param linguagem the linguagem to set
	 */
	public void setLinguagem(int linguagem) {
		Linguagem = linguagem;
	}
	
	
	
}
