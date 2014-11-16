package view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Entity.Configuracao_e;
import controller.Configuracao;
import controller.LerConfuguracao;
import controller.Linguagem_c;
import controller.Telas;
import javax.swing.SwingConstants;

/**
 * Tela de configurações
 * @author Hury
 * 
 */

@SuppressWarnings("serial")
public class Frm_config extends Telas {

	JRadioButton rdbtnnpequeno;
	JRadioButton rdbtnmedio;
	JRadioButton rdbtngrande;

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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Frm_config() {
		setTitle("Op\u00E7\u00F5es de Acessibilidade");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		centralizeFrame();
		Estilo();
		iconeBarra();
		
		JLabel lblAplicarAsModificaes = new JLabel("Aplicar as modifica\u00E7\u00F5es na configura\u00E7\u00E3o");
		lblAplicarAsModificaes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAplicarAsModificaes.setHorizontalAlignment(SwingConstants.CENTER);
		lblAplicarAsModificaes.setBounds(234, 307, 244, 24);
		contentPane.add(lblAplicarAsModificaes);
		
		JLabel label = new JLabel("Retornar ao Menu principal");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(35, 307, 161, 24);
		contentPane.add(label);
		
		final JComboBox cbestilo = new JComboBox();
		cbestilo.setBounds(234, 199, 155, 20);
		contentPane.add(cbestilo);
		cbestilo.setModel(new DefaultComboBoxModel(new String[]{
				"Metal","Nimbus","CDE/Motif","Windows","Windows classic"
		}
		));
		acharEstilos(look, cbestilo);
		JLabel lblEstilo = new JLabel("Estilo");
		lblEstilo.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		lblEstilo.setBounds(234, 174, 46, 14);
		contentPane.add(lblEstilo);

		JLabel lblTamanhoDaLetra = new JLabel("Tamanho da Letra");
		lblTamanhoDaLetra.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		lblTamanhoDaLetra.setBounds(24, 41, 155, 14);
		contentPane.add(lblTamanhoDaLetra);

		rdbtnnpequeno = new JRadioButton("");
		rdbtnnpequeno.setBounds(24, 82, 29, 23);
		contentPane.add(rdbtnnpequeno);

		rdbtnmedio = new JRadioButton("");
		rdbtnmedio.setBounds(24, 108, 29, 23);
		contentPane.add(rdbtnmedio);

		rdbtngrande = new JRadioButton("");
		rdbtngrande.setBounds(24, 138, 29, 23);
		contentPane.add(rdbtngrande);

		acharFonte();
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnnpequeno);
		grupo.add(rdbtnmedio);
		grupo.add(rdbtngrande);

		JLabel lblPequeno = new JLabel("Pequeno");
		lblPequeno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPequeno.setBounds(59, 82, 65, 14);
		contentPane.add(lblPequeno);

		JLabel lblNewLabel = new JLabel("M\u00E9dio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(59, 108, 65, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Grande");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(59, 138, 100, 25);
		contentPane.add(lblNewLabel_1);

		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(52, 66, 11, 106);
		contentPane.add(verticalStrut);

		JButton btnVoutar = new JButton("Voltar");
		btnVoutar.setMnemonic('V');
		btnVoutar.setToolTipText("Voltar para o Menu Principal");
		btnVoutar.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		btnVoutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_principal tela=new Frm_principal();
				tela.setVisible(true);
				dispose();
			}
		});
		btnVoutar.setBounds(59, 259, 89, 36);
		contentPane.add(btnVoutar);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Modo Dautonismo");
		chckbxNewCheckBox.setFont(new Font("Tahoma",Font.PLAIN,tamanhofonte));
		chckbxNewCheckBox.setBounds(234, 66, 155, 23);
		contentPane.add(chckbxNewCheckBox);

		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.setMnemonic('A');
		btnAplicar.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		btnAplicar.setToolTipText("Alterar as configurações");
		
		final JComboBox cb_linguagem = new JComboBox();
		cb_linguagem.setBounds(234, 138, 155, 20);
		contentPane.add(cb_linguagem);
		
		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resp;
				Object[] options = { "Sim", "Não" }; 
				resp=JOptionPane.showOptionDialog(null, "Deseja realmente alterar o estilo","Alteração de estilo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, 
		                options, options[0]);
				if(resp==0){
					Configuracao config=new Configuracao(cbestilo.getSelectedIndex(),SelecaoFonte(),(String) cb_linguagem.getSelectedItem());
					config.geraArquivo();
				}
				Configuracao_e dados=new Configuracao_e();
				LerConfuguracao ler=new LerConfuguracao();
			    try {
					ler.ler(dados);
				} catch (IOException e) {
					e.printStackTrace();
				}
			    look=dados.getLook();
			    tamanhofonte=dados.getFonte();
			    linguagem=dados.getLinguagem();
			    Estilo();
			}
		});
		btnAplicar.setBounds(300, 260, 89, 36);
		contentPane.add(btnAplicar);


		JLabel lblNewLabel_2 = new JLabel("Linguagem");
		lblNewLabel_2.setFont(new  Font("Tahoma",Font.PLAIN,tamanhofonte));
		lblNewLabel_2.setBounds(234, 108, 89, 23);
		contentPane.add(lblNewLabel_2);

		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_config.class
				.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 487, 341);
		contentPane.add(lbl_fundo);

		//TODO
		//LINGUAGEM, passa os arquivos do diretorio para o cb_linguagem.
		Linguagem_c lang = new Linguagem_c();
		int qtde = lang.qtdeDir();
		File[] vet = lang.diretorio();
		for(File f:vet){
			System.out.println(f.getName());
			cb_linguagem.addItem(f.getName());
		}
	}
	
	/**
	 * Método para selecionar o radiobutton que o usuário configurou
	 */
	public void acharFonte(){
		if(tamanhofonte==12){
			rdbtnnpequeno.setSelected(true);
		}else{
			if(tamanhofonte==14){
				rdbtnmedio.setSelected(true);
			}else{
				rdbtngrande.setSelected(true);
			}
		}
	}
	
	/**
	 * Método para achar o estilo selecionado
	 * @param look 
	 * @param combo recebe o combobox para alterar o indice
	 */
	private void acharEstilos(String look, JComboBox combo){		 
		if(look.equals("javax.swing.plaf.metal.MetalLookAndFeel")){
			combo.setSelectedIndex(0);
		}
		if(look.equals("javax.swing.plaf.nimbus.NimbusLookAndFeel")){
			combo.setSelectedIndex(1);
		}

		if(look.equals("com.sun.java.swing.plaf.motif.MotifLookAndFeel")){
			combo.setSelectedIndex(2);
		}

		if(look.equals("com.sun.java.swing.plaf.windows.WindowsLookAndFeel")){
			combo.setSelectedIndex(3);
		}

		if(look.equals("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel")){
			combo.setSelectedIndex(4);
		}
		
	}

	/**
	 * Método para selecionar fonte a partir da seleção do radioButton
	 * @return tamanho da fonte
	 */
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
