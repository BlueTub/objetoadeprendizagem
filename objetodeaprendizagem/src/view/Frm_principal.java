package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

import Entity.Descricao_e;
import controller.Descricao_c;

import java.awt.SystemColor;
import java.io.IOException;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.EmptyBorder;

import Entity.Descricao_e;

public class Frm_principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
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
	 * Create the frame.
	 */
	public Frm_principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		initialize();
	}
	
	public static Descricao_e[] Carregatxt() throws IOException{
        Descricao_e[] descricao = new Descricao_e[3];
        for (int i = 0; i < 3; i++) {
            descricao[i] = new Descricao_e();
        }
        
        Descricao_c metodos = new Descricao_c();
        metodos.le(descricao);
        metodos.TestaTexto(descricao);
        return descricao;
	}
	
	
	private void initialize() {

		
		JButton btn_iniciar = new JButton("Iniciar");
		btn_iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_iniciar.setBounds(488, 359, 89, 40);
		//frame.getContentPane().add(btn_iniciar);
		
		Panel panel = new Panel();
		panel.setBounds(30, 111, 180, 251);
		//frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		final JLabel lbl_titulo = new JLabel("lbl_titulo");
		lbl_titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_titulo.setBounds(263, 68, 277, 14);
	//	frame.getContentPane().add(lbl_titulo);
		
		final JTextPane txt_descricao = new JTextPane();
		txt_descricao.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		txt_descricao.setEditable(false);
		txt_descricao.setText("descri\u00E7\u00E3o aqui");
		txt_descricao.setBounds(263, 111, 314, 77);
	//	frame.getContentPane().add(txt_descricao);
		JButton btn_fila = new JButton("Fila");
		btn_fila.setBounds(29, 99, 120, 56);
		panel.add(btn_fila);
		
		JButton btn_lista = new JButton("Lista");
		btn_lista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				String texto= descricao[2].descricao_res;
				txt_descricao.setText(texto);
				lbl_titulo.setText("Lista Ligada");
			}
		});
		btn_lista.setBounds(29, 184, 120, 56);
		panel.add(btn_lista);
		
		JButton btn_pilha = new JButton("Pilha");
		btn_pilha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_pilha.setBounds(29, 11, 120, 56);
		panel.add(btn_pilha);
		btn_pilha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				String texto= descricao[0].descricao_res;
				txt_descricao.setText(texto);
				lbl_titulo.setText("Pilha");
			}
		});
		

		
		JLabel lblSelecioneUmObjeto = new JLabel("Selecione um objeto para iniciar a anima\u00E7\u00E3o e logo ap\u00F3s o questionario.");
		lblSelecioneUmObjeto.setFont(new Font("Arial", Font.BOLD, 14));
		lblSelecioneUmObjeto.setBounds(57, 38, 504, 14);
	//	frame.getContentPane().add(lblSelecioneUmObjeto);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(frm_principal1.class.getResource("/Imagens/rsz_gear-vector-icon-button_small.jpg")));
		btnNewButton.setBounds(574, 0, 38, 40);
	//	frame.getContentPane().add(btnNewButton);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(250, 93, 333, 7);
	//	frame.getContentPane().add(horizontalStrut);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(250, 348, 333, 14);
	//	frame.getContentPane().add(horizontalStrut_1);
		btn_fila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				String texto= descricao[1].descricao_res;
				txt_descricao.setText(texto);
				lbl_titulo.setText("Fila");
			}
		});
		
;
	}
	
}
