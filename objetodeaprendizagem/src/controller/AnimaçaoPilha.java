package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;

public class AnimaçaoPilha extends Thread{
	
	private JLabel lbl_valor;
	private static int y = 24;
	private int x = 8;
	private static boolean AddRm;
	private JButton btnAcao;
	
	public AnimaçaoPilha(JLabel lbl_valor,JButton btnAcao){
		this.lbl_valor = lbl_valor;
		this.btnAcao=btnAcao;
		}
	/**
	 * Metodo que chama a animaçao
	 */
	public void run (){
		if (AddRm == false) {
			AnimarAdd();
			System.out.println(AddRm);
		}else{
			
			//TODO
		}
		
		
	}
	/**
	 * metodo que inicia a animaçao
	 */
	public void AnimarAdd(){
		lbl_valor.setVisible(true);
		Rectangle valor10 = lbl_valor.getBounds();
		
		for (int i = 0; i < y; i++) {
			valor10.y += 10;
			lbl_valor.setBounds(valor10);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < x; i++) {
			valor10.x -= 10;
			lbl_valor.setBounds(valor10);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		y -= 4;
		btnAcao.setEnabled(true);
	}
}
