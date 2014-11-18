package controller;

import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 * Classe com os metodos de animação da Fila
 * @author Zuzi
 *
 */
public class AnimacaoFila extends Thread implements OperacaoAnimacao {
	
	private JLabel lbl_valor;
	private JButton btnAdicionar;
	private JButton btnRemover;
	private float x;
	private int cont;
	private JLabel lblFilaCheia;
	private boolean condiçao;
	
	public AnimacaoFila(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover, float x, int cont, JLabel lblFilaCheia, boolean condiçao){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
		this.x = x;
		this.cont = cont;
		this.lblFilaCheia = lblFilaCheia;
		this.condiçao = condiçao;
	}
/**
 * metodo run da thread
 */
	
	public void run(){
		if (condiçao == true) {
			addElemento();
		}else{
			removeElemento();
		}
	}

	@Override
	public void addElemento() {
		lbl_valor.setVisible(true);
		Rectangle posiçao = lbl_valor.getBounds();
		
		if (Integer.parseInt(lbl_valor.getText()) < 10) {
			posiçao.x += 5;
		}
		
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


	@Override
	public void removeElemento() {
		btnAdicionar.setEnabled(false);
		btnRemover.setEnabled(false);
		Rectangle posiçao = lbl_valor.getBounds();
		
		if (Integer.parseInt(lbl_valor.getText()) < 10) {
			posiçao.x -= 5;
		}
		
		for (int i = 0; i < 8; i++) {
			posiçao.y += 9;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			posiçao.x = 281;
			lbl_valor.setBounds(posiçao);
			lbl_valor.setVisible(false);
		
	}
}
