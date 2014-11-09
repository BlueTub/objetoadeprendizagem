package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import controller.ObjetosPerguntas;
import controller.Telas;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
/**
 * Tela que irá apresentar o questionario do objeto em questão
 * @author João
 *
 */
@SuppressWarnings("serial")
public class Frm_Perguntas extends Telas {

	private JPanel contentPane;
	private String caminho;
	private String caminhoRespostas;
	private int obj;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_Perguntas frame = new Frm_Perguntas(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frm_Perguntas(String caminho) {
		setTitle("Perguntas");
		setResizable(false);
		this.caminho=caminho;
		Initialize();
		
	}
	/*
	 * Método para descobrir o caminho das respostas
	 */
	public void CaminhoResposta(){
		if(caminho.equals("Perguntas.txt")){
			caminhoRespostas="respostasPilha.txt";
			obj=0;
		}else{
			if(caminho.equals("Perguntas1.txt")){
				caminhoRespostas="Resposta_Fila.txt";
				obj=1;
			}
		}
	}
	
	public void Initialize(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		centralizeFrame();
		iconeBarra();
		Estilo();
		JPanel painel = new JPanel();
		painel.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		painel.setBounds(10, 53, 594, 286);
		contentPane.add(painel);
		painel.setLayout(null);
		
		JRadioButton rdbtnPergunta1 = new JRadioButton("pergunta 1");
		rdbtnPergunta1.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		rdbtnPergunta1.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		rdbtnPergunta1.setBounds(6, 81, 588, 23);
		painel.add(rdbtnPergunta1);
		
		JRadioButton rdbtnPergunta2 = new JRadioButton("pergunta 2");
		rdbtnPergunta2.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		rdbtnPergunta2.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		rdbtnPergunta2.setBounds(6, 127, 582, 23);
		painel.add(rdbtnPergunta2);
		
		JRadioButton rdbtnPergunta3 = new JRadioButton("pergunta 3");
		rdbtnPergunta3.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		rdbtnPergunta3.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		rdbtnPergunta3.setBounds(6, 172, 588, 23);
		painel.add(rdbtnPergunta3);
		
		JRadioButton rdbtnPergunta4 = new JRadioButton("pergunta 4");
		rdbtnPergunta4.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		rdbtnPergunta4.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		rdbtnPergunta4.setBounds(6, 212, 588, 23);
		painel.add(rdbtnPergunta4);
		
		JRadioButton rdbtnPergunta5 = new JRadioButton("pergunta 5");
		rdbtnPergunta5.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		rdbtnPergunta5.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		rdbtnPergunta5.setBounds(6, 256, 588, 23);
		painel.add(rdbtnPergunta5);
		
		final ButtonGroup grupo = new ButtonGroup(); 
		grupo.add(rdbtnPergunta1);
		grupo.add(rdbtnPergunta2);
		grupo.add(rdbtnPergunta3);
		grupo.add(rdbtnPergunta4);
		grupo.add(rdbtnPergunta5);
		
		JLabel lblEnunciado = new JLabel("enunciado");
		lblEnunciado.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		lblEnunciado.setBounds(6, 0, 588, 85);
		painel.add(lblEnunciado);
		
		JButton btnProximo = new JButton("Pr\u00F3ximo");
		btnProximo.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		btnProximo.setMnemonic('p');
		btnProximo.setToolTipText("Avançar para próxima pergunta");
		btnProximo.setBounds(463, 350, 107, 30);
		contentPane.add(btnProximo);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		btnVoltar.setToolTipText("Voltar para a descrição");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int resp;
			resp=JOptionPane.showConfirmDialog(null, "Deseja realmente voltar para a descrição","Voltar a descrição",0,1);	
				if(resp==0){
				CaminhoResposta();
			    Frm_descricao tela=new Frm_descricao(obj);
				tela.setVisible(true);
				Frm_Perguntas.this.dispose();
				}
			}
		});
		btnVoltar.setMnemonic('v');
		btnVoltar.setBounds(51, 350, 89, 30);
		contentPane.add(btnVoltar);
	     
		final ObjetosPerguntas muda;
		muda=new ObjetosPerguntas(lblEnunciado, rdbtnPergunta1, rdbtnPergunta2, rdbtnPergunta3, rdbtnPergunta4, rdbtnPergunta5,caminho);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Frm_Perguntas.class.getResource("/Imagens/circle-question.png")));
		lblNewLabel.setBounds(271, 0, 64, 68);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_Perguntas.class.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 614, 409);
		contentPane.add(lbl_fundo);
		muda.AlterarTela();
	
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(muda.valida()){
					muda.Selecao();
					if(!(muda.arquivo.ll1.vazia())){
					
					muda.AlterarTela();
					grupo.clearSelection();
					}else{
						CaminhoResposta();
						Frm_Perguntas.this.dispose();
						Frm_Pontuacao tela=new Frm_Pontuacao(muda.fila,caminhoRespostas);
					    tela.setVisible(true);
						
					}
						
				}else{
				JOptionPane.showMessageDialog(null, "Selecione uma opção","Opção não selecionada",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
	
}
