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

import controller.Descricao_c;
import controller.Telas;

import Entity.Descricao_e;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Frm_principal extends Telas {

	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 * @throws IOException 
	 */

	int objeto =0;
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
 * Carrega
 * @throws IOException
 */
	
	public static Descricao_e[] Carregatxt() throws IOException{
        Descricao_e[] descricao = new Descricao_e[3];
        for (int i = 0; i < 3; i++) {
            descricao[i] = new Descricao_e();
        }
        
        Descricao_c metodos = new Descricao_c();
        metodos.le(descricao);
     //   metodos.TestaTexto(descricao);
        return descricao;
	}
	
	
	/**
	 * Create the frame.
	 */
	
  
 
	public Frm_principal() {

      inicializa();
       

	}
	
	public void inicializa(){
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 403);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		centralizeFrame();
		Estilo();
		iconeBarra();
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBounds(40, 64, 180, 251);
		contentPane.add(panel);
		
	      
	      
		JLabel label = new JLabel("Selecione um objeto para iniciar a anima\u00E7\u00E3o e logo ap\u00F3s o questionario.");
		label.setFont(new Font("Arial", Font.BOLD, 14));
		label.setBounds(52, 28, 504, 14);
		contentPane.add(label);
		
		final JLabel lbl_titulo = new JLabel("lbl_titulo");
		lbl_titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_titulo.setBounds(276, 66, 277, 14);
		contentPane.add(lbl_titulo);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(Frm_principal.class.getResource("/Imagens/rsz_gear-vector-icon-button_small.jpg")));
		button_3.setBounds(600, 11, 38, 40);
		contentPane.add(button_3);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(276, 91, 333, 7);
		contentPane.add(horizontalStrut);
		
		final JTextPane txt_descricao = new JTextPane();
		txt_descricao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_descricao.setText("descri\u00E7\u00E3o aqui");
		txt_descricao.setEditable(false);
		txt_descricao.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		txt_descricao.setBounds(276, 113, 314, 125);
		contentPane.add(txt_descricao);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(276, 260, 333, 14);
		contentPane.add(horizontalStrut_1);
		
		JButton btn_inicia = new JButton(">>");
		btn_inicia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Frm_descricao tela= new Frm_descricao();
				tela.setVisible(true);
				tela.setObjeto(objeto); //informa ao novo frm qual o objeto em questão (0= pilha, 1=fila,2=lista ligada)
				dispose();
				
				
			}
		});
		btn_inicia.setBounds(511, 299, 89, 40);
		contentPane.add(btn_inicia);
		lbl_titulo.setVisible(false);
		txt_descricao.setVisible(false);
		
		
		JButton btn_pilha = new JButton("Pilha");
		btn_pilha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e) {
					e.printStackTrace();
				}	
				String texto= descricao[0].getDescricao_res();
				txt_descricao.setText(texto);
				lbl_titulo.setText("Pilha");
				lbl_titulo.setVisible(true);
				txt_descricao.setVisible(true);
				objeto=0;
			}
		});

		
		btn_pilha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_pilha.setBounds(29, 32, 120, 56);
		panel.add(btn_pilha);
		
		JButton btn_fila = new JButton("Fila");
		btn_fila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				String texto= descricao[1].getDescricao_res();
				txt_descricao.setText(texto);
				lbl_titulo.setText("Fila");
				lbl_titulo.setVisible(true);
				txt_descricao.setVisible(true);
				objeto=1;
			}
		});
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
				String texto= descricao[2].getDescricao_res();
				txt_descricao.setText(texto);
				lbl_titulo.setText("Lista Ligada");
				lbl_titulo.setVisible(true);
				txt_descricao.setVisible(true);
				objeto=2;
			}
		});
		btn_lista.setBounds(29, 166, 120, 56);
		panel.add(btn_lista);
		
		JLabel lblNewLabel = new JLabel("Selecione");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(60, 7, 67, 14);
		panel.add(lblNewLabel);
		
		JLabel lblMostrarMaisDetalhes = new JLabel("Mostrar Mais detalhes");
		lblMostrarMaisDetalhes.setBounds(504, 339, 105, 14);
		contentPane.add(lblMostrarMaisDetalhes);
		
		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_principal.class.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 648, 364);
		contentPane.add(lbl_fundo);
		
		
		btn_pilha.doClick();
		
	}
}
