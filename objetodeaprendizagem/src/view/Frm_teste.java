package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.WinRegistry;

@SuppressWarnings("serial")
public class Frm_teste extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_teste frame = new Frm_teste();
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
	public Frm_teste() {

		final WinRegistry reg = new WinRegistry();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Vers\u00E3o do windows");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//mostra versão do windows
				reg.versaoWindows();

			}
		});
		btnNewButton.setBounds(10, 42, 147, 32);
		contentPane.add(btnNewButton);

		JLabel lblLRegedit = new JLabel("l\u00EA REGEDIT");
		lblLRegedit.setBounds(28, 25, 95, 14);
		contentPane.add(lblLRegedit);

		JLabel lblInserir = new JLabel("Inserir");
		lblInserir.setBounds(227, 25, 46, 14);
		contentPane.add(lblInserir);

		JButton btnNewButton_1 = new JButton("insert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Create a key and write a string
				reg.geraChave("Portugues","Nimbus","17");

			}
		});
		btnNewButton_1.setBounds(206, 47, 89, 23);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("mostrar");
		lblNewLabel.setBounds(216, 81, 46, 14);
		contentPane.add(lblNewLabel);

		JButton btnNewButton_2 = new JButton("tostring");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// mostra

				reg.mostraChave();
			}
		});
		btnNewButton_2.setBounds(206, 106, 89, 23);
		contentPane.add(btnNewButton_2);

		JLabel lblDeleta = new JLabel("deleta");
		lblDeleta.setBounds(206, 156, 46, 14);
		contentPane.add(lblDeleta);

		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// del
				reg.deletaChave();

			}
		});
		btnDel.setBounds(206, 181, 89, 23);
		contentPane.add(btnDel);
	}
}
