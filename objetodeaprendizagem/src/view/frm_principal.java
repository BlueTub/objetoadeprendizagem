package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
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
import java.awt.SystemColor;

public class frm_principal extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_principal window = new frm_principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frm_principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setBounds(100, 100, 609, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_iniciar = new JButton("Iniciar");
		btn_iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_iniciar.setBounds(488, 359, 89, 40);
		frame.getContentPane().add(btn_iniciar);
		
		Panel panel = new Panel();
		panel.setBounds(30, 111, 180, 251);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn_fila = new JButton("Fila");
		btn_fila.setBounds(29, 11, 120, 56);
		panel.add(btn_fila);
		
		JButton btn_lista = new JButton("Lista");
		btn_lista.setBounds(29, 88, 120, 56);
		panel.add(btn_lista);
		
		JButton btn_pilha = new JButton("Pilha");
		btn_pilha.setBounds(29, 166, 120, 56);
		panel.add(btn_pilha);
		
		JLabel lblNewLabel = new JLabel("lbl_titulo");
		lblNewLabel.setBounds(263, 80, 277, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane txt_descricao = new JTextPane();
		txt_descricao.setText("descri\u00E7\u00E3o aqui");
		txt_descricao.setBounds(263, 111, 314, 237);
		frame.getContentPane().add(txt_descricao);
		
		JLabel lblSelecioneUmObjeto = new JLabel("Selecione um objeto para iniciar a anima\u00E7\u00E3o e logo ap\u00F3s o questionario.");
		lblSelecioneUmObjeto.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSelecioneUmObjeto.setBounds(30, 42, 473, 14);
		frame.getContentPane().add(lblSelecioneUmObjeto);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(frm_principal.class.getResource("/Imagens/AbaLnaoselect.png")));
		lblNewLabel_2.setBounds(216, 193, 38, 61);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(frm_principal.class.getResource("/Imagens/AbaLsimselect.png")));
		lblNewLabel_1.setBounds(216, 121, 38, 61);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(frm_principal.class.getResource("/Imagens/AbaLnaoselect.png")));
		lblNewLabel_4.setBounds(216, 277, 38, 61);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(frm_principal.class.getResource("/Imagens/rsz_gear-vector-icon-button_small.jpg")));
		btnNewButton.setBounds(545, 11, 38, 40);
		frame.getContentPane().add(btnNewButton);
		btn_fila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		menuBar.add(mntmNewMenuItem);
	}
}
