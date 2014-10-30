package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Telas;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

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
	 * Create the frame.
	 */
	public Frm_animaArvore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_cubo1 = new JLabel("");
		lbl_cubo1.setIcon(new ImageIcon(Frm_animaArvore.class.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo1.setBounds(266, 25, 60, 60);
		contentPane.add(lbl_cubo1);
		
		JLabel lbl_cubo2 = new JLabel("");
		lbl_cubo2.setIcon(new ImageIcon(Frm_animaArvore.class.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo2.setBounds(123, 109, 60, 60);
		contentPane.add(lbl_cubo2);
		
		JLabel lbl_cubo3 = new JLabel("");
		lbl_cubo3.setIcon(new ImageIcon(Frm_animaArvore.class.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo3.setBounds(415, 109, 60, 60);
		contentPane.add(lbl_cubo3);
		
		JLabel lbl_cubo4 = new JLabel("");
		lbl_cubo4.setIcon(new ImageIcon(Frm_animaArvore.class.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo4.setBounds(53, 212, 60, 60);
		contentPane.add(lbl_cubo4);
		
		JLabel lbl_cubo5 = new JLabel("");
		lbl_cubo5.setIcon(new ImageIcon(Frm_animaArvore.class.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo5.setBounds(186, 212, 60, 60);
		contentPane.add(lbl_cubo5);
		
		JLabel lbl_cubo6 = new JLabel("");
		lbl_cubo6.setIcon(new ImageIcon(Frm_animaArvore.class.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo6.setBounds(352, 212, 60, 60);
		contentPane.add(lbl_cubo6);
		
		JLabel lbl_cubo7 = new JLabel("");
		lbl_cubo7.setIcon(new ImageIcon(Frm_animaArvore.class.getResource("/Imagens/Cubo Vermelho.png")));
		lbl_cubo7.setBounds(479, 212, 60, 60);
		contentPane.add(lbl_cubo7);
		
		JButton btn_adiciona = new JButton("Adiciona");
		btn_adiciona.setBounds(323, 301, 89, 23);
		contentPane.add(btn_adiciona);
		
		JButton btn_remove = new JButton("Remove");
		btn_remove.setBounds(462, 301, 89, 23);
		contentPane.add(btn_remove);
		
		JLabel lbl_rand = new JLabel("lbl_rand");
		lbl_rand.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_rand.setBounds(203, 301, 60, 20);
		contentPane.add(lbl_rand);
		
		JLabel lblElementoASer = new JLabel("Elemento a ser adicionado");
		lblElementoASer.setBounds(168, 328, 139, 14);
		contentPane.add(lblElementoASer);
		
		JLabel lblNewLabel = new JLabel("Arvore Binaria");
		lblNewLabel.setBounds(31, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_animaArvore.class.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 576, 353);
		contentPane.add(lbl_fundo);
	}
}
