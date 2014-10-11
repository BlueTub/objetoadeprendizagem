package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;

public class AnimaçaoPilha extends Thread{
	
	private JLabel lbl_valor;
	private static int y = 24;
	private int x = 8;
	private JButton btnAdicionar;
	private JButton btnRemover;
	private boolean addRm;
	/**
	 * Construtor
	 * @param lbl_valor Thread generalizada
	 * @param btnAcao Botao açao
	 */
	public AnimaçaoPilha(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover, boolean addRm){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
		this.addRm = addRm;
		}
	/**
	 * Metodo que chama a animaçao
	 */
	public void run (){
			//TODO
			
	}
	/**
	 * metodo que inicia a animaçao que adiciona elementos
	 */
	public void AnimarAdd(){
		System.out.println("ADD");
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
		btnAdicionar.setEnabled(true);
		btnRemover.setEnabled(true);
	}
	
	/**
	 * Metodo que inicia a animaçao que remove elementos
	 */
	public void AnimarRm(){
		System.out.println("dentro do RM");
		/*
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
		/*
		for (int i = 0; i < y; i++) {
			posiçao.y -= 10;
			lbl_valor.setBounds(posiçao);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		*/
		//y += 4;
		lbl_valor.setVisible(false);
		btnAdicionar.setEnabled(true);
		
	}
}
