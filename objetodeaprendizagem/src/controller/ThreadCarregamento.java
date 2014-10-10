/**
 * 
 */
package controller;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 * Classe que ira carregar enquanto e feito as comparações de respostas
 * @author joão
 *
 */
public class ThreadCarregamento extends Thread{
	  private JProgressBar barra=new JProgressBar();
	  private JLabel texto=new JLabel();
	    
	  /**
	   * Construtor 
	   * @param barra 
	   * @param texto
	   */
	    public ThreadCarregamento(JProgressBar barra,JLabel texto){
	        this.barra=barra;
	        this.texto=texto;
	    }
	    
	    @Override
	    public void run(){
	        Carrega(); 
	        
	    }
	    /**
	     * Método para carregar a barra
	     */
	    public void Carrega(){
	        for(int i=0;i<=100;i++){
	            barra.setValue(i);
	            try {
	                Thread.sleep(18);
	            } catch (InterruptedException ex) {
	                System.out.println(ex);
	            }
	            if(barra.getValue()<=40){
	                texto.setText("Carregando componentes");
	            }else {
	                if(barra.getValue()<=80){
	                    texto.setText("Comparando respostas");
	                }else{
	                    texto.setText("Gerando pontuação");
	                }
	            }  
	        }
	    
	    }
	    

}
