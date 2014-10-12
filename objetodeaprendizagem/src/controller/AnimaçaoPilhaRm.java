package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Anima�aoPilhaRm extends Thread {
	private JButton btnAdicionar;
	private JButton btnRemover;
	private JLabel lbl_valor;
	
	public Anima�aoPilhaRm(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
	}
	
	public void run(){
		AnimarRm();
	}
	
	/**
	 * Metodo que inicia a anima�ao que remove elementos
	 */
	public void AnimarRm(){
		Rectangle posi�ao = lbl_valor.getBounds();
		
		for (int i = 0; i < 8; i++) {
			posi�ao.x += 10;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		while (posi�ao.y > 58){
			posi�ao.y -= 10;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(25);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (posi�ao.y == 54) {
			btnRemover.setEnabled(false);
		}else{
			btnRemover.setEnabled(true);
		}
		lbl_valor.setVisible(false);
		btnAdicionar.setEnabled(true);
		
	}

}
