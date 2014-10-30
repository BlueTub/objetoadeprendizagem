package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
/**
 * 
 * @author Zuzi
 *
 */
public class AnimacaoPilha extends Thread implements OperacaoAnimacao{
	
	private JLabel lbl_valor;
	private static int y;
	private JButton btnAdicionar;
	private JButton btnRemover;
	private JLabel lblTopo;
	private int cont;
	private JLabel lblPilhaCheia;
	private boolean condi�ao;

	@SuppressWarnings("static-access")
	public AnimacaoPilha(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover, int y,JLabel lblTopo, int cont, JLabel lblPilhaCheia, boolean condi�ao){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
		this.y = y;
		this.lblTopo = lblTopo;
		this.cont = cont;
		this.lblPilhaCheia = lblPilhaCheia;
		this.condi�ao = condi�ao;
		}
	
	/**
	 * Metodo que chama a anima�ao
	 */
	public void run (){
		if (condi�ao == true) {
			addElemento();
		}else{
			removeElemento();
		}
	}
	/**
	 * metodo que inicia a anima�ao que adiciona elementos
	 */
	@Override
	public void addElemento() {
		lbl_valor.setVisible(true);
		Rectangle posi�ao = lbl_valor.getBounds();
		
		for (int i = 0; i < y; i++) {
			posi�ao.y += 10;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 7; i++) {
			posi�ao.x -= 10.5;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		posi�ao = lblTopo.getBounds();
		for (int i = 0; i < 6; i++) {
			posi�ao.y -=8;
			lblTopo.setBounds(posi�ao);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		btnAdicionar.setEnabled(true);
		btnRemover.setEnabled(true);
		if (cont == 6) {
			btnAdicionar.setEnabled(false);
			lblPilhaCheia.setVisible(true);
		}
	}

	@Override
	public void removeElemento() {
Rectangle posi�ao = lbl_valor.getBounds();
		
		for (int i = 0; i < 7; i++) {
			posi�ao.x += 11;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		while (posi�ao.y > 58){
			posi�ao.y -= 10;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(35);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (posi�ao.y == 54) {
			btnRemover.setEnabled(false);
		}else{
			btnRemover.setEnabled(true);
		}
		posi�ao = lblTopo.getBounds();
		for (int i = 0; i < 6; i++) {
			posi�ao.y +=8;
			lblTopo.setBounds(posi�ao);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		lbl_valor.setVisible(false);
		btnAdicionar.setEnabled(true);
	}	
}
