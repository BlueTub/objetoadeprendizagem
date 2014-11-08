package controller;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class AnimaLista extends Thread implements OperacaoAnimacao {

	private JLabel lbl_cubo1;
	private JLabel lbl_cubo2;
	private JLabel lbl_cubo3;
	private JLabel lbl_cubo4;
	private JLabel lbl_cubo5;
	private JLabel lbl_cubo6;

	private JLabel lbl_valor1;
	private JLabel lbl_valor2;
	private JLabel lbl_valor3;
	private JLabel lbl_valor4;
	private JLabel lbl_valor5;
	private JLabel lbl_valor6;

	private JTextField txt_num;

	private int Selecionado;
	private int Lista[];

	public AnimaLista(JLabel lbl_cubo1, JLabel lbl_cubo2, JLabel lbl_cubo3,
			JLabel lbl_cubo4, JLabel lbl_cubo5, JLabel lbl_cubo6,
			JLabel lbl_valor1, JLabel lbl_valor2, JLabel lbl_valor3,
			JLabel lbl_valor4, JLabel lbl_valor5, JLabel lbl_valor6,
			JTextField txt_num, int selecionado, int[] lista) {
		super();
		this.lbl_cubo1 = lbl_cubo1;
		this.lbl_cubo2 = lbl_cubo2;
		this.lbl_cubo3 = lbl_cubo3;
		this.lbl_cubo4 = lbl_cubo4;
		this.lbl_cubo5 = lbl_cubo5;
		this.lbl_cubo6 = lbl_cubo6;
		this.lbl_valor1 = lbl_valor1;
		this.lbl_valor2 = lbl_valor2;
		this.lbl_valor3 = lbl_valor3;
		this.lbl_valor4 = lbl_valor4;
		this.lbl_valor5 = lbl_valor5;
		this.lbl_valor6 = lbl_valor6;
		this.txt_num = txt_num;
		Selecionado = selecionado;
		Lista = lista;
	}

	/**
	 * Metodo de inicializada da thread
	 */
	public void run() {

		// TODO
	}

	/**
	 * Adiciona 1 elemento no espaço selecionado
	 */

	@Override
	public void addElemento() {
		// TODO Auto-generated method stub

	}

	/**
	 * Remove 1 elemento de um espaço selecionado.
	 */
	@Override
	public void removeElemento() {
		// TODO Auto-generated method stub

	}

	/**
	 * Adiciona no inicio da lista
	 */
	public void addInicio() {

	}

	/**
	 * Adiciona no Final da lista
	 */
	public void addFinal() {

	}

	/**
	 * Remove o primeiro elemento da fila
	 */
	public void removeInicio() {

	}

	/**
	 * Remove o ultimo elemento da fila
	 */

	public void removeFinal() {

	}

	/**
	 * Verifica se a lista está cheia.
	 * 
	 * @return
	 */

	public boolean cheia() {
		for (int i = 0; i < Lista.length; i++) {
			
		}
		return false;
	}
	
	/**
	 * Verifica se o número em questão está em duplicidade com o conteúdo da
	 * arvore
	 * 
	 * @param rand
	 * @return
	 */
	
	public boolean verificadupli(int rand) {
		boolean result = false;
		for (int i = 0; i < Lista.length; i++) {
			if (Lista[i] == rand) {
				result = true;
			} else {

			}
		}
		return result;
	}

}
