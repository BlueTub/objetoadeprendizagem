package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import controller.Telas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Frm_animaFila extends Telas {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static private int objeto;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_animaFila frame = new Frm_animaFila(objeto);
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
	 * @param objeto the objeto to set
	 */
	public static void setObjeto(int objeto) {
		Frm_animaFila.objeto = objeto;
	}



	/**
	 * Create the frame.
	 */
	public Frm_animaFila(int obj) {
		setObjeto(obj);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		centralizeFrame();
		Estilo();
		iconeBarra();
		
		JLabel lblFila = new JLabel("Fila");
		lblFila.setBounds(171, 123, 46, 14);
		contentPane.add(lblFila);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frm_descricao teladesc = new Frm_descricao(getObjeto());
				teladesc.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(146, 188, 89, 23);
		contentPane.add(btnNewButton);
	}
}
