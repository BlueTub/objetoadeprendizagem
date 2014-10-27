package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MexerFila extends Thread{
	private JLabel lbl_valor;
	private JButton btnAdicionar;
	private JButton btnRemover;
	
	public MexerFila(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover) {
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
	}
	
	public void run(){
		fila();
	}
	
	public void fila(){
		btnAdicionar.setEnabled(false);
		btnRemover.setEnabled(false);
		Rectangle posiçao = lbl_valor.getBounds();
		
		for (int i = 0; i < 5; i++) {
			posiçao.x -= 9;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		btnAdicionar.setEnabled(true);
		btnRemover.setEnabled(true);
	}
}
