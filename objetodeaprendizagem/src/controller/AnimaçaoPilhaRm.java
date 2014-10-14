package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;

public class AnimaçaoPilhaRm extends Thread {
	private JButton btnAdicionar;
	private JButton btnRemover;
	private JLabel lbl_valor;
	private JLabel lblTopo;
	
	public AnimaçaoPilhaRm(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover, JLabel lblTopo){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
		this.lblTopo = lblTopo;
	}
	
	public void run(){
		AnimarRm();
	}
	
	/**
	 * Metodo que inicia a animaçao que remove elementos
	 */
	public void AnimarRm(){
		Rectangle posiçao = lbl_valor.getBounds();
		
		for (int i = 0; i < 7; i++) {
			posiçao.x += 11;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		while (posiçao.y > 58){
			posiçao.y -= 10;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(45);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (posiçao.y == 54) {
			btnRemover.setEnabled(false);
		}else{
			btnRemover.setEnabled(true);
		}
		posiçao = lblTopo.getBounds();
		for (int i = 0; i < 6; i++) {
			posiçao.y +=8;
			lblTopo.setBounds(posiçao);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		lbl_valor.setVisible(false);
		btnAdicionar.setEnabled(true);
		
	}

}
