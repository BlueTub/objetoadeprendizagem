package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
/**
 * @author Zuzi
 */
public class Anima�aoFilaRm extends Thread {
	
	private JLabel lbl_valor;
	
	public Anima�aoFilaRm(JLabel lbl_valor){
		this.lbl_valor = lbl_valor;
	}
	
	public void run (){
		animarRm();
	}
	
	public void animarRm(){
		Rectangle posi�ao = lbl_valor.getBounds();
		
		for (int i = 0; i < 8; i++) {
			posi�ao.y += 9;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(110);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			posi�ao.x = 281;
			lbl_valor.setBounds(posi�ao);
			lbl_valor.setVisible(false);
	}
}
