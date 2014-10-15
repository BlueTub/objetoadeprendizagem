package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm_sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_sobre frame = new Frm_sobre();
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
	public Frm_sobre() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Frm_sobre.class.getResource("/Imagens/fatec_logo.png")));
		lblNewLabel.setBounds(128, 11, 158, 67);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnProjetoDesenvolvidoNa = new JTextPane();
		txtpnProjetoDesenvolvidoNa.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		txtpnProjetoDesenvolvidoNa.setEditable(false);
		txtpnProjetoDesenvolvidoNa.setText("Projeto desenvolvido na institui\u00E7\u00E3o FATEC da zona leste, no 3\u00BA semestre do curso de analise e desenvolvimento de sistemas sob orienta\u00E7\u00E3o dos prof(a) ms. Andreia, Cristina e Wellingtton");
		txtpnProjetoDesenvolvidoNa.setBounds(61, 93, 316, 78);
		contentPane.add(txtpnProjetoDesenvolvidoNa);
		
		JTextPane txtpnDesenvolvedoresDoProjeto = new JTextPane();
		txtpnDesenvolvedoresDoProjeto.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		txtpnDesenvolvedoresDoProjeto.setEditable(false);
		txtpnDesenvolvedoresDoProjeto.setText("                     Desenvolvedores do projeto: \r\n\r\n                      Hury Gabriel A.B de Jesus\r\n                      Pedro Zuzi \r\n                      Pedro Afonso\r\n                      Jo\u00E3o Victor\r\n                      Leonardo Benedicto\r\n\r\n                      S\u00E3o Paulo/2014");
		txtpnDesenvolvedoresDoProjeto.setBounds(61, 182, 316, 158);
		contentPane.add(txtpnDesenvolvedoresDoProjeto);
		
		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(178, 351, 89, 30);
		contentPane.add(btnNewButton);
		
		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_sobre.class.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 444, 392);
		contentPane.add(lbl_fundo);
	}
}
