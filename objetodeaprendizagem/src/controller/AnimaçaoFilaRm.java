package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
/**
 * 
 * @author Zuzi
 *
 */
public class Anima�aoFilaRm extends Thread {
	
	private JLabel lbl_valor;
	private JButton btnAdicionar;
	private JButton btnRemover;
	
	public Anima�aoFilaRm(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
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
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		lbl_valor.setVisible(false);
		while (posi�ao.x < 265){
			posi�ao.x += 10;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(35);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
