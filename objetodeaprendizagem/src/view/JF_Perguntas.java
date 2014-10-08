package view;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class JF_Perguntas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_Perguntas frame = new JF_Perguntas();
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
	public JF_Perguntas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel painel = new JPanel();
		painel.setBounds(10, 11, 571, 286);
		contentPane.add(painel);
		painel.setLayout(null);
		
		JRadioButton rdbtnPergunta1 = new JRadioButton("pergunta 1");
		rdbtnPergunta1.setBounds(6, 81, 559, 23);
		painel.add(rdbtnPergunta1);
		
		JRadioButton rdbtnPergunta2 = new JRadioButton("pergunta 2");
		rdbtnPergunta2.setBounds(6, 127, 559, 23);
		painel.add(rdbtnPergunta2);
		
		JRadioButton rdbtnPergunta3 = new JRadioButton("pergunta 3");
		rdbtnPergunta3.setBounds(6, 172, 559, 23);
		painel.add(rdbtnPergunta3);
		
		JRadioButton rdbtnPergunta4 = new JRadioButton("pergunta 4");
		rdbtnPergunta4.setBounds(6, 212, 559, 23);
		painel.add(rdbtnPergunta4);
		
		JRadioButton rdbtnPergunta5 = new JRadioButton("pergunta 5");
		rdbtnPergunta5.setBounds(6, 256, 559, 23);
		painel.add(rdbtnPergunta5);
		
		ButtonGroup grupo = new ButtonGroup(); 
		grupo.add(rdbtnPergunta1);
		grupo.add(rdbtnPergunta2);
		grupo.add(rdbtnPergunta3);
		grupo.add(rdbtnPergunta4);
		grupo.add(rdbtnPergunta5);
		
		JLabel lblEnunciado = new JLabel("enunciado");
		lblEnunciado.setBounds(6, 25, 555, 49);
		painel.add(lblEnunciado);
		
		JButton btnProximo = new JButton("Pr\u00F3ximo");
		btnProximo.setBounds(440, 315, 89, 23);
		contentPane.add(btnProximo);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(20, 315, 89, 23);
		contentPane.add(btnVoltar);
	}
}
