package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import controller.Descricao_c;

import Entity.Descricao_e;

public class fmz_descricao extends JFrame {
	/**
	 * @author Hury
	 */
	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	
	
	//TODO está variavel deve receber um parametro de 0 a 2 do formulario principal.
	int objeto =0;
	public static void main(String[] args) throws IOException {
		
		Carregatxt();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fmz_descricao frame = new fmz_descricao();
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
	
	public static Descricao_e[] Carregatxt() throws IOException{
        Descricao_e[] descricao = new Descricao_e[3];
        for (int i = 0; i < 3; i++) {
            descricao[i] = new Descricao_e();
        }
        
        Descricao_c metodos = new Descricao_c();
        metodos.le(descricao);
        metodos.TestaTexto(descricao);
        return descricao;
	}
	
	public fmz_descricao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(39, 63, 467, 215);
		contentPane.add(panel);
		panel.setLayout(null);
		
		final JTextPane txt_texto = new JTextPane();
		txt_texto.setText("Texto aki :)");
		txt_texto.setBounds(10, 30, 447, 142);
		panel.add(txt_texto);
		
		JButton btn_proximo = new JButton("Proximo");
		btn_proximo.setBounds(368, 181, 89, 23);
		panel.add(btn_proximo);
		
		JButton btn_descricao = new JButton("Descri\u00E7\u00E3o");
		btn_descricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				String texto= descricao[objeto].descricao_int;
				txt_texto.setText(texto);							
				
			}
		});
		btn_descricao.setBounds(10, 11, 89, 23);
		panel.add(btn_descricao);
		
		JButton btn_caract = new JButton("Caracteristicas");
		btn_caract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				String texto= descricao[objeto].caract;
				txt_texto.setText(texto);							
				
			
			}
		});
		btn_caract.setBounds(98, 11, 110, 23);
		panel.add(btn_caract);
		
		JButton btn_uso = new JButton("Uso");
		btn_uso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				String texto= descricao[objeto].uso;
				txt_texto.setText(texto);											
			
			}
		});
		btn_uso.setBounds(208, 11, 89, 23);
		panel.add(btn_uso);
		
		JButton btnDificuldade = new JButton("Dificuldade");
		btnDificuldade.setBounds(296, 11, 89, 23);
		panel.add(btnDificuldade);
		
		JButton btnvoltar = new JButton("Voltar");
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnvoltar.setBounds(24, 11, 89, 23);
		contentPane.add(btnvoltar);
	}
}
