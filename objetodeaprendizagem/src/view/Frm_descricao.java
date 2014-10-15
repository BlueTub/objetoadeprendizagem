package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;

import controller.Descricao_c;

import Entity.Descricao_e;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Frm_descricao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	//TODO está variavel deve receber um parametro de 0 a 2 do formulario principal.
	int objeto =0;
	public static void main(String[] args) throws IOException {
		
		Carregatxt();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_descricao frame = new Frm_descricao();
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
	public Frm_descricao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Voltar");
		button.setBounds(35, 64, 89, 23);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(50, 116, 467, 215);
		contentPane.add(panel);
		
		final JTextPane txt_texto = new JTextPane();
		txt_texto.setText("Texto aki :)");
		txt_texto.setBounds(10, 30, 447, 142);
		panel.add(txt_texto);
		
		JButton button_1 = new JButton("Proximo");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Pilha tela = new Tela_Pilha();
				tela.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(368, 181, 89, 23);
		panel.add(button_1);
		
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
				String texto= descricao[objeto].getDescricao_int();
				txt_texto.setText(texto);	
			}
		});
		btn_descricao.setBounds(10, 11, 89, 23);
		panel.add(btn_descricao);
		
		JButton button_3 = new JButton("Caracteristicas");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Descricao_e[] descricao = new Descricao_e[3];
				try {
					descricao=Carregatxt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				String texto= descricao[objeto].getCaract();
				txt_texto.setText(texto);	
			}
		});
		button_3.setBounds(98, 11, 110, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("Uso");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setBounds(208, 11, 89, 23);
		panel.add(button_4);
		
		JButton button_5 = new JButton("Dificuldade");
		button_5.setBounds(296, 11, 89, 23);
		panel.add(button_5);
	}
}
