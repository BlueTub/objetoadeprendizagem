package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.SystemColor;

public class fmz_sobre1 {
	/**
	 * @author Hury
	 */
	private JFrame frmSobre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fmz_sobre1 window = new fmz_sobre1();
					window.frmSobre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fmz_sobre1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSobre = new JFrame();
		frmSobre.getContentPane().setBackground(SystemColor.control);
		frmSobre.setType(Type.UTILITY);
		frmSobre.setResizable(false);
		frmSobre.setTitle("Sobre");
		frmSobre.setBounds(100, 100, 450, 300);
		frmSobre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSobre.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(fmz_sobre1.class.getResource("/Imagens/fatec_logo.png")));
		lblNewLabel.setBounds(150, 11, 159, 67);
		frmSobre.getContentPane().add(lblNewLabel);
		
		JLabel lblHury = new JLabel("Hury");
		lblHury.setBounds(86, 112, 46, 14);
		frmSobre.getContentPane().add(lblHury);
		
		JLabel lblLigeiro = new JLabel("Ligeiro");
		lblLigeiro.setBounds(188, 112, 46, 14);
		frmSobre.getContentPane().add(lblLigeiro);
		
		JLabel lblSuzi = new JLabel("Suzi");
		lblSuzi.setBounds(274, 112, 46, 14);
		frmSobre.getContentPane().add(lblSuzi);
		
		JLabel lblBurns = new JLabel("Burns");
		lblBurns.setBounds(304, 150, 46, 14);
		frmSobre.getContentPane().add(lblBurns);
		
		JLabel lblCorinthiano = new JLabel("Corinthiano");
		lblCorinthiano.setBounds(107, 150, 96, 14);
		frmSobre.getContentPane().add(lblCorinthiano);
		
		JLabel label = new JLabel("2014");
		label.setBounds(199, 236, 46, 14);
		frmSobre.getContentPane().add(label);
		
		JTextPane txtpnProjetoDesenvolvidoPor = new JTextPane();
		txtpnProjetoDesenvolvidoPor.setText("Projeto desenvolvido por alunos do curso de ads");
		txtpnProjetoDesenvolvidoPor.setBounds(171, 139, 108, 67);
		frmSobre.getContentPane().add(txtpnProjetoDesenvolvidoPor);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(345, 232, 89, 23);
		frmSobre.getContentPane().add(btnVoltar);
	}
}
