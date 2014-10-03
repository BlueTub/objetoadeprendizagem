package view;


import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import controller.Metodos;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Tela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lbltext_1 = new JLabel("10");
		lbltext_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lbltext_1.setBounds(58, 169, 45, 31);
		contentPane.add(lbltext_1);
		
		final JLabel lbltext_2 = new JLabel("20");
		lbltext_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lbltext_2.setBounds(120, 184, 45, 31);
		contentPane.add(lbltext_2);
		
		JLabel lblfoto = new JLabel();
		lblfoto.setIcon(new ImageIcon(Tela.class.getResource("cubo.png"))); //colocar a imagem no Jlabel
		lblfoto.setBounds(164, 136, 128, 148);
		contentPane.add(lblfoto);
		
		JLabel lblfoto_2 = new JLabel();
		lblfoto_2.setIcon(new ImageIcon(Tela.class.getResource("cubo.png"))); //colocar a imagem no Jlabel
		lblfoto_2.setBounds(103, 136, 128, 107);
		contentPane.add(lblfoto_2);
		
		JLabel lblfoto_3 = new JLabel();
		lblfoto_3.setIcon(new ImageIcon(Tela.class.getResource("cubo.png"))); //colocar a imagem no Jlabel
		lblfoto_3.setBounds(42, 115, 151, 107);
		contentPane.add(lblfoto_3);
		
		
		
		final JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(430, 337, 89, 23);
		contentPane.add(btnIniciar);
		
		
		ActionListener iniciar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//btnIniciar.setText("Remover");
				Thread t1 = new Metodos(lbltext_1, lbltext_2);
				t1.start();
				
			}
		};
		
		btnIniciar.addActionListener(iniciar);
		
	}
}
