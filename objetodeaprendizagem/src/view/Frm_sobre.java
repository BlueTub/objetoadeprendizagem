package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JButton;

import controller.Telas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Mostra o sobre da aplicação
 * @author Hury
 *
 */
@SuppressWarnings("serial")
public class Frm_sobre extends Telas {

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
		setTitle("Sobre");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		centralizeFrame();
		Estilo();
		iconeBarra();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Frm_sobre.class.getResource("/Imagens/fatec_logo.png")));
		lblNewLabel.setBounds(128, 0, 158, 67);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnProjetoDesenvolvidoNa = new JTextPane();
		txtpnProjetoDesenvolvidoNa.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		txtpnProjetoDesenvolvidoNa.setEditable(false);
		txtpnProjetoDesenvolvidoNa.setText("Projeto desenvolvido na institui\u00E7\u00E3o FATEC da zona leste, no 3\u00BA semestre do curso de análise e desenvolvimento de sistemas sob orienta\u00E7\u00E3o dos prof(a) ms. Andreia, Cristina e Wellingtton");
		txtpnProjetoDesenvolvidoNa.setBounds(61, 61, 316, 106);
		txtpnProjetoDesenvolvidoNa.setFont(new Font("Tahoma",Font.PLAIN,tamanhofonte));
		contentPane.add(txtpnProjetoDesenvolvidoNa);
		
		JTextPane txtpnDesenvolvedoresDoProjeto = new JTextPane();
		txtpnDesenvolvedoresDoProjeto.setEditable(false);
		txtpnDesenvolvedoresDoProjeto.setFont(new Font("Tahoma", Font.PLAIN, tamanhofonte));
		txtpnDesenvolvedoresDoProjeto.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		txtpnDesenvolvedoresDoProjeto.setText("                 Desenvolvedores: \r\n                 Hury Gabriel A.B de Jesus\r\n                 Pedro Zuzi \r\n                 Pedro Afonso\r\n                 Jo\u00E3o Victor Alves de Jesus\r\n                 Leonardo Benedicto\r\n\r\n                 S\u00E3o Paulo/2014");
		txtpnDesenvolvedoresDoProjeto.setBounds(61, 182, 316, 166);
		contentPane.add(txtpnDesenvolvedoresDoProjeto);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setSelectedIcon(new ImageIcon(Frm_sobre.class.getResource("/Imagens/arrow-back-select.png")));
		btnNewButton.setIcon(new ImageIcon(Frm_sobre.class.getResource("/Imagens/arrow-back.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(178, 351, 89, 57);
		contentPane.add(btnNewButton);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setFont(new Font("Tahoma",Font.PLAIN,tamanhofonte));
		lblVoltar.setBounds(202, 415, 46, 14);
		contentPane.add(lblVoltar);
		
		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_sobre.class.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 444, 435);
		contentPane.add(lbl_fundo);
	}
}
