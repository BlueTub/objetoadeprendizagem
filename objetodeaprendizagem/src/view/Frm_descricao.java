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
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.BoxLayout;
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
		
		Descricao_e[] descricao = new Descricao_e[4];
		try {
			descricao = Carregatxt();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		JPanel painel = new JPanel();
		painel.setBounds(30, 68, 531, 230);
		contentPane.add(painel);
		painel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		tabbedPane.setBounds(0, 0, 531, 230);
		painel.add(tabbedPane);
		
		JPanel jp_descricao = new JPanel();
		tabbedPane.addTab("Descri\u00E7\u00E3o", null, jp_descricao, null);
		jp_descricao.setLayout(null);
		
		JTextPane txtpaneDesc = new JTextPane();
		txtpaneDesc.setBounds(0, 0, 526, 202);
		jp_descricao.add(txtpaneDesc);
		txtpaneDesc.setText("txt_texto");
		txtpaneDesc.setFont(new Font("Tahoma", Font.BOLD, tamanhofonte));
		txtpaneDesc.setEditable(false);
		String texto = descricao[objeto].getDescricao_int();
		txtpaneDesc.setText(texto);
		
		JPanel jp_carac = new JPanel();
		tabbedPane.addTab("Caracter\u00EDsticas", null, jp_carac, null);
		jp_carac.setLayout(null);
		
		JTextPane txtpaneCarac = new JTextPane();
		txtpaneCarac.setText("txt_texto");
		txtpaneCarac.setFont(new Font("Tahoma", Font.BOLD, tamanhofonte));
		txtpaneCarac.setEditable(false);
		txtpaneCarac.setBounds(0, 0, 526, 202);
		jp_carac.add(txtpaneCarac);
		texto=descricao[objeto].getCaract();
		txtpaneCarac.setText(texto);
		
		JPanel jp_uso = new JPanel();
		tabbedPane.addTab("Uso", null, jp_uso, null);
		jp_uso.setLayout(null);
		
		JTextPane txtpaneUso = new JTextPane();
		txtpaneUso.setText("txt_texto");
		txtpaneUso.setFont(new Font("Tahoma", Font.BOLD, tamanhofonte));
		txtpaneUso.setEditable(false);
		txtpaneUso.setBounds(0, 0, 526, 202);
		jp_uso.add(txtpaneUso);
		texto=descricao[objeto].getUso();
		txtpaneUso.setText(texto);
		
		JPanel jp_dificuldade = new JPanel();
		tabbedPane.addTab("Dificuldade", null, jp_dificuldade, null);
		jp_dificuldade.setLayout(null);
		
		JTextPane txtpaneDificuldade = new JTextPane();
		txtpaneDificuldade.setText("txt_texto");
		txtpaneDificuldade.setFont(new Font("Tahoma", Font.BOLD, tamanhofonte));
		txtpaneDificuldade.setEditable(false);
		txtpaneDificuldade.setBounds(0, 0, 526, 202);
		jp_dificuldade.add(txtpaneDificuldade);
		btn_volta.setBounds(40, 309, 89, 54);
		contentPane.add(btn_volta);
		texto=descricao[objeto].getDificult();
		txtpaneDificuldade.setText(texto);

		final JLabel lbl_titulo = new JLabel("lbl_titulo");
		lbl_titulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_titulo.setBounds(248, 11, 167, 28);
		contentPane.add(lbl_titulo);
		
        switch (objeto) {
        case 0:
                lbl_titulo.setText("Pilha");
                break;
        case 1:
                lbl_titulo.setText("Fila");
                break;
        case 2:
                lbl_titulo.setText("Lista");
                break;
        case 3:
                lbl_titulo.setText("Árvore Binária");
                break;
        default:
                break;
        }

		JLabel lblRetornarAoMenu = new JLabel("Retornar ao Menu principal");
		lblRetornarAoMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRetornarAoMenu.setBounds(30, 368, 161, 14);
		contentPane.add(lblRetornarAoMenu);

		JButton btn_prox = new JButton("");
		btn_prox.setSelectedIcon(new ImageIcon(Frm_descricao.class.getResource("/Imagens/arrow-right-select.png")));
		btn_prox.setIcon(new ImageIcon(Frm_descricao.class.getResource("/Imagens/arrow-right.png")));
		btn_prox.setBounds(432, 309, 89, 54);
		contentPane.add(btn_prox);

		JLabel lblProseguirParaA = new JLabel(
				"Proseguir para a anima\u00E7\u00E3o interativa");
		lblProseguirParaA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblProseguirParaA.setBounds(346, 368, 215, 14);
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
