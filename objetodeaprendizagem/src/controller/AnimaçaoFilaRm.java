package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
/**
 * @author Zuzi
 */
public class AnimaçaoFilaRm extends Thread {
	
	private JLabel lbl_valor;
	
	public AnimaçaoFilaRm(JLabel lbl_valor){
		this.lbl_valor = lbl_valor;
	}
	
	public void run (){
		animarRm();
	}
	
	public void animarRm(){
		Rectangle posiçao = lbl_valor.getBounds();
		
		for (int i = 0; i < 8; i++) {
			posiçao.y += 9;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(110);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			posiçao.x = 281;
			lbl_valor.setBounds(posiçao);
			lbl_valor.setVisible(false);
	}
}
