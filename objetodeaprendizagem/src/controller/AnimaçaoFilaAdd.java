package controller;

import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 * 
 * @author Zuzi
 *
 */
public class Anima�aoFilaAdd extends Thread {
	
	private JLabel lbl_valor;
	private JButton btnAdicionar;
	private JButton btnRemover;
	private float x;
	
	public Anima�aoFilaAdd(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover, float x){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
		this.x = x;
	}
	
	public void run(){
		AnimarAdd();
	}
	
	public void AnimarAdd(){
		lbl_valor.setVisible(true);
		Rectangle posi�ao = lbl_valor.getBounds();
		
		for (int i = 0; i < x; i++) {
			posi�ao.x -= 11;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < 7; i++) {
			posi�ao.y -= 10;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		btnAdicionar.setEnabled(true);
		btnRemover.setEnabled(true);
	}
}
