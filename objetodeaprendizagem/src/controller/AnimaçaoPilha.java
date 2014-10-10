package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;

public class AnimaçaoPilha extends Thread{
	
	private JLabel lbl_valor;
	private static int y = 24;
	private int x = 8;
	private static int AddRm = 0;
	private JButton btnAcao;
	private JButton btnReiniciar;
	
	/**
	 * Construtor
	 * @param lbl_valor Thread generalizada
	 * @param btnAcao Botao açao
	 */
	public AnimaçaoPilha(JLabel lbl_valor,JButton btnAcao, JButton btnReiniciar){
		this.lbl_valor = lbl_valor;
		this.btnAcao=btnAcao;
		this.btnReiniciar = btnReiniciar;
		}
	/**
	 * Metodo que chama a animaçao
	 */
	public void run (){
		if (AddRm < 7) {
			AnimarAdd();
			AddRm++;
		}else if (AddRm < 14){
			AnimarRm();
			AddRm++;
		}else{
			setarVariaveis();
		}
		
		
	}
	private void setarVariaveis() {
		AddRm = 0;
		y = 24;
		btnAcao.setEnabled(true);
		
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
		btnAcao.setEnabled(true);
		if (y == -4) {
			btnAcao.setText("Remover");
		}
	}
	
	/**
	 * Metodo que inicia a animaçao que remove elementos
	 */
	public void AnimarRm(){
		Rectangle posiçao = lbl_valor.getBounds();
		
		for (int i = 0; i < x; i++) {
			posiçao.x += 10;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < y; i++) {
			posiçao.y -= 10;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		y += 4;
		lbl_valor.setVisible(false);
		btnAcao.setEnabled(true);
		if (y == 24) {
			btnAcao.setEnabled(false);
			btnReiniciar.setVisible(true);
		}
		
	}
}
