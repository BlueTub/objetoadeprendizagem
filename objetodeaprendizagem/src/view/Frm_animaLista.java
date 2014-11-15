package view;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import controller.AnimaLista;
import controller.Telas;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import javax.swing.Box;

/**
 * Formulario da animação da Lista
 * 
 * @author Zuzi e Hury
 * 
 */
@SuppressWarnings("serial")
public class Frm_animaLista extends Telas {

	private JPanel contentPane;
	private JLabel lbl_fundo;
	/**
	 * Launch the application.
	 */

	private static int objeto = 0;
	private JLabel lbl_valor1;
	private JLabel lbl_cubo3;
	private JLabel lbl_cubo4;
	private JLabel lbl_cubo5;
	private JLabel lbl_cubo6;
	private JButton btn_addfinal;
	private JButton btn_add;
	private JButton btn_removeinicio;
	private JButton btn_removefinal;
	private JButton btn_remove;
	private JLabel lblFuncionamentoDeUma;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel lbl_valor2;
	private JLabel lbl_valor3;
	private JLabel lbl_valor4;
	private JLabel lbl_valor5;
	private JLabel lbl_valor6;
	private JButton button;
	private JButton button_1;
	private JTextField txt_num;
	private int selecionado = 0;
	private int[] Lista = { 0, 0, 0, 0, 0, 0 };
	private int tamanho;

	/**
	 * Launch
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_animaLista frame = new Frm_animaLista(objeto);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @return the objeto
	 */
	public static int getObjeto() {
		return objeto;
	}

	/**
	 * @param objeto
	 *            the objeto to set
	 */
	public static void setObjeto(int objeto) {
		Frm_animaLista.objeto = objeto;
	}

	/**
	 * 
	 * @param texto
	 * @return
	 */
	public static int TipoString(String texto) {
		if (texto.matches("[a-zA-Z]*")) {
			return 0;// Apenas texto
		}
		if (texto.matches("[0-9]*")) {
			return 1;// Apenas números
		}
		return 2;// Misto
	}// TipoString

	/**
	 * Create the frame.
	 */
	public Frm_animaLista(int obj) {
		setTitle("Anima\u00E7\u00E3o - Lista");
		setObjeto(obj);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		centralizeFrame();
		Estilo();
		iconeBarra();

		button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_descricao telades = new Frm_descricao(2);
				telades.setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.setBounds(459, 302, 123, 47);
		contentPane.add(button);

		button_1 = new JButton("Question\u00E1rio");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_1.setBounds(588, 302, 123, 47);
		contentPane.add(button_1);

		lbl_valor1 = new JLabel("1");
		lbl_valor1.setForeground(Color.BLACK);
		lbl_valor1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor1.setBounds(31, 172, 29, 31);
		contentPane.add(lbl_valor1);

		lbl_valor2 = new JLabel("2");
		lbl_valor2.setForeground(Color.BLACK);
		lbl_valor2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor2.setBounds(110, 172, 29, 31);
		contentPane.add(lbl_valor2);

		lbl_valor3 = new JLabel("3");
		lbl_valor3.setForeground(Color.BLACK);
		lbl_valor3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor3.setBounds(175, 172, 29, 31);
		contentPane.add(lbl_valor3);

		lbl_valor4 = new JLabel("4");
		lbl_valor4.setForeground(Color.BLACK);
		lbl_valor4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor4.setBounds(247, 172, 29, 31);
		contentPane.add(lbl_valor4);

		lbl_valor5 = new JLabel("5");
		lbl_valor5.setForeground(Color.BLACK);
		lbl_valor5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor5.setBounds(313, 172, 29, 31);
		contentPane.add(lbl_valor5);

		lbl_valor6 = new JLabel("6");
		lbl_valor6.setForeground(Color.BLACK);
		lbl_valor6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor6.setBounds(370, 172, 29, 31);
		contentPane.add(lbl_valor6);

		label_6 = new JLabel("5");
		label_6.setBounds(382, 53, 11, 14);
		contentPane.add(label_6);

		label_1 = new JLabel("0");
		label_1.setBounds(39, 53, 11, 14);
		contentPane.add(label_1);

		label_4 = new JLabel("3");
		label_4.setBounds(247, 53, 11, 14);
		contentPane.add(label_4);

		label_5 = new JLabel("4");
		label_5.setBounds(313, 53, 11, 14);
		contentPane.add(label_5);

		label_3 = new JLabel("2");
		label_3.setBounds(175, 53, 11, 14);
		contentPane.add(label_3);

		label_2 = new JLabel("1");
		label_2.setBounds(110, 53, 11, 14);
		contentPane.add(label_2);

		lblFuncionamentoDeUma = new JLabel("Funcionamento de uma Lista");
		lblFuncionamentoDeUma.setForeground(Color.BLACK);
		lblFuncionamentoDeUma.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFuncionamentoDeUma.setBounds(57, 11, 254, 14);
		contentPane.add(lblFuncionamentoDeUma);

		btn_remove = new JButton("Remover");

		btn_remove
				.setToolTipText("Remove um elemento de uma posi\u00E7\u00E3o espec\u00EDfica");
		btn_remove.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_remove.setBounds(588, 139, 123, 47);
		contentPane.add(btn_remove);

		btn_removefinal = new JButton("Remove Final");

		btn_removefinal.setToolTipText("Remove um elemento do final");
		btn_removefinal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_removefinal.setBounds(588, 87, 123, 47);
		contentPane.add(btn_removefinal);

		btn_removeinicio = new JButton("Remove In\u00EDcio");

		btn_removeinicio.setToolTipText("Remove um elemento do in\u00EDcio");
		btn_removeinicio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_removeinicio.setBounds(588, 36, 123, 47);
		contentPane.add(btn_removeinicio);

		btn_add = new JButton("Adicionar");

		btn_add.setToolTipText("Adiciona um novo elemento em uma posi\u00E7\u00E3o espec\u00EDfica");
		btn_add.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_add.setBounds(459, 139, 123, 47);
		contentPane.add(btn_add);

		btn_addfinal = new JButton("Adiciona Final");

		btn_addfinal.setToolTipText("Adiciona um novo elemento no final");
		btn_addfinal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_addfinal.setBounds(459, 87, 123, 47);
		contentPane.add(btn_addfinal);

		JButton btn_addinicio = new JButton("Adiciona In\u00EDcio");

		btn_addinicio
				.setToolTipText("Adiciona um novo elemento no In\u00EDcio");
		btn_addinicio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_addinicio.setBounds(459, 36, 123, 47);
		contentPane.add(btn_addinicio);

		final JLabel lbl_cubo1 = new JLabel("");
		lbl_cubo1.setIcon(new ImageIcon(Frm_animaFila.class
				.getResource("/Imagens/cubo2.png")));
		lbl_cubo1.setBounds(10, 66, 65, 68);
		contentPane.add(lbl_cubo1);

		final JLabel lbl_cubo2 = new JLabel("");
		lbl_cubo2.setIcon(new ImageIcon(Frm_animaFila.class
				.getResource("/Imagens/cubo2.png")));
		lbl_cubo2.setBounds(80, 66, 65, 68);
		contentPane.add(lbl_cubo2);

		lbl_cubo3 = new JLabel("");
		lbl_cubo3.setIcon(new ImageIcon(Frm_animaFila.class
				.getResource("/Imagens/cubo2.png")));
		lbl_cubo3.setBounds(150, 66, 65, 68);
		contentPane.add(lbl_cubo3);

		lbl_cubo4 = new JLabel("");
		lbl_cubo4.setIcon(new ImageIcon(Frm_animaFila.class
				.getResource("/Imagens/cubo2.png")));
		lbl_cubo4.setBounds(220, 66, 65, 68);
		contentPane.add(lbl_cubo4);

		lbl_cubo5 = new JLabel("");
		lbl_cubo5.setIcon(new ImageIcon(Frm_animaFila.class
				.getResource("/Imagens/cubo2.png")));
		lbl_cubo5.setBounds(290, 66, 65, 68);
		contentPane.add(lbl_cubo5);

		lbl_cubo6 = new JLabel("");
		lbl_cubo6.setIcon(new ImageIcon(Frm_animaFila.class
				.getResource("/Imagens/cubo2.png")));
		lbl_cubo6.setBounds(360, 66, 65, 68);
		contentPane.add(lbl_cubo6);

		lbl_cubo1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2_select.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				selecionado = 1;
			}
		});

		lbl_cubo2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2_select.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				selecionado = 2;
			}
		});

		lbl_cubo3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2_select.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				selecionado = 3;
			}
		});

		lbl_cubo4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2_select.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				selecionado = 4;
			}
		});

		lbl_cubo5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2_select.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				selecionado = 5;
			}
		});

		lbl_cubo6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2.png")));
				lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
						.getResource("/Imagens/Cubo2_select.png")));
				selecionado = 6;
			}
		});

		txt_num = new JTextField();
		txt_num.setBounds(184, 234, 111, 25);
		contentPane.add(txt_num);
		txt_num.setColumns(10);

		JLabel lblDigiteOValor = new JLabel("Digite o valor");
		lblDigiteOValor.setFont(new Font("Verdana", Font.BOLD, 14));
		lblDigiteOValor.setBounds(175, 264, 130, 25);
		contentPane.add(lblDigiteOValor);

		final JLabel lbl_cheia = new JLabel("Lista Cheia");
		lbl_cheia.setFont(new Font("Verdana", Font.PLAIN, 14));
		lbl_cheia.setBounds(185, 320, 91, 25);
		contentPane.add(lbl_cheia);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(10, 138, 415, 7);
		contentPane.add(horizontalStrut);
		
		JLabel lblNewLabel = new JLabel("Add em uma posi\u00E7\u00E3o");
		lblNewLabel.setBounds(471, 189, 111, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Del em uma posi\u00E7\u00E3o");
		lblNewLabel_1.setBounds(598, 189, 102, 14);
		contentPane.add(lblNewLabel_1);
		
				lbl_fundo = new JLabel("");
				lbl_fundo.setIcon(new ImageIcon(Frm_animaPilha.class
						.getResource("/Imagens/BackGround.png")));
				lbl_fundo.setBounds(0, 0, 727, 376);
				contentPane.add(lbl_fundo);

		lbl_valor1.setVisible(false);
		lbl_valor2.setVisible(false);
		lbl_valor3.setVisible(false);
		lbl_valor4.setVisible(false);
		lbl_valor5.setVisible(false);
		lbl_valor6.setVisible(false);
		lbl_cheia.setVisible(false);

		btn_addinicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (tamanho >= 6) {
					JOptionPane.showMessageDialog(null, "Cheia");
				} else if (TipoString(txt_num.getText()) != 1) {
					JOptionPane.showMessageDialog(null, "Digite Números");
				} else {
					System.out.println("entrou no if");
					int operacao = 1;
					Thread t1 = new AnimaLista(operacao, lbl_cubo1, lbl_cubo2,
							lbl_cubo3, lbl_cubo4, lbl_cubo5, lbl_cubo6,
							lbl_valor1, lbl_valor2, lbl_valor3, lbl_valor4,
							lbl_valor5, lbl_valor6, lbl_cheia, txt_num,
							selecionado, Lista, tamanho);
					t1.start();
					tamanho++;
				}
			}
		});

		btn_addfinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tamanho >= 6) {
					JOptionPane.showMessageDialog(null, "Cheia");
				} else if (TipoString(txt_num.getText()) != 1) {
					JOptionPane.showMessageDialog(null, "Digite Números");
				} else {
					System.out.println("entrou no if");
					int operacao = 2;
					Thread t1 = new AnimaLista(operacao, lbl_cubo1, lbl_cubo2,
							lbl_cubo3, lbl_cubo4, lbl_cubo5, lbl_cubo6,
							lbl_valor1, lbl_valor2, lbl_valor3, lbl_valor4,
							lbl_valor5, lbl_valor6, lbl_cheia, txt_num,
							selecionado, Lista, tamanho);
					t1.start();
					tamanho++;
				}
			}
		});

		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tamanho >= 6) {
					JOptionPane.showMessageDialog(null, "Cheia");
				} else if (TipoString(txt_num.getText()) != 1) {
					JOptionPane.showMessageDialog(null, "Digite Números");

				} else if (selecionado == 0) {
					JOptionPane.showMessageDialog(null, "Selecione um cubo");
				} else {
					System.out.println("entrou no if");
					int operacao = 3;
					Thread t1 = new AnimaLista(operacao, lbl_cubo1, lbl_cubo2,
							lbl_cubo3, lbl_cubo4, lbl_cubo5, lbl_cubo6,
							lbl_valor1, lbl_valor2, lbl_valor3, lbl_valor4,
							lbl_valor5, lbl_valor6, lbl_cheia, txt_num,
							selecionado, Lista, tamanho);
					t1.start();
					tamanho++;
				}
			}
		});

		btn_removeinicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tamanho == 0) {
					JOptionPane.showMessageDialog(null, "Vazia");
				} else if (TipoString(txt_num.getText()) != 1) {
					JOptionPane.showMessageDialog(null, "Digite Números");
				} else {
					System.out.println("entrou no if");
					int operacao = 4;
					Thread t1 = new AnimaLista(operacao, lbl_cubo1, lbl_cubo2,
							lbl_cubo3, lbl_cubo4, lbl_cubo5, lbl_cubo6,
							lbl_valor1, lbl_valor2, lbl_valor3, lbl_valor4,
							lbl_valor5, lbl_valor6, lbl_cheia, txt_num,
							selecionado, Lista, tamanho);
					t1.start();
					tamanho--;
				}
			}
		});

		btn_removefinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tamanho == 0) {
					JOptionPane.showMessageDialog(null, "Vazia");
				} else if (TipoString(txt_num.getText()) != 1) {
					JOptionPane.showMessageDialog(null, "Digite Números");
				} else {
					System.out.println("entrou no if");
					int operacao = 5;
					Thread t1 = new AnimaLista(operacao, lbl_cubo1, lbl_cubo2,
							lbl_cubo3, lbl_cubo4, lbl_cubo5, lbl_cubo6,
							lbl_valor1, lbl_valor2, lbl_valor3, lbl_valor4,
							lbl_valor5, lbl_valor6, lbl_cheia, txt_num,
							selecionado, Lista, tamanho);
					t1.start();
					tamanho--;
				}
			}
		});

		btn_remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tamanho == 0) {
					JOptionPane.showMessageDialog(null, "Vazia");
				} else if (TipoString(txt_num.getText()) != 1) {
					JOptionPane.showMessageDialog(null, "Digite Números");
				} else if (selecionado == 0) {
					JOptionPane.showMessageDialog(null, "Selecione um cubo");
				} else {
					System.out.println("entrou no if");
					int operacao = 6;
					Thread t1 = new AnimaLista(operacao, lbl_cubo1, lbl_cubo2,
							lbl_cubo3, lbl_cubo4, lbl_cubo5, lbl_cubo6,
							lbl_valor1, lbl_valor2, lbl_valor3, lbl_valor4,
							lbl_valor5, lbl_valor6, lbl_cheia, txt_num,
							selecionado, Lista, tamanho);
					t1.start();
					tamanho--;
				}
			}
		});

	}
}
