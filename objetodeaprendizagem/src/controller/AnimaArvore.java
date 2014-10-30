package controller;

import java.awt.Rectangle;

import javax.swing.JLabel;

public class AnimaArvore extends Thread implements OperacaoAnimacao {
	private int operacao;

	private JLabel lbl_cubo1;
	private JLabel lbl_cubo2;
	private JLabel lbl_cubo3;
	private JLabel lbl_cubo4;
	private JLabel lbl_cubo5;
	private JLabel lbl_cubo6;
	private JLabel lbl_cubo7;

	private JLabel lbl_valor1;
	private JLabel lbl_valor2;
	private JLabel lbl_valor3;
	private JLabel lbl_valor4;
	private JLabel lbl_valor5;
	private JLabel lbl_valor6;
	private JLabel lbl_valor7;

	private JLabel lbl_rand;

	public AnimaArvore(int operacao, JLabel lbl_cubo1, JLabel lbl_cubo2,
			JLabel lbl_cubo3, JLabel lbl_cubo4, JLabel lbl_cubo5,
			JLabel lbl_cubo6, JLabel lbl_cubo7, JLabel lbl_valor1,
			JLabel lbl_valor2, JLabel lbl_valor3, JLabel lbl_valor4,
			JLabel lbl_valor5, JLabel lbl_valor6, JLabel lbl_valor7,
			JLabel lbl_rand) {
		super();
		this.operacao = operacao;
		this.lbl_cubo1 = lbl_cubo1;
		this.lbl_cubo2 = lbl_cubo2;
		this.lbl_cubo3 = lbl_cubo3;
		this.lbl_cubo4 = lbl_cubo4;
		this.lbl_cubo5 = lbl_cubo5;
		this.lbl_cubo6 = lbl_cubo6;
		this.lbl_cubo7 = lbl_cubo7;
		this.lbl_valor1 = lbl_valor1;
		this.lbl_valor2 = lbl_valor2;
		this.lbl_valor3 = lbl_valor3;
		this.lbl_valor4 = lbl_valor4;
		this.lbl_valor5 = lbl_valor5;
		this.lbl_valor6 = lbl_valor6;
		this.lbl_valor7 = lbl_valor7;
		this.lbl_rand = lbl_rand;
	}

	public void run() {
		// Rectangle posicao = lblPonto.getBounds();
		if (operacao == 1) {
			addElemento();
		} else {
			removeElemento();
		}
	}

	@Override
	public void addElemento() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeElemento() {
		// TODO Auto-generated method stub

	}

}
