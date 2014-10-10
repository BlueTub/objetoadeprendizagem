package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Component;

import controller.Telas;
import controller.ThreadCarregamento;

public class JF_Pontuacao extends Telas {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_Pontuacao frame = new JF_Pontuacao();
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
	public JF_Pontuacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		iconeBarra();
		centralizeFrame();
		Estilo();
		
		
		JPanel painel = new JPanel();
		painel.setBounds(0, 0, 584, 373);
		contentPane.add(painel);
		painel.setLayout(null);
		
		JProgressBar barra = new JProgressBar();
		barra.setBounds(10, 85, 564, 63);
		painel.add(barra);
		
		JLabel lblCarregando = new JLabel("carregando");
		lblCarregando.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblCarregando.setBounds(252, 159, 179, 21);
		painel.add(lblCarregando);
		
		JLabel lblPontucao = new JLabel("Pontua\u00E7\u00E3o");
		lblPontucao.setBounds(261, 220, 116, 14);
		painel.add(lblPontucao);
		lblPontucao.setVisible(false);
		
		JLabel lblDica = new JLabel("dica");
		lblDica.setBounds(265, 259, 46, 14);
		painel.add(lblDica);
		lblDica.setVisible(false);
		
		Thread t = new ThreadCarregamento(barra,lblDica,lblDica,lblPontucao);
		t.start();
	}
}
