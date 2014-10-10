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
	  private JLabel dica = new JLabel();
	  private JLabel pontuacao = new JLabel();

	    
	  /**
	   * Construtor 
	   * @param barra 
	   * @param texto
	   */
	    public ThreadCarregamento(JProgressBar barra,JLabel texto,JLabel dica,JLabel pontuacao){
	        this.barra=barra;
	        this.texto=texto;
	        this.dica=dica;
	        this.pontuacao=pontuacao;
	    }
	    
	    @Override
	    public void run(){
	    	Carrega(Potuacao()); 
	        
	    }
	    /**
	     * Método para carregar a barra
	     */
	    public void Carrega(int e){
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
	        
	        
	        String resp = Integer.toString(e);
	        pontuacao.setText(resp);
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
