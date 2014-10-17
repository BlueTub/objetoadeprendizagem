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
	
	public void AlterarLook(String look){
		this.look=look;
	}
	
	  public void centralizeFrame(){
	        int x,y;
	        Rectangle scr=this.getGraphicsConfiguration().getBounds();
	        Rectangle form=this.getBounds();
	        x= (int) (scr.getWidth() - form.getWidth())/2;
	        y=(int) (scr.getHeight()-form.getHeight())/2;
	        this.setLocation(x, y);
	    }
	 /**
	  * seta o estilo como "Nimbus Look and Feel"
	  */
	  public void Estilo(){
		  
		  try {
//			  for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//				  if ("Nimbus".equals(info.getName())) {
//			         UIManager.setLookAndFeel(info.getClassName());
//			        break;
//				  }
			 UIManager.setLookAndFeel(look);
			 javax.swing.SwingUtilities.updateComponentTreeUI( this );
			} catch (Exception e) {
				System.out.println(e);
			}
		  
		  /*
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
			}*/  
		  
	  }

}
