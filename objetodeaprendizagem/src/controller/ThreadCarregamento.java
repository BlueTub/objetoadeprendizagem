/**
 * 
 */
package controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 * Classe que ira carregar enquanto e feito as comparações de respostas
 * @author joão
 *
 */
public class ThreadCarregamento extends Thread{
	  private JProgressBar barra=new JProgressBar();
	  private JLabel texto=new JLabel();
	  private JLabel pontuacao = new JLabel();

	    
	  /**
	   * Construtor 
	   * @param barra 
	   * @param texto
	   */
	    public ThreadCarregamento(JProgressBar barra,JLabel texto,JLabel pontuacao){
	        this.barra=barra;
	        this.texto=texto;
	        this.pontuacao=pontuacao;
	    }
	    
	    @Override
	    public void run(){
	    	Carrega(Potuacao()); 
	    	
	    }
	    /**
	     * Método para carregar a barra
	     * @param e pontuacao feita pelo usuario
	     */
	    public void Carrega(int e){
	        for(int i=0;i<=100;i++){
	            barra.setValue(i);
	            try {
	                Thread.sleep(20);
	            } catch (InterruptedException ex) {
	                System.out.println(ex);
	            }
	            if(barra.getValue()<=40){
	                texto.setText("Carregando componentes");
	                texto.setVisible(true);
	            }else {
	                if(barra.getValue()<=80){
	                    texto.setText("Comparando respostas");
	                    texto.setVisible(true);
	                }else{
	                    texto.setText("Gerando pontuação");
	                    texto.setVisible(true);
	                }
	            }  
	        }
	        
		       String pont = Integer.toString(e);
		       pontuacao.setText(pont+"%");
		       pontuacao.setVisible(true);

	        	    
	    }
	    /**
	     * Metodo para gerar a pontuacao das perguntas e pegar qual perguntas ele errou.
	     * @return pontuacao.
	     */
	    public int Potuacao(){
	    	Fila f = new Fila();
	    	Pilha p = new Pilha();
	    	int pont = 0;
	    	int resp = 0;
	    	
	    	for (int i = 0; i < 5; i++) {
				if(p.desempilha() == f.remove()){
					pont = pont + 20;
					resp = i;//para dar a dica e saber ql a resposta foi errada
				} else {
					resp = i;
				}
			}
	    	return pont;

	    }
	    

}
