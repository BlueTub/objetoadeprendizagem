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
	private boolean condiçao;

	@SuppressWarnings("static-access")
	public AnimacaoPilha(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover, int y,JLabel lblTopo, int cont, JLabel lblPilhaCheia, boolean condiçao){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
		this.y = y;
		this.lblTopo = lblTopo;
		this.cont = cont;
		this.lblPilhaCheia = lblPilhaCheia;
		this.condiçao = condiçao;
		}
	
	/**
	 * Metodo que chama a animaçao
	 */
	public void run (){
		if (condiçao == true) {
			addElemento();
		}else{
			removeElemento();
		}
	}
	/**
	 * metodo que inicia a animaçao que adiciona elementos
	 */
	@Override
	public void addElemento() {
		lbl_valor.setVisible(true);
		Rectangle posiçao = lbl_valor.getBounds();
		
		for (int i = 0; i < y; i++) {
			posiçao.y += 10;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 7; i++) {
			posiçao.x -= 10.5;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		posiçao = lblTopo.getBounds();
		for (int i = 0; i < 6; i++) {
			posiçao.y -=8;
			lblTopo.setBounds(posiçao);
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
Rectangle posiçao = lbl_valor.getBounds();
		
		for (int i = 0; i < 7; i++) {
			posiçao.x += 11;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		while (posiçao.y > 58){
			posiçao.y -= 10;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(35);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (posiçao.y == 54) {
			btnRemover.setEnabled(false);
		}else{
			btnRemover.setEnabled(true);
		}
		posiçao = lblTopo.getBounds();
		for (int i = 0; i < 6; i++) {
			posiçao.y +=8;
			lblTopo.setBounds(posiçao);
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
