package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

import controller.Descricao_c;
import controller.Telas;

import Entity.Descricao_e;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
/**
 * Tela que irá aprensentar os atribultos do objeto em questão
 * @author Hury
 *
 */
@SuppressWarnings("serial")
public class Frm_descricao extends Telas {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	static// TODO está variavel deve receber um parametro de 0 a 3 do formulario
	// principal.
	int objeto = 0;

	public static void main(String[] args) throws IOException {

		Carregatxt();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_descricao frame = new Frm_descricao(objeto);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Atribui valor ao atributo
	 * 
	 * @param objeto
	 */

	@SuppressWarnings("static-access")
	public void setObjeto(int objeto) {
		this.objeto = objeto;
	}

	/**
	 * 
	 * @return o objeto descrição já carregado com os dados do txt
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
	 * Create the frame.
	 */

	public Frm_descricao(int obj) {
		setTitle("Descri\u00E7\u00F5es");
		setResizable(false);

		setObjeto(obj); // informa ao novo frm qual o objeto em questão (0=
						// pilha, 1=fila,2=lista ligada)

		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 424);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		centralizeFrame();
		Estilo();
		iconeBarra();

		JButton btn_volta = new JButton("");
		btn_volta.setSelectedIcon(new ImageIcon(Frm_descricao.class.getResource("/Imagens/arrow-back-select.png")));
		btn_volta.setIcon(new ImageIcon(Frm_descricao.class.getResource("/Imagens/arrow-back.png")));
		btn_volta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_principal tela = new Frm_principal();
				tela.setVisible(true);
				dispose();
			}
		});
		btn_volta.setBounds(50, 309, 89, 40);
		contentPane.add(btn_volta);

		final JLabel lbl_titulo = new JLabel("lbl_titulo");
		lbl_titulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_titulo.setBounds(248, 11, 167, 28);
		contentPane.add(lbl_titulo);

		JPanel panel = new JPanel();
		panel.setBackground(UIManager
				.getColor("InternalFrame.activeTitleGradient"));
		panel.setLayout(null);
		panel.setBounds(30, 68, 518, 230);
		contentPane.add(panel);

		final JTextPane txt_texto = new JTextPane();
		txt_texto.setEditable(false);
		txt_texto.setFont(new Font("Tahoma",Font.BOLD,tamanhofonte));
		txt_texto.setText("txt_texto");
		txt_texto.setBounds(10, 30, 498, 189);
		panel.add(txt_texto);

		JButton btn_descricao = new JButton("Descri\u00E7\u00E3o");
		btn_descricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao = Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String texto = "";
				texto = descricao[objeto].getDescricao_int();
				txt_texto.setText(texto);
				switch (objeto) {
				case 0:
					lbl_titulo.setText("Pilha");
					break;
				case 1:
					lbl_titulo.setText("Fila");
					break;
				case 2:
					lbl_titulo.setText("Lista Ligada");
					break;
				case 3:
					lbl_titulo.setText("Arvore Binária");
					break;
				default:
					break;
				}
			}
		});

		// clica no botão para inicializar o textpanel com conteudo
		try {
			btn_descricao.doClick();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Não foi possivel carregar 'Descricao.txt'");
		}

		btn_descricao.setBounds(10, 11, 130, 23);
		panel.add(btn_descricao);

		JButton btn_caract = new JButton("Caracteristicas");
		btn_caract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[4];
				try {
					descricao = Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String texto = descricao[objeto].getCaract();
				txt_texto.setText(texto);
			}
		});
		btn_caract.setBounds(137, 11, 144, 23);
		panel.add(btn_caract);

		JButton btn_uso = new JButton("Uso");
		btn_uso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[4];
				try {
					descricao = Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String texto = descricao[objeto].getUso();
				txt_texto.setText(texto);
			}
		});
		btn_uso.setBounds(277, 11, 101, 23);
		panel.add(btn_uso);

		JButton btn_dificuldade = new JButton("Dificuldade");
		btn_dificuldade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[4];
				try {
					descricao = Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String texto = descricao[objeto].getDificult();
				txt_texto.setText(texto);
			}
		});
		btn_dificuldade.setBounds(378, 11, 130, 23);
		panel.add(btn_dificuldade);

		JLabel lblRetornarAoMenu = new JLabel("Retornar ao Menu principal");
		lblRetornarAoMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRetornarAoMenu.setBounds(30, 360, 161, 14);
		contentPane.add(lblRetornarAoMenu);

		JButton btn_prox = new JButton("");
		btn_prox.setSelectedIcon(new ImageIcon(Frm_descricao.class.getResource("/Imagens/arrow-right-select.png")));
		btn_prox.setIcon(new ImageIcon(Frm_descricao.class.getResource("/Imagens/arrow-right.png")));
		btn_prox.setBounds(428, 309, 89, 40);
		contentPane.add(btn_prox);

		JLabel lblProseguirParaA = new JLabel(
				"Proseguir para a anima\u00E7\u00E3o interativa");
		lblProseguirParaA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblProseguirParaA.setBounds(344, 360, 215, 14);
		contentPane.add(lblProseguirParaA);

		JLabel lblNavegueEntreAs = new JLabel(
				"Navegue entre as abas para conhecer mais");
		lblNavegueEntreAs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNavegueEntreAs.setBounds(50, 39, 299, 28);
		contentPane.add(lblNavegueEntreAs);

		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_descricao.class
				.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 586, 395);
		contentPane.add(lbl_fundo);
		btn_prox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				switch (objeto) {
				case 0:
					Frm_animaPilha telapilha = new Frm_animaPilha();
					telapilha.setVisible(true);
					dispose();
					break;
				case 1:
					Frm_animaFila telafila = new Frm_animaFila(objeto);
					telafila.setVisible(true);
					dispose();
					break;
				case 2:
					Frm_animaLista telalista = new Frm_animaLista(objeto);
					telalista.setVisible(true);
					dispose();
					break;
					
				case 3:
					Frm_animaArvore telaarvore = new Frm_animaArvore();
					telaarvore.setVisible(true);
					dispose();
					break;
				default:
					JOptionPane.showMessageDialog(null,
							"Ocorreu um erro interno" + objeto);
					break;
				}

			}
		});

	}

}
