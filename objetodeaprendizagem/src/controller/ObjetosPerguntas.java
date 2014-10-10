/**
 * 
 */
package controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 * Classe que tratara dos objetos da classe JF_Perguntas
 * @author joão
 * @version 08/10
 */
public class ObjetosPerguntas {
 private JLabel enunciado;
 private JRadioButton resposta1;
 private JRadioButton resposta2;
 private JRadioButton resposta3;
 private JRadioButton resposta4;
 private JRadioButton resposta5;

 private LerPerguntas arquivo = new LerPerguntas();
 
 public Fila fila=new Fila();
 
 /**
  * Construtor da classe 
  * @param enunciado Recebe a label com o enunciado da pergunta
  * @param resposta1 Recebe o JradioButton da primeira resposta
  * @param resposta2 Recebe o JradioButton da segunda resposta
  * @param resposta3 Recebe o JradioButton da terceira resposta
  * @param resposta4 Recebe o JradioButton da quarta resposta
  * @param resposta5 Recebe o JradioButton da quinta resposta
  */
public ObjetosPerguntas(JLabel enunciado, JRadioButton resposta1,
		JRadioButton resposta2, JRadioButton resposta3, JRadioButton resposta4,
		JRadioButton resposta5) {
	this.enunciado = enunciado;
	this.resposta1 = resposta1;
	this.resposta2 = resposta2;
	this.resposta3 = resposta3;
	this.resposta4 = resposta4;
	this.resposta5 = resposta5;
	arquivo.leArquivos();
}
 /**
  * Método que altera o conteúdo a partir dos dados da lista ligada
  */
	public void AlterarTela(){
		String []printar = new String[5];
		Perguntas p=new Perguntas(null);
	    
	    p=(arquivo.ll1.removeFinal());
	    try{
	    printar=p.getRespostas();
	    enunciado.setText(printar[0]);
	    resposta1.setText(printar[1]);
	    resposta2.setText(printar[2]);
	    resposta3.setText(printar[3]);
	    resposta4.setText(printar[4]);
	    resposta5.setText(printar[5]);
	    }catch(NullPointerException e){
	    	JOptionPane.showMessageDialog(null, "Fim do questionário");
	    }	
			
	}
	
	/**
	 * Método para verificar qual jRadioButton foi selecionado
	 * e adicionar a fila
	 */
	public void Selecao(){
		int resp = 0;
		if(resposta1.isSelected()){
			resp=1;
		}
		if(resposta2.isSelected()){
			resp=2;
		}
		if(resposta3.isSelected()){
			resp=3;
		}
		if(resposta4.isSelected()){
			resp=4;
		}
		if(resposta5.isSelected()){
			resp=5;
		}
		fila.adiciona(resp);
	}
	
	/**
	 * Método para válidar se algum jRadioButton foi selecionado
	 * @return true Se algum radio button for selecionado, caso contrario false
	 */
	public boolean valida(){
		if((resposta1.isSelected()||resposta2.isSelected()||resposta3.isSelected()||resposta4.isSelected()||resposta5.isSelected())){
			return true;
		}
		return false;
	}

}
