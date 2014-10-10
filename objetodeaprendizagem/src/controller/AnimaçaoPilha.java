package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Anima�aoPilha extends Thread{
	
	private JLabel lbl_valor;
	private static int y = 24;
	private int x = 8;
	private static int AddRm = 0;
	private JButton btnAdicionar;
	private JButton btnRemover;
	/**
	 * Construtor
	 * @param lbl_valor Thread generalizada
	 * @param btnAcao Botao a�ao
	 */
	public Anima�aoPilha(JLabel lbl_valor,JButton btnAdicionar, JButton btnRemover){
		this.lbl_valor = lbl_valor;
		this.btnAdicionar = btnAdicionar;
		this.btnRemover = btnRemover;
		}
	/**
	 * Metodo que chama a anima�ao
	 */
	public void run (){
		AnimarAdd();
		
	}
	/**
	 * metodo que inicia a anima�ao que adiciona elementos
	 */
	public void AnimarAdd(){
		System.out.println("Entrou");
		lbl_valor.setVisible(true);
		Rectangle posi�ao = lbl_valor.getBounds();
		
		for (int i = 0; i < y; i++) {
			posi�ao.y += 10;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < x; i++) {
			posi�ao.x -= 10;
			lbl_valor.setBounds(posi�ao);
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
	 * Metodo que inicia a anima�ao que remove elementos
	 */
	public void AnimarRm(){
		Rectangle posi�ao = lbl_valor.getBounds();
		
		for (int i = 0; i < x; i++) {
			posi�ao.x += 10;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < y; i++) {
			posi�ao.y -= 10;
			lbl_valor.setBounds(posi�ao);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		y += 4;
		lbl_valor.setVisible(false);
		btnAdicionar.setEnabled(true);
		
	}
}
