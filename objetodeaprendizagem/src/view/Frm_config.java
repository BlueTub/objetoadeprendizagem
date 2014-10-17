package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entity.Configuracao_e;
import controller.Configuracao;
import controller.LerConfuguracao;
import controller.Telas;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

/**
 * 
 * @author Hury
 * 
 */

@SuppressWarnings("serial")
public class Frm_config extends Telas {

	JRadioButton rdbtnnpequeno;
	JRadioButton rdbtnmedio;
	JRadioButton rdbtngrande;
	// TODO Formulario em programação

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_config frame = new Frm_config();
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
	public Frm_config() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JComboBox cbestilo = new JComboBox();
		cbestilo.setBounds(234, 192, 155, 20);
		contentPane.add(cbestilo);
		cbestilo.setModel(new DefaultComboBoxModel(new String[]{
				"Metal","Nimbus","CDE/Motif","Windows","Windows classic"
		}
		));
		cbestilo.setSelectedIndex(1);
		JLabel lblEstilo = new JLabel("Estilo");
		lblEstilo.setBounds(234, 169, 46, 14);
		contentPane.add(lblEstilo);

		JLabel lblTamanhoDaLetra = new JLabel("Tamanho da Letra");
		lblTamanhoDaLetra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTamanhoDaLetra.setBounds(24, 41, 155, 14);
		contentPane.add(lblTamanhoDaLetra);

		rdbtnnpequeno = new JRadioButton("");
		rdbtnnpequeno.setSelected(true);
		rdbtnnpequeno.setBounds(24, 82, 29, 23);
		contentPane.add(rdbtnnpequeno);

		rdbtnmedio = new JRadioButton("");
		rdbtnmedio.setBounds(24, 108, 29, 23);
		contentPane.add(rdbtnmedio);

		rdbtngrande = new JRadioButton("");
		rdbtngrande.setBounds(24, 138, 29, 23);
		contentPane.add(rdbtngrande);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnnpequeno);
		grupo.add(rdbtnmedio);
		grupo.add(rdbtngrande);

		JLabel lblPequeno = new JLabel("Pequeno");
		lblPequeno.setBounds(59, 82, 65, 14);
		contentPane.add(lblPequeno);

		JLabel lblNewLabel = new JLabel("M\u00E9dio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(59, 108, 65, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Grande");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(59, 138, 100, 25);
		contentPane.add(lblNewLabel_1);

		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(52, 66, 11, 106);
		contentPane.add(verticalStrut);

		JButton btnVoutar = new JButton("Voltar");
		btnVoutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_principal tela=new Frm_principal();
				tela.setVisible(true);
				dispose();
			}
		});
		btnVoutar.setBounds(251, 284, 89, 36);
		contentPane.add(btnVoutar);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Modo Dautonismo");
		chckbxNewCheckBox.setBounds(234, 66, 155, 23);
		contentPane.add(chckbxNewCheckBox);

		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resp;
				resp=JOptionPane.showConfirmDialog(null, "Deseja realmente alterar o estilo","Alteração de estilo",0,1);	
				if(resp==0){
					Configuracao config=new Configuracao(cbestilo.getSelectedIndex(),SelecaoFonte());
					config.geraArquivo();
				}
				Configuracao_e dados=new Configuracao_e();
				LerConfuguracao ler=new LerConfuguracao();
			    try {
					ler.le(dados);
				} catch (IOException e) {
					e.printStackTrace();
				}
			    look=dados.getLook();
			    Estilo();
			}
		});
		btnAplicar.setBounds(364, 284, 89, 36);
		contentPane.add(btnAplicar);

		JButton btnRestaurarPadres = new JButton("Restaurar Padr\u00F5es");
		btnRestaurarPadres.setBounds(24, 284, 155, 36);
		contentPane.add(btnRestaurarPadres);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {
				"Portugu\u00EAs - BR", "English" }));
		comboBox.setBounds(234, 138, 155, 20);
		contentPane.add(comboBox);

		JLabel lblNewLabel_2 = new JLabel("Linguagem");
		lblNewLabel_2.setBounds(234, 108, 89, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_config.class
				.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 487, 341);
		contentPane.add(lbl_fundo);
	}
	
	public int SelecaoFonte(){
		int Fonte;
		if(rdbtnnpequeno.isSelected()){
			Fonte= 12;
		}else{
			if(rdbtnmedio.isSelected()){
				Fonte=14;
			}else{
				Fonte=16;
			}
		}
		return Fonte;
	}
}
