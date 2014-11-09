package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Component;
import java.io.IOException;

import javax.swing.Box;

import javax.swing.JTextPane;
import javax.swing.UIManager;

import controller.AbreDoc;
import controller.Descricao_c;
import controller.Telas;

import Entity.Descricao_e;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
/**
 * Tela principal, o usuário pode selecionar um objeto
 * @author Hury
 *
 */
@SuppressWarnings("serial")
public class Frm_principal extends Telas {

	//TODO as fontes de todas as labels devem ser "VERDANA"
	
	private JPanel contentPane;

	int objeto = 0; // variavel que controla qual objeto de aprendizado sera
					// trabalhado

	public static void main(String[] args) throws IOException {
		Carregatxt();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_principal frame = new Frm_principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 
	 * @return objeto descrição já carregado
	 * @throws IOException
	 */

	public static Descricao_e[] Carregatxt() throws IOException {
		Descricao_e[] descricao = new Descricao_e[4];
		for (int i = 0; i < 4; i++) {
			descricao[i] = new Descricao_e();
		}

		Descricao_c metodos = new Descricao_c();
		metodos.le(descricao);
		// metodos.TestaTexto(descricao);
		return descricao;
	}

	/**
	 * inicializa o JFrame
	 */

	public Frm_principal() {
		setResizable(false);
		setTitle("Principal");

		inicializa();

	}

	/**
	 * Create the frame.
	 */
	public void inicializa() {
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 429);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		centralizeFrame();
		Estilo();
		iconeBarra();

		JLabel label = new JLabel(
				"Selecione um objeto para iniciar a anima\u00E7\u00E3o e logo ap\u00F3s o questionario.");
		label.setFont(new Font("Arial", Font.BOLD, tamanhofonte));
		label.setBounds(52, 28, 548, 21);
		contentPane.add(label);

		final JLabel lbl_titulo = new JLabel("lbl_titulo");
		lbl_titulo.setFont(new Font("Tahoma", Font.BOLD, tamanhofonte));
		lbl_titulo.setBounds(276, 60, 277, 20);
		contentPane.add(lbl_titulo);

		JButton btn_config = new JButton("");
		btn_config.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Frm_config telaconfig = new Frm_config();
				telaconfig.setVisible(true);
			}
		});
		btn_config
				.setIcon(new ImageIcon(Frm_principal.class.getResource("/Imagens/config.png")));
		btn_config.setBounds(610, 25, 38, 40);
		contentPane.add(btn_config);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(276, 91, 333, 7);
		contentPane.add(horizontalStrut);

		final JTextPane txt_descricao = new JTextPane();
		txt_descricao.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		txt_descricao.setText("txt_descricao");
		txt_descricao.setEditable(false);
		txt_descricao.setBackground(UIManager
				.getColor("InternalFrame.activeTitleGradient"));
		txt_descricao.setBounds(276, 113, 314, 125);
		contentPane.add(txt_descricao);

		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(276, 260, 333, 14);
		contentPane.add(horizontalStrut_1);

		JButton btn_inicia = new JButton("");
		btn_inicia.setSelectedIcon(new ImageIcon(Frm_principal.class.getResource("/Imagens/arrow-right-select.png")));
		btn_inicia.setIcon(new ImageIcon(Frm_principal.class.getResource("/Imagens/arrow-right.png")));
		btn_inicia.setFont(new Font("Tahoma", Font.BOLD, tamanhofonte));
		btn_inicia
				.setToolTipText("Abre a tela de descri\u00E7\u00F5es onde ir\u00E1 ser apresentado mais detalhes sobre o objeto.");
		btn_inicia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Frm_descricao tela = new Frm_descricao(objeto);
				tela.setVisible(true);
				dispose();

			}
		});
		btn_inicia.setBounds(515, 285, 83, 40);
		contentPane.add(btn_inicia);
		lbl_titulo.setVisible(false);
		txt_descricao.setVisible(false);

		JLabel lblMostrarMaisDetalhes = new JLabel("Mostrar Mais detalhes");
		lblMostrarMaisDetalhes.setFont(new Font("Tahoma",Font.PLAIN,tamanhofonte));
		lblMostrarMaisDetalhes.setBounds(491, 339, 157, 14);
		contentPane.add(lblMostrarMaisDetalhes);


		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 658, 21);
		contentPane.add(menuBar);

		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Fechar");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);

		JMenu mnNewMenu_1 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AbreDoc doc = new AbreDoc();
				doc.AbreManual();
			}

		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnSobre = new JMenu("Sobre");
		menuBar.add(mnSobre);
		
		JMenuItem mntmSobre = new JMenuItem("Detalhes");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frm_sobre telasobre = new Frm_sobre();
				telasobre.setVisible(true);
			}
		});
		mnSobre.add(mntmSobre);

		JLabel lblConfig = new JLabel("Config");
		lblConfig.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblConfig.setBounds(610, 68, 46, 14);
		contentPane.add(lblConfig);
		
				Panel panel = new Panel();
				panel.setBackground(UIManager
						.getColor("InternalFrame.activeTitleGradient"));
				panel.setLayout(null);
				panel.setBounds(40, 64, 197, 307);
				contentPane.add(panel);
				
				final JLabel lbl_select = new JLabel("");
				lbl_select.setIcon(new ImageIcon(Frm_principal.class.getResource("/Imagens/bolaselect.png")));
				lbl_select.setBounds(159, 52, 24, 20);
				panel.add(lbl_select);
				
						JButton btn_pilha = new JButton("Pilha");
						btn_pilha.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								Descricao_e[] descricao = new Descricao_e[4];
								try {
									descricao = Carregatxt();
									lbl_select.setBounds(159, 52, 24, 20);
								} catch (IOException e) {
									e.printStackTrace();
								}
								String texto = descricao[0].getDescricao_res();
								txt_descricao.setText(texto);
								lbl_titulo.setText("Pilha");
								lbl_titulo.setVisible(true);
								txt_descricao.setVisible(true);
								objeto = 0;
							}
						});
						
								btn_pilha.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
								btn_pilha.setBounds(29, 32, 120, 56);
								btn_pilha.setMnemonic('P');
								panel.add(btn_pilha);
								
										JButton btn_fila = new JButton("Fila");
										btn_fila.setMnemonic('F');
										btn_fila.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
										btn_fila.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												Descricao_e[] descricao = new Descricao_e[4];
												try {
													descricao = Carregatxt();
													lbl_select.setBounds(159, 112, 24, 20);
												} catch (IOException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												String texto = descricao[1].getDescricao_res();
												txt_descricao.setText(texto);
												lbl_titulo.setText("Fila");
												lbl_titulo.setVisible(true);
												txt_descricao.setVisible(true);
												objeto = 1;
											}
										});
										btn_fila.setBounds(29, 99, 120, 56);
										panel.add(btn_fila);
										
												JButton btn_lista = new JButton("Lista");
												btn_lista.setMnemonic('L');
												btn_lista.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
												btn_lista.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														Descricao_e[] descricao = new Descricao_e[4];
														try {
															descricao = Carregatxt();
															lbl_select.setBounds(159, 182, 24, 20);
														} catch (IOException e1) {
															// TODO Auto-generated catch block
															e1.printStackTrace();
														}
														String texto = descricao[2].getDescricao_res();
														txt_descricao.setText(texto);
														lbl_titulo.setText("Lista Ligada");
														lbl_titulo.setVisible(true);
														txt_descricao.setVisible(true);
														objeto = 2;
													}
												});
												btn_lista.setBounds(29, 166, 120, 56);
												panel.add(btn_lista);
												
														JLabel lblNewLabel = new JLabel("Selecione");
														lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
														lblNewLabel.setBounds(60, 7, 67, 14);
														panel.add(lblNewLabel);
														
														JButton btn_arvore = new JButton("Árvore Bin\u00E1ria");
														btn_arvore.setMnemonic('Á');
														btn_arvore.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent arg0) {
																Descricao_e[] descricao = new Descricao_e[4];
																try {
																	descricao = Carregatxt();
																	lbl_select.setBounds(159, 250, 24, 20);
																} catch (IOException e1) {
																	// TODO Auto-generated catch block
																	e1.printStackTrace();
																}
																String texto = descricao[3].getDescricao_res();
																txt_descricao.setText(texto);
																lbl_titulo.setText("Arvore Binária");
																lbl_titulo.setVisible(true);
																txt_descricao.setVisible(true);
																objeto = 3;
															}
														});
														btn_arvore.setFont(new Font("Tahoma", Font.PLAIN, 14));
														btn_arvore.setBounds(29, 233, 120, 56);
														panel.add(btn_arvore);
																

																
																		JLabel lbl_fundo = new JLabel("");
																		lbl_fundo.setIcon(new ImageIcon(Frm_principal.class
																				.getResource("/Imagens/BackGround.png")));
																		lbl_fundo.setBounds(0, 0, 658, 401);
																		contentPane.add(lbl_fundo);
														btn_pilha.doClick();

		try {
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Não foi possivel carregar 'Descricao.txt'");
		}

	}
}
