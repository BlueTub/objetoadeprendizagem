package view;

import java.awt.BorderLayout;
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

public class Frm_descricao extends Telas {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	static //TODO está variavel deve receber um parametro de 0 a 2 do formulario principal.
	int objeto =0;
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
	 * Create the frame.
	 */
	public void setObjeto(int objeto){
		this.objeto=objeto;
	}
	
	public static Descricao_e[] Carregatxt() throws IOException{
        Descricao_e[] descricao = new Descricao_e[3];
        for (int i = 0; i < 3; i++) {
            descricao[i] = new Descricao_e();
        }
        
        Descricao_c metodos = new Descricao_c();
        metodos.le(descricao);
       // metodos.TestaTexto(descricao);
        return descricao;
	}
	
	public Frm_descricao(int obj) {
		setResizable(false);
		
		setObjeto(obj); //informa ao novo frm qual o objeto em questão (0= pilha, 1=fila,2=lista ligada)
		
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
		
		JButton btn_volta = new JButton("<<");
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
		panel.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		panel.setLayout(null);
		panel.setBounds(50, 68, 467, 215);
		contentPane.add(panel);
		
		final JTextPane txt_texto = new JTextPane();
		txt_texto.setText("txt_texto" );
		txt_texto.setBounds(10, 30, 447, 142);
		panel.add(txt_texto);
		
		JButton btn_descricao = new JButton("Descri\u00E7\u00E3o");
		btn_descricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				String texto= "";
				texto=descricao[objeto].getDescricao_int();
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
				default:
					break;
				}
			}
		});
		try {
			btn_descricao.doClick();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel carregar 'Descricao.txt'");
		}
		
				
		btn_descricao.setBounds(10, 11, 89, 23);
		panel.add(btn_descricao);
		
		JButton btn_caract = new JButton("Caracteristicas");
		btn_caract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				String texto= descricao[objeto].getCaract();
				txt_texto.setText(texto);	
			}
		});
		btn_caract.setBounds(98, 11, 110, 23);
		panel.add(btn_caract);
		
		JButton btn_uso = new JButton("Uso");
		btn_uso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				String texto= descricao[objeto].getUso();
				txt_texto.setText(texto);	
			}
		});
		btn_uso.setBounds(208, 11, 89, 23);
		panel.add(btn_uso);
		
		JButton btn_dificuldade = new JButton("Dificuldade");
		btn_dificuldade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				String texto= descricao[objeto].getDificult();
				txt_texto.setText(texto);	
			}
		});
		btn_dificuldade.setBounds(296, 11, 99, 23);
		panel.add(btn_dificuldade);
		
		JLabel lblRetornarAoMenu = new JLabel("Retornar ao Menu principal");
		lblRetornarAoMenu.setBounds(30, 360, 161, 14);
		contentPane.add(lblRetornarAoMenu);
		
		JButton btn_prox = new JButton(">>");
		btn_prox.setBounds(428, 309, 89, 40);
		contentPane.add(btn_prox);
		
		JLabel lblProseguirParaA = new JLabel("Proseguir para a anima\u00E7\u00E3o interativa");
		lblProseguirParaA.setBounds(361, 360, 205, 14);
		contentPane.add(lblProseguirParaA);
		
		JLabel lblNavegueEntreAs = new JLabel("Navegue entre as abas para conhecer mais");
		lblNavegueEntreAs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNavegueEntreAs.setBounds(50, 39, 299, 28);
		contentPane.add(lblNavegueEntreAs);
		
		
		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_descricao.class.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 586, 395);
		contentPane.add(lbl_fundo);
		btn_prox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Pilha tela = new Tela_Pilha();
				tela.setVisible(true);
				dispose();
			}
		});

	}

}
