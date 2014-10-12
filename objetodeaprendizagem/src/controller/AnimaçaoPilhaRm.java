package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;

public class AnimaçaoPilhaRm extends Thread {
	private JButton btnAdicionar;
	private JButton btnRemover;
	private JLabel lbl_valor;
	
	public AnimaçaoPilhaRm(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
	}
	
	public void run(){
		AnimarRm();
	}
	
	/**
	 * Metodo que inicia a animaçao que remove elementos
	 */
	public void AnimarRm(){
		Rectangle posiçao = lbl_valor.getBounds();
		
		for (int i = 0; i < 8; i++) {
			posiçao.x += 10;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		while (posiçao.y > 58){
			posiçao.y -= 10;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(25);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (posiçao.y == 54) {
			btnRemover.setEnabled(false);
		}else{
			btnRemover.setEnabled(true);
		}
		lbl_valor.setVisible(false);
		btnAdicionar.setEnabled(true);
		
	}

}
