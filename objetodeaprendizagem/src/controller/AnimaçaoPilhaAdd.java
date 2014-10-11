package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;

public class AnimaçaoPilhaAdd extends Thread{
	
	private JLabel lbl_valor;
	private static int y = 24;
	private int x = 8;
	private JButton btnAdicionar;
	private JButton btnRemover;
	/**
	 * Construtor
	 * @param lbl_valor Thread generalizada
	 * @param btnAcao Botao açao
	 */
	public AnimaçaoPilhaAdd(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
		}
	/**
	 * Metodo que chama a animaçao
	 */
	public void run (){
			AnimarAdd();
	}
	/**
	 * metodo que inicia a animaçao que adiciona elementos
	 */
	public void AnimarAdd(){
		lbl_valor.setVisible(true);
		Rectangle posiçao = lbl_valor.getBounds();
		
		for (int i = 0; i < y; i++) {
			posiçao.y += 10;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < x; i++) {
			posiçao.x -= 10;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		y -= 4;
		btnAdicionar.setEnabled(true);
		btnRemover.setEnabled(true);
	}
}
