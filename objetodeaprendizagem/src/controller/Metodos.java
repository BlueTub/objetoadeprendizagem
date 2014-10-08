package controller;

import java.awt.Rectangle;

import javax.swing.JLabel;

public class Metodos extends Thread{

	private JLabel lbltext_1;
	private JLabel lbltext_2;
	
	public Metodos(JLabel lbltext_1, JLabel lbltext_2){
		this.lbltext_1 = lbltext_1;
		this.lbltext_2 = lbltext_2;
	}
	
	public void run (){
		mexer();
	}
	
	public void mexer(){
		Rectangle text_1 = lbltext_1.getBounds();
		//Rectangle text_2 = lbltext_2.getBounds();
		
		//for (int i = 0; i < 4; i++) {
			text_1.y += 100;
			lbltext_1.setBounds(text_1);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//}
		
		//for (int i = 0; i < 6; i++) {
			text_1.x += 100;
			lbltext_1.setBounds(text_1);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//}
		
		//for (int i = 0; i < 2; i++) {
			text_1.y -= 100;
			lbltext_1.setBounds(text_1);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//}
	}

}
