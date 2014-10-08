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

public class frm_principal {

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
		frame.setBounds(100, 100, 827, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_inicia = new JButton("New button");
		btn_inicia.setBounds(356, 23, 89, 40);
		frame.getContentPane().add(btn_inicia);
		
		Panel panel = new Panel();
		panel.setBounds(30, 111, 180, 149);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn_fila = new JButton("Fila");
		btn_fila.setBounds(29, 11, 120, 35);
		panel.add(btn_fila);
		
		JButton btn_lista = new JButton("Lista");
		btn_lista.setBounds(29, 57, 120, 35);
		panel.add(btn_lista);
		
		JButton btn_pilha = new JButton("Pilha");
		btn_pilha.setBounds(29, 103, 120, 35);
		panel.add(btn_pilha);
		
		JLabel lblNewLabel = new JLabel("lbl_titulo");
		lblNewLabel.setBounds(294, 111, 277, 14);
		frame.getContentPane().add(lblNewLabel);
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
