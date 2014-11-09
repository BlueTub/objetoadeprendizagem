/**
 * 
 */
package controller;

import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
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
	  private Fila f=new Fila();
	  private int pont = 0;
	  private Cursor cursor;
	  private JButton btnVoltar;
	  private String caminhoRespostas;
	    
	  /**
	   * Construtor 
	   * @param barra 
	   * @param texto
	   * @param fila 
	   */
	    public ThreadCarregamento(JProgressBar barra,JLabel texto,JLabel pontuacao, Fila f,Cursor cursor,JButton btnVoltar,String caminhoRespostas){
	        this.barra=barra;
	        this.texto=texto;
	        this.pontuacao=pontuacao;
	        this.f=f;
	        this.cursor=cursor;
	        this.btnVoltar=btnVoltar;
	        this.caminhoRespostas=caminhoRespostas;
	    }
	    
	    @Override
	    public void run(){
	    	Carrega(); 
	    	Potuacao(caminhoRespostas);
	    }
	    /**
	     * Método para carregar a barra
	     * @param e pontuacao feita pelo usuario
	     */
	    public void Carrega(){
	        for(int i=0;i<=100;i++){
	            barra.setValue(i);
	            try {
	                Thread.sleep(25);
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
	           barra.setVisible(false);
	           Potuacao(caminhoRespostas);
	           
	           cursor=Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
	           btnVoltar.setCursor(cursor);
	    }
	    /**
	     * Metodo para gerar a pontuacao das perguntas e pegar qual perguntas ele errou.
	     * @return pontuacao.
	     */
	    public void Potuacao(String caminho){
	    	LerRespostas ler=new LerRespostas();
	    	ler.leArquivos(caminho);
	    	
	    		while(!f.vazia()){
	    		int usuario=f.remove();
	    		int certas=ler.p1.desempilha();
	     			if(certas==usuario){
	    			pont+=20;
	     			}
	    		}
				
			
	    	 StringBuffer sb=new StringBuffer();
	    	 sb.append("Sua pontuação foi de: ");
	    	 sb.append(pont);
	    	 sb.append("%");
		     pontuacao.setText(sb.toString());
		     pontuacao.setVisible(true);
		     pontuacao.setBounds(10, 85, 564, 63);
		     if(pont>=60){
		    	 texto.setText("Parabéns você atingiu a meta!");
		     }else{
		    	 texto.setText("Recomendamos que você volte e estude mais");
		     }
		     texto.setVisible(true);
		     
	    }

}
