package view;


import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import controller.Metodos;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Tela_Pilha extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JMenuBar menuBar;
	private final Action actionPrincipal = new MenuPrincipal();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Pilha frame = new Tela_Pilha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		new frm_principal();
	}

	/**
	 * Create the frame.
	 */
	public Tela_Pilha() {
		setTitle("Anima\u00E7\u00E3o - Pilha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 398);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmMenuPrincipal = new JMenuItem("Menu Principal");
		mntmMenuPrincipal.setAction(actionPrincipal);
		mnArquivo.add(mntmMenuPrincipal);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnArquivo.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		final JButton btnAçao = new JButton("Adicionar");
		btnAçao.setBounds(178, 299, 89, 23);
		contentPane.add(btnAçao);

		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setEditable(false);
		textField.setBounds(60, 291, 63, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(60, 252, 63, 38);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(60, 213, 63, 38);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(60, 174, 63, 38);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(60, 135, 63, 38);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(60, 96, 63, 38);
		contentPane.add(textField_5);
		
		JLabel lblFuncionamentoDeUma = new JLabel("PILHA");
		lblFuncionamentoDeUma.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblFuncionamentoDeUma.setBounds(50, 47, 96, 28);
		contentPane.add(lblFuncionamentoDeUma);
		
		
		ActionListener iniciar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//btnIniciar.setText("Remover");
				
			}
		};
		
		btnAçao.addActionListener(iniciar);
		
	}
	private class MenuPrincipal extends AbstractAction {
		public MenuPrincipal() {
			putValue(NAME, "Menu Principal");
			putValue(SHORT_DESCRIPTION, "Voltar ao Menu Principal");
		}
		public void actionPerformed(ActionEvent e) {
			Tela_Pilha.this.dispose();
			frm_principal principal = new frm_principal();
			principal.setVisible(true); //AQUI QUE ESSA PORRA DA ERRO !!!!
		}
		
	}
}
