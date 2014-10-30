package controller;

import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 * 
 * @author Zuzi
 *
 */
public class AnimaçaoFilaAdd extends Thread {
	
	private JLabel lbl_valor;
	private JButton btnAdicionar;
	private JButton btnRemover;
	private float x;
	private int cont;
	private JLabel lblFilaCheia;
	
	public AnimaçaoFilaAdd(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover, float x, int cont, JLabel lblFilaCheia){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
		this.x = x;
		this.cont = cont;
		this.lblFilaCheia = lblFilaCheia;
	}
	
	public void run(){
		AnimarAdd();
	}
	
	public void AnimarAdd(){
		lbl_valor.setVisible(true);
		Rectangle posiçao = lbl_valor.getBounds();
		
		for (int i = 0; i < x; i++) {
			posiçao.x -= 9;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < 8; i++) {
			posiçao.y -= 9;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		btnAdicionar.setEnabled(true);
		btnRemover.setEnabled(true);
		
		if (cont == 5) {
        	lblFilaCheia.setVisible(true);
			btnAdicionar.setEnabled(false);
		}
	}
}
