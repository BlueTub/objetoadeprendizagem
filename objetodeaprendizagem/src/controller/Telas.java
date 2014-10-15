package controller;


import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;


/**
 * Classe que herda de jFrame e contem os metodos de aparencia do frame
 * @author joão
 *
 */
public abstract class Telas extends JFrame {
	
	public void iconeBarra(){
	     BufferedImage image = null;  
	        try {  
	            image = ImageIO.read(  
	            this.getClass().getResource("/Imagens/icon.png"));  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	        this.setIconImage(image);
	}
	
	  public void centralizeFrame(){
	        int x,y;
	        Rectangle scr=this.getGraphicsConfiguration().getBounds();
	        Rectangle form=this.getBounds();
	        x= (int) (scr.getWidth() - form.getWidth())/2;
	        y=(int) (scr.getHeight()-form.getHeight())/2;
	        this.setLocation(x, y);
	    }
	 
	  public void Estilo(){
			try {
				javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
			} catch (ClassNotFoundException e2) {
				e2.printStackTrace();
			} catch (InstantiationException e2) {
				e2.printStackTrace();
			} catch (IllegalAccessException e2) {
				e2.printStackTrace();
			} catch (UnsupportedLookAndFeelException e2) {
				e2.printStackTrace();
			}
	  }
	  

}
