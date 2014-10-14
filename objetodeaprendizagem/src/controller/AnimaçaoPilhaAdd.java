package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;

public class AnimaçaoPilhaAdd extends Thread{
	
	private JLabel lbl_valor;
	private static int y;
	private JButton btnAdicionar;
	private JButton btnRemover;
	private JLabel lblTopo;

	public AnimaçaoPilhaAdd(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover, int y,JLabel lblTopo){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
		this.y = y;
		this.lblTopo = lblTopo;
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
				Thread.sleep(45);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 7; i++) {
			posiçao.x -= 10.5;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		posiçao = lblTopo.getBounds();
		for (int i = 0; i < 6; i++) {
			posiçao.y -=8;
			lblTopo.setBounds(posiçao);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		btnAdicionar.setEnabled(true);
		btnRemover.setEnabled(true);
	}
}
