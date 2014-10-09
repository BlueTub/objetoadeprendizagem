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
 
 private LerPerguntas arquivo=new LerPerguntas();
 
public ObjetosPerguntas(JLabel enunciado, JRadioButton resposta1,
		JRadioButton resposta2, JRadioButton resposta3, JRadioButton resposta4,
		JRadioButton resposta5) {
	this.enunciado = enunciado;
	this.resposta1 = resposta1;
	this.resposta2 = resposta2;
	this.resposta3 = resposta3;
	this.resposta4 = resposta4;
	this.resposta5 = resposta5;
}
 
	public void AlterarTela(){
		String []printar=new String[5];
		Perguntas p=new Perguntas(null);

	    arquivo.leArquivos();
	    p=(arquivo.ll1.removeFinal());
	    printar=p.getRespostas();
	    enunciado.setText(printar[0]);
	    resposta1.setText(printar[1]);
	    resposta2.setText(printar[2]);
	    resposta3.setText(printar[3]);
	    resposta4.setText(printar[4]);
	    resposta5.setText(printar[5]);
		
		
			
			
	}
}
