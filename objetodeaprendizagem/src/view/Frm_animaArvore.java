package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AnimaArvore;
import controller.Telas;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Frm_animaArvore extends Telas {

	private JPanel contentPane;

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
	 * Retorna um número aleatorio de 1 a 100
	 * 
	 * @return
	 */

	public int rand() {
		return (int) ((Math.random() * 100) + 1);
	}

	/**
	 * Create the frame.
	 */
	public Frm_animaArvore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn_remove = new JButton("Remove");
		btn_remove.setBounds(462, 330, 89, 23);
		contentPane.add(btn_remove);

		final JLabel lbl_rand = new JLabel("lbl_rand");
		lbl_rand.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_rand.setBounds(203, 330, 60, 20);
		contentPane.add(lbl_rand);

		lbl_rand.setText(Integer.toString(rand()));

		JLabel lblElementoASer = new JLabel("Elemento a ser adicionado");
		lblElementoASer.setBounds(123, 356, 164, 14);
		contentPane.add(lblElementoASer);

		JLabel lbl_titulo = new JLabel("Arvore Binaria");
		lbl_titulo.setFont(new Font("Verdana", Font.BOLD, 14));
		lbl_titulo.setBounds(31, 11, 121, 23);
		contentPane.add(lbl_titulo);

		final JLabel lbl_valor1 = new JLabel("New label");
		lbl_valor1.setBounds(429, 40, 46, 14);
		contentPane.add(lbl_valor1);

		final JLabel lbl_valor2 = new JLabel("New label");
		lbl_valor2.setBounds(429, 59, 46, 14);
		contentPane.add(lbl_valor2);

		final JLabel lbl_valor3 = new JLabel("New label");
		lbl_valor3.setBounds(429, 84, 46, 14);
		contentPane.add(lbl_valor3);

		final JLabel lbl_valor4 = new JLabel("New label");
		lbl_valor4.setBounds(429, 105, 46, 14);
		contentPane.add(lbl_valor4);

		final JLabel lbl_valor5 = new JLabel("New label");
		lbl_valor5.setBounds(493, 40, 46, 14);
		contentPane.add(lbl_valor5);

		final JLabel lbl_valor6 = new JLabel("New label");
		lbl_valor6.setBounds(493, 71, 46, 14);
		contentPane.add(lbl_valor6);

		final JLabel lbl_valor7 = new JLabel("New label");
		lbl_valor7.setBounds(493, 105, 46, 14);
		contentPane.add(lbl_valor7);

		final JLabel lbl_cubo1 = new JLabel("");
		lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo1.setBounds(268, 59, 60, 60);
		contentPane.add(lbl_cubo1);

		final JLabel lbl_cubo2 = new JLabel("");
		lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo2.setBounds(123, 132, 60, 60);
		contentPane.add(lbl_cubo2);

		final JLabel lbl_cubo3 = new JLabel("");
		lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo3.setBounds(415, 132, 60, 60);
		contentPane.add(lbl_cubo3);

		final JLabel lbl_cubo4 = new JLabel("");
		lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo4.setBounds(53, 235, 60, 60);
		contentPane.add(lbl_cubo4);

		final JLabel lbl_cubo5 = new JLabel("");
		lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo5.setBounds(186, 235, 60, 60);
		contentPane.add(lbl_cubo5);

		final JLabel lbl_cubo6 = new JLabel("");
		lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo6.setBounds(352, 235, 60, 60);
		contentPane.add(lbl_cubo6);

		final JLabel lbl_cubo7 = new JLabel("");
		lbl_cubo7.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo7.setBounds(479, 235, 60, 60);
		contentPane.add(lbl_cubo7);

		JButton btn_adiciona = new JButton("Adiciona");
		btn_adiciona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int operacao = 1;
				Thread t1 = new AnimaArvore(operacao, lbl_cubo1, lbl_cubo2,
						lbl_cubo3, lbl_cubo4, lbl_cubo5, lbl_cubo6, lbl_cubo7,
						lbl_valor1, lbl_valor2, lbl_valor3, lbl_valor4,
						lbl_valor5, lbl_valor6, lbl_valor7, lbl_rand);
				t1.start();
			}
		});

		btn_adiciona.setBounds(323, 330, 89, 23);
		contentPane.add(btn_adiciona);

		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_animaArvore.class
				.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 590, 382);
		contentPane.add(lbl_fundo);
	}
}
