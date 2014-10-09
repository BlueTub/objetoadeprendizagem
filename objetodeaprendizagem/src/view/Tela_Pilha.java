package view;


import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import controller.AnimaçaoPilha;
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

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Window.Type;



public class Tela_Pilha extends JFrame {

	private JPanel contentPane;
	private JTextField tf0;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JMenuBar menuBar;
	private final Action actionPrincipal = new MenuPrincipal();
	private final Action actionSair = new sair();
	private JTextField tf6;
	private JLabel lbl_valor10;
	private JLabel lbl_valor20;
	private JLabel lbl_valor30;
	private JLabel lbl_valor40;
	private JLabel lbl_valor50;
	private JLabel lbl_valor60;
	private JLabel lbl_valor70;
	public int a = 0;
	public static boolean AddRm;

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
		setType(Type.UTILITY);
		setResizable(false);
		setTitle("Anima\u00E7\u00E3o - Pilha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 398);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmMenuPrincipal = new JMenuItem("Menu Principal");
		mntmMenuPrincipal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Tela_Pilha.this.dispose();
				final frm_principal tela = new frm_principal();
			
				//tela.setVisible(true);//AQUI QUE ESSA PORRA DA ERRO !!!!
			}
		});
		
		mntmMenuPrincipal.setAction(actionPrincipal);
		mnArquivo.add(mntmMenuPrincipal);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setAction(actionSair);
		mnArquivo.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_valor10 = new JLabel("10");
		lbl_valor10.setVisible(false);
		lbl_valor10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor10.setForeground(Color.BLACK);
		lbl_valor10.setBounds(163, 54, 29, 38);
		contentPane.add(lbl_valor10);
		
		lbl_valor70 = new JLabel("70");
		lbl_valor70.setForeground(Color.BLACK);
		lbl_valor70.setVisible(false);
		lbl_valor70.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor70.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor70);
		
		lbl_valor60 = new JLabel("60");
		lbl_valor60.setForeground(Color.BLACK);
		lbl_valor60.setVisible(false);
		lbl_valor60.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor60.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor60);
		
		lbl_valor50 = new JLabel("50");
		lbl_valor50.setForeground(Color.BLACK);
		lbl_valor50.setVisible(false);
		lbl_valor50.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor50.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor50);
		
		lbl_valor40 = new JLabel("40");
		lbl_valor40.setForeground(Color.BLACK);
		lbl_valor40.setVisible(false);
		lbl_valor40.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor40.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor40);
		
		lbl_valor30 = new JLabel("30");
		lbl_valor30.setForeground(Color.BLACK);
		lbl_valor30.setVisible(false);
		lbl_valor30.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor30.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor30);
		
		lbl_valor20 = new JLabel("20");
		lbl_valor20.setForeground(Color.BLACK);
		lbl_valor20.setVisible(false);
		lbl_valor20.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor20.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor20);
		
		
		
		
		final JButton btnAçao = new JButton("Adicionar");
		btnAçao.setBounds(275, 299, 89, 23);
		contentPane.add(btnAçao);

		tf0 = new JTextField();
		tf0.setBackground(Color.LIGHT_GRAY);
		tf0.setEditable(false);
		tf0.setBounds(60, 291, 63, 38);
		contentPane.add(tf0);
		tf0.setColumns(10);
		
		tf1 = new JTextField();
		tf1.setEditable(false);
		tf1.setColumns(10);
		tf1.setBackground(Color.LIGHT_GRAY);
		tf1.setBounds(60, 252, 63, 38);
		contentPane.add(tf1);
		
		tf2 = new JTextField();
		tf2.setEditable(false);
		tf2.setColumns(10);
		tf2.setBackground(Color.LIGHT_GRAY);
		tf2.setBounds(60, 213, 63, 38);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.setEditable(false);
		tf3.setColumns(10);
		tf3.setBackground(Color.LIGHT_GRAY);
		tf3.setBounds(60, 174, 63, 38);
		contentPane.add(tf3);
		
		tf4 = new JTextField();
		tf4.setEditable(false);
		tf4.setColumns(10);
		tf4.setBackground(Color.LIGHT_GRAY);
		tf4.setBounds(60, 135, 63, 38);
		contentPane.add(tf4);
		
		tf5 = new JTextField();
		tf5.setEditable(false);
		tf5.setColumns(10);
		tf5.setBackground(Color.LIGHT_GRAY);
		tf5.setBounds(60, 96, 63, 38);
		contentPane.add(tf5);
		
		JLabel lblTitulo = new JLabel("PILHA");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitulo.setBounds(46, 11, 96, 28);
		contentPane.add(lblTitulo);
		
		tf6 = new JTextField();
		tf6.setEditable(false);
		tf6.setColumns(10);
		tf6.setBackground(Color.LIGHT_GRAY);
		tf6.setBounds(60, 57, 63, 38);
		contentPane.add(tf6);
		
		
		ActionListener açao = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				a = addElemento(a,btnAçao);
				
				//btnIniciar.setText("Remover");
				
			}
		};
		btnAçao.addActionListener(açao);
	}
	private class MenuPrincipal extends AbstractAction {
		public MenuPrincipal() {
			putValue(NAME, "Menu Principal");
			putValue(SHORT_DESCRIPTION, "Voltar ao Menu Principal");
		}
		public void actionPerformed(ActionEvent e) {

			Tela_Pilha.this.dispose();
			frm_principal prin = new frm_principal();
			//prin.setVisible(true);
		}
		
	}
	private class sair extends AbstractAction {
		public sair() {
			putValue(NAME, "Sair");
			putValue(SHORT_DESCRIPTION, "Fechar aplicação");
		}
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	public int addElemento(int a,JButton btnAção){
		btnAção.setEnabled(false);
		if (a == 0) {
			Thread t1 = new AnimaçaoPilha(lbl_valor10,btnAção);
			t1.start();
			a++;
		}else if (a == 1) {
			Thread t1 = new AnimaçaoPilha(lbl_valor20,btnAção);
			t1.start();
			a++;
		}else if (a == 2) {
			Thread t1 = new AnimaçaoPilha(lbl_valor30,btnAção);
			t1.start();
			a++;
		}else if (a == 3) {
			Thread t1 = new AnimaçaoPilha(lbl_valor40,btnAção);
			t1.start();
			a++;
		}else if (a == 4) {
			Thread t1 = new AnimaçaoPilha(lbl_valor50,btnAção);
			t1.start();
			a++;
		}else if (a == 5) {
			Thread t1 = new AnimaçaoPilha(lbl_valor60,btnAção);
			t1.start();
			a++;
		}else if (a == 6) {
			Thread t1 = new AnimaçaoPilha(lbl_valor70,btnAção);
			t1.start();
			a++;
		}
		return a;
	}


	
	
}

