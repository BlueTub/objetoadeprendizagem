package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AnimaArvore;
import controller.Telas;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Formulario de anima��o da arvore
 * 
 * @author Hury
 * 
 */
@SuppressWarnings("serial")
public class Frm_animaArvore extends Telas {

	int[] arvore = { 0, 0, 0, 0, 0, 0, 0 };
	int selecionado = 0;
	boolean primeiro = true;
	private JPanel contentPane;
	private JTextField txt_num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_animaArvore frame = new Frm_animaArvore();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 
	 * @param texto
	 *            o texto a ser an�lisado
	 * @return resultado da an�lise
	 */
	public static int TipoString(String texto) {
		if (texto.matches("[a-zA-Z]*")) {
			return 0;// Apenas texto
		}
		if (texto.matches("[0-9]*")) {
			return 1;// Apenas n�meros
		}
		return 2;// Misto
	}// TipoString

	/**
	 * Create the frame.
	 */
	public Frm_animaArvore() {
		setTitle("Anima\u00E7\u00E3o - Arvore Bin\u00E1ria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		centralizeFrame();
		Estilo();
		iconeBarra();

		JLabel lblElementoASer = new JLabel("Valor a ser adicionado*.");
		lblElementoASer.setFont(new Font("Verdana", Font.BOLD, 14));
		lblElementoASer.setBounds(10, 363, 237, 23);
		contentPane.add(lblElementoASer);

		JLabel lbl_titulo = new JLabel("Arvore Bin\u00E1ria");
		lbl_titulo.setFont(new Font("Verdana", Font.BOLD, 16));
		lbl_titulo.setBounds(31, 11, 162, 23);
		contentPane.add(lbl_titulo);

		final JLabel lbl_valor1 = new JLabel("New label");
		lbl_valor1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor1.setBounds(584, 17, 46, 14);
		contentPane.add(lbl_valor1);

		final JLabel lbl_valor2 = new JLabel("New label");
		lbl_valor2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor2.setBounds(584, 20, 46, 14);
		contentPane.add(lbl_valor2);

		final JLabel lbl_valor3 = new JLabel("New label");
		lbl_valor3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor3.setBounds(584, 20, 46, 14);
		contentPane.add(lbl_valor3);

		final JLabel lbl_valor4 = new JLabel("New label");
		lbl_valor4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor4.setBounds(584, 20, 46, 14);
		contentPane.add(lbl_valor4);

		final JLabel lbl_valor5 = new JLabel("New label");
		lbl_valor5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor5.setBounds(584, 17, 46, 14);
		contentPane.add(lbl_valor5);

		final JLabel lbl_valor6 = new JLabel("New label");
		lbl_valor6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor6.setBounds(584, 20, 46, 14);
		contentPane.add(lbl_valor6);

		final JLabel lbl_valor7 = new JLabel("New label");
		lbl_valor7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor7.setBounds(584, 20, 46, 14);
		contentPane.add(lbl_valor7);

		final JLabel lbl_cubo1 = new JLabel("");

		lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo1.setBounds(346, 11, 60, 60);
		contentPane.add(lbl_cubo1);

		final JLabel lbl_cubo2 = new JLabel("");

		lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo2.setBounds(203, 102, 60, 60);
		contentPane.add(lbl_cubo2);

		final JLabel lbl_cubo3 = new JLabel("");

		lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo3.setBounds(473, 102, 60, 60);
		contentPane.add(lbl_cubo3);

		final JLabel lbl_cubo4 = new JLabel("");

		lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo4.setBounds(115, 193, 60, 60);
		contentPane.add(lbl_cubo4);

		final JLabel lbl_cubo5 = new JLabel("");

		lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo5.setBounds(273, 193, 60, 60);
		contentPane.add(lbl_cubo5);

		final JLabel lbl_cubo6 = new JLabel("");

		lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo6.setBounds(400, 193, 60, 60);
		contentPane.add(lbl_cubo6);

		final JLabel lbl_cubo7 = new JLabel("");

		lbl_cubo7.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo7.setBounds(556, 193, 60, 60);
		contentPane.add(lbl_cubo7);

		txt_num = new JTextField();
		txt_num.setFont(new Font("Tahoma", Font.BOLD, 14));

		txt_num.setBounds(203, 356, 71, 37);
		contentPane.add(txt_num);
		txt_num.setColumns(10);

		txt_num.setFocusable(true);

		final JButton btn_adiciona = new JButton("Adicionar");
		btn_adiciona.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_adiciona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (TipoString(txt_num.getText()) != 1) {
					JOptionPane.showMessageDialog(null, "Digite N�meros");
				} else {
					int operacao = 1;
					Thread t1 = new AnimaArvore(operacao, lbl_cubo1, lbl_cubo2,
							lbl_cubo3, lbl_cubo4, lbl_cubo5, lbl_cubo6,
							lbl_cubo7, lbl_valor1, lbl_valor2, lbl_valor3,
							lbl_valor4, lbl_valor5, lbl_valor6, lbl_valor7,
							txt_num, arvore, primeiro, selecionado);
					t1.start();
					primeiro = false;

				}
			}
		});
		
		/**
		 * Listener enter
		 */
		
		txt_num.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
			
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER){
					btn_adiciona.doClick();
				}
			}
		});

		JButton btn_remove = new JButton("Remover");
		btn_remove.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int operacao = 2;
				Thread t1 = new AnimaArvore(operacao, lbl_cubo1, lbl_cubo2,
						lbl_cubo3, lbl_cubo4, lbl_cubo5, lbl_cubo6, lbl_cubo7,
						lbl_valor1, lbl_valor2, lbl_valor3, lbl_valor4,
						lbl_valor5, lbl_valor6, lbl_valor7, txt_num, arvore,
						primeiro, selecionado);
				t1.start();
			}
		});

		btn_remove.setBounds(66, 306, 109, 37);
		contentPane.add(btn_remove);

		btn_adiciona.setBounds(185, 306, 104, 39);
		contentPane.add(btn_adiciona);

		JLabel lblProfundidade = new JLabel("Profundidade 2");
		lblProfundidade.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblProfundidade.setBounds(66, 40, 85, 14);
		contentPane.add(lblProfundidade);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frm_descricao tela = new Frm_descricao(3);
				tela.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(432, 363, 101, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Question\u00E1rio");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(556, 363, 113, 43);
		contentPane.add(btnNewButton_1);
				
				JLabel label = new JLabel("Dica: Voc\u00EA pode selecionar uma posi\u00E7\u00E3o clicando sobre o cubo.");
				label.setBounds(10, 404, 385, 19);
				contentPane.add(label);
				
						JLabel lbl_fundo = new JLabel("");
						lbl_fundo.setIcon(new ImageIcon(Frm_animaArvore.class
								.getResource("/Imagens/BackGround.png")));
						lbl_fundo.setBounds(0, 0, 687, 439);
						contentPane.add(lbl_fundo);

		lbl_cubo1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/CuboVermelhoSelect.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo7.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				selecionado = 1;

			}
		});

		lbl_cubo2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/CuboVermelhoSelect.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo7.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				selecionado = 2;
			}
		});

		lbl_cubo3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/CuboVermelhoSelect.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo7.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				selecionado = 3;
			}
		});

		lbl_cubo4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/CuboVermelhoSelect.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo7.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				selecionado = 4;
			}
		});

		lbl_cubo5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/CuboVermelhoSelect.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo7.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				selecionado = 5;
			}
		});

		lbl_cubo6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/CuboVermelhoSelect.png")));
				lbl_cubo7.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				selecionado = 6;
			}
		});

		lbl_cubo7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo Vermelho.png")));
				lbl_cubo7.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/CuboVermelhoSelect.png")));
				selecionado = 7;
			}
		});

		lbl_valor1.setVisible(false);
		lbl_valor2.setVisible(false);
		lbl_valor3.setVisible(false);
		lbl_valor4.setVisible(false);
		lbl_valor5.setVisible(false);
		lbl_valor6.setVisible(false);
		lbl_valor7.setVisible(false);
	}
}
