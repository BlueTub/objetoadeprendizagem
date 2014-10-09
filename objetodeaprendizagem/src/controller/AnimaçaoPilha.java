package controller;

import java.awt.Rectangle;

import javax.swing.JLabel;

public class AnimaçaoPilha extends Thread{
	
	private JLabel lbl_valor10;
	private JLabel lbl_valor20;
	private JLabel lbl_valor30;
	private JLabel lbl_valor40;
	private JLabel lbl_valor50;
	private JLabel lbl_valor60;
	private JLabel lbl_valor70;
	private static int add;
	private static int rm;
	
	public AnimaçaoPilha(JLabel lbl_valor10, JLabel lbl_valor20, JLabel lbl_valor30, 
			JLabel lbl_valor40, JLabel lbl_valor50, JLabel lbl_valor60, JLabel lbl_valor70){
		this.lbl_valor10 = lbl_valor10;
		this.lbl_valor20 = lbl_valor20;
		this.lbl_valor30 = lbl_valor10;
		this.lbl_valor40 = lbl_valor40;
		this.lbl_valor50 = lbl_valor50;
		this.lbl_valor60 = lbl_valor60;
		this.lbl_valor70 = lbl_valor70;
		}
	
	public void run (){
		Animar();
		add++;
	}
	
	public void Animar(){
		if (add == 0){ 
			valor10();
		}
		 if (add == 1){ 
			 valor20();	
		 }
	}
	
	public void valor10(){
		lbl_valor10.setVisible(true);
		Rectangle valor10 = lbl_valor10.getBounds();
		
		for (int i = 0; i < 24; i++) {
			valor10.y += 10;
			lbl_valor10.setBounds(valor10);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 8; i++) {
			valor10.x -= 10;
			lbl_valor10.setBounds(valor10);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void valor20(){
		lbl_valor20.setVisible(true);
		Rectangle valor20 = lbl_valor20.getBounds();
		
		for (int i = 0; i < 20; i++) {
			valor20.y += 10;
			lbl_valor20.setBounds(valor20);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 8; i++) {
			valor20.x -= 10;
			lbl_valor20.setBounds(valor20);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void valor30(){
		lbl_valor30.setVisible(true);
		Rectangle valor30 = lbl_valor30.getBounds();
		
		for (int i = 0; i < 16; i++) {
			valor30.y += 10;
			lbl_valor30.setBounds(valor30);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 8; i++) {
			valor30.x -= 10;
			lbl_valor30.setBounds(valor30);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
