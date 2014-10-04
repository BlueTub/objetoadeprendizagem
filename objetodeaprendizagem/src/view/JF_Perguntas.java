package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

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
		setBounds(100, 100, 607, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel painel = new JPanel();
		painel.setBorder(new TitledBorder(null, "enunciado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painel.setBounds(10, 11, 571, 251);
		contentPane.add(painel);
		painel.setLayout(null);
		
		JRadioButton rdbtnPergunta1 = new JRadioButton("pergunta 1");
		rdbtnPergunta1.setBounds(6, 31, 559, 23);
		painel.add(rdbtnPergunta1);
		
		JRadioButton rdbtnPergunta2 = new JRadioButton("pergunta 2");
		rdbtnPergunta2.setBounds(6, 77, 559, 23);
		painel.add(rdbtnPergunta2);
		
		JRadioButton rdbtnPergunta3 = new JRadioButton("pergunta 3");
		rdbtnPergunta3.setBounds(6, 122, 559, 23);
		painel.add(rdbtnPergunta3);
		
		JRadioButton rdbtnPergunta4 = new JRadioButton("pergunta 4");
		rdbtnPergunta4.setBounds(6, 168, 559, 23);
		painel.add(rdbtnPergunta4);
		
		JRadioButton rdbtnPergunta5 = new JRadioButton("pergunta 5");
		rdbtnPergunta5.setBounds(6, 206, 559, 23);
		painel.add(rdbtnPergunta5);
		
		ButtonGroup grupo = new ButtonGroup(); 
		grupo.add(rdbtnPergunta1);
		grupo.add(rdbtnPergunta2);
		grupo.add(rdbtnPergunta3);
		grupo.add(rdbtnPergunta4);
		grupo.add(rdbtnPergunta5);
	}
	
}
