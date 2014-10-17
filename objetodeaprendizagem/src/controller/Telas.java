package controller;


import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
//import javax.swing.UnsupportedLookAndFeelException;

/**
 * Classe que herda de jFrame e contem os metodos de aparencia do frame
 * @author joão
 * @autor Hury
 */
@SuppressWarnings("serial")
public abstract class Telas extends JFrame {
	protected static String look="javax.swing.plaf.nimbus.NimbusLookAndFeel";
	
	/**
	 * Método que altera o icone das telas
	 */
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
	
	/**
	 * Método para centralizar as telas no centro
	 */
	  public void centralizeFrame(){
	        int x,y;
	        Rectangle scr=this.getGraphicsConfiguration().getBounds();
	        Rectangle form=this.getBounds();
	        x= (int) (scr.getWidth() - form.getWidth())/2;
	        y=(int) (scr.getHeight()-form.getHeight())/2;
	        this.setLocation(x, y);
	    }
	  
	 /**
	  * Método que seta o estilo de todas as telas
	  */
	  public void Estilo(){		  
		  try {
			 UIManager.setLookAndFeel(look);
			 javax.swing.SwingUtilities.updateComponentTreeUI( this );
			} catch (Exception e) {
				System.out.println(e);
			}		  
	  }

}
