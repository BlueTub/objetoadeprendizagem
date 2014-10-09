/**
 * 
 */
package controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
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
	 */
	public void Selecao(){
		int resp;
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
