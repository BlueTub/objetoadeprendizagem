package view;

import controller.AnimaçaoPilhaRm;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import controller.AnimaçaoPilhaAdd;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;

public class Tela_Pilha extends JFrame {

	private JPanel contentPane;
	private JTextField tf0;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JMenuBar menuBar;
	private JTextField tf6;
	private JLabel lbl_valor10;
	private JLabel lbl_valor20;
	private JLabel lbl_valor30;
	private JLabel lbl_valor40;
	private JLabel lbl_valor50;
	private JLabel lbl_valor60;
	private JLabel lbl_valor70;
	private final Action action = new SwingAction();
	private static int n = 6;
	private static int z = 0;
	private JLabel vtEmpilhado[] = new JLabel[7];
	private JLabel vtDesempilhado[] = new JLabel[7];
	private Thread vtIniciarAdd[] = new Thread[7];
	private Thread vtIniciarRm[] = new Thread[7];
	final JButton btnAdicionar;
	final JButton btnRemover;
	private static int cont = 1;
	private static int y = 24;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lblTopo;
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
	}

	/**
	 * Create the frame.
	 */
	public Tela_Pilha() {
		setType(Type.UTILITY);
		setResizable(false);
		setTitle("Anima\u00E7\u00E3o - Pilha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 386);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmMenuPrincipal = new JMenuItem("Menu Principal");
		mntmMenuPrincipal.setAction(action);
		mnArquivo.add(mntmMenuPrincipal);
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
		
		
		
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(330, 65, 89, 23);
		contentPane.add(btnAdicionar);

		tf0 = new JTextField();
		tf0.setBackground(Color.LIGHT_GRAY);
		tf0.setEditable(false);
		tf0.setBounds(83, 291, 63, 38);
		contentPane.add(tf0);
		tf0.setColumns(10);
		
		tf1 = new JTextField();
		tf1.setEditable(false);
		tf1.setColumns(10);
		tf1.setBackground(Color.LIGHT_GRAY);
		tf1.setBounds(83, 252, 63, 38);
		contentPane.add(tf1);
		
		tf2 = new JTextField();
		tf2.setEditable(false);
		tf2.setColumns(10);
		tf2.setBackground(Color.LIGHT_GRAY);
		tf2.setBounds(83, 213, 63, 38);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.setEditable(false);
		tf3.setColumns(10);
		tf3.setBackground(Color.LIGHT_GRAY);
		tf3.setBounds(83, 174, 63, 38);
		contentPane.add(tf3);
		
		tf4 = new JTextField();
		tf4.setEditable(false);
		tf4.setColumns(10);
		tf4.setBackground(Color.LIGHT_GRAY);
		tf4.setBounds(83, 135, 63, 38);
		contentPane.add(tf4);
		
		tf5 = new JTextField();
		tf5.setEditable(false);
		tf5.setColumns(10);
		tf5.setBackground(Color.LIGHT_GRAY);
		tf5.setBounds(83, 96, 63, 38);
		contentPane.add(tf5);
		
		JLabel lblTitulo = new JLabel("PILHA");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitulo.setBounds(76, 11, 96, 28);
		contentPane.add(lblTitulo);
		
		tf6 = new JTextField();
		tf6.setEditable(false);
		tf6.setColumns(10);
		tf6.setBackground(Color.LIGHT_GRAY);
		tf6.setBounds(83, 57, 63, 38);
		contentPane.add(tf6);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(259, 299, 89, 23);
		contentPane.add(btnVoltar);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(219, 65, 89, 23);
		contentPane.add(btnRemover);
		
		JButton btnQuestionrio = new JButton("Question\u00E1rio");
		btnQuestionrio.setBounds(364, 298, 108, 23);
		contentPane.add(btnQuestionrio);
		
		lblTopo = new JLabel("TOPO ->");
		lblTopo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTopo.setBounds(10, 344, 53, 14);
		contentPane.add(lblTopo);
		
		JLabel lbl0 = new JLabel("0");
		lbl0.setBounds(64, 303, 11, 14);
		contentPane.add(lbl0);
		
		lbl1 = new JLabel("1");
		lbl1.setBounds(64, 265, 11, 14);
		contentPane.add(lbl1);
		
		lbl2 = new JLabel("2");
		lbl2.setBounds(64, 224, 11, 14);
		contentPane.add(lbl2);
		
		lbl3 = new JLabel("3");
		lbl3.setBounds(63, 185, 11, 14);
		contentPane.add(lbl3);
		
		lbl4 = new JLabel("4");
		lbl4.setBounds(63, 145, 11, 14);
		contentPane.add(lbl4);
		
		lbl5 = new JLabel("5");
		lbl5.setBounds(64, 105, 11, 14);
		contentPane.add(lbl5);
		
		lbl6 = new JLabel("6");
		lbl6.setBounds(64, 65, 11, 14);
		contentPane.add(lbl6);
		
		/**
		 * Botao voltar
		 */
		ActionListener voltar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO
				
			}
		};
		
		/**
		 * Botão para adicionar elementos na Pilha
		 */
		ActionListener adicionar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addElemento(btnAdicionar,btnRemover);
			}
		};
		
		/**
		 * Botao para remover elementos da Pilha
		 */
		ActionListener remover = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rmElemento(btnAdicionar, btnRemover);
			}
		};
		btnRemover.addActionListener(remover);
		
		btnAdicionar.addActionListener(adicionar);
		btnVoltar.addActionListener(voltar);
		if (cont == 1) {
			CarregaVtDesempilhado();
			cont++;
		}
		if (vtEmpilhado[0] == null) {
			btnRemover.setEnabled(false);
		}

	}
	
	public void CarregaVtDesempilhado(){
		vtDesempilhado[0] = lbl_valor10;
		vtDesempilhado[1] = lbl_valor20;
		vtDesempilhado[2] = lbl_valor30;
		vtDesempilhado[3] = lbl_valor40;
		vtDesempilhado[4] = lbl_valor50;
		vtDesempilhado[5] = lbl_valor60;
		vtDesempilhado[6] = lbl_valor70;
	}
	
	public void CarregavtIniciarAdd(){
		Thread t7 = new AnimaçaoPilhaAdd(lbl_valor70,btnAdicionar,btnRemover,y,lblTopo);
		Thread t6 = new AnimaçaoPilhaAdd(lbl_valor60,btnAdicionar,btnRemover,y,lblTopo);
		Thread t5 = new AnimaçaoPilhaAdd(lbl_valor50,btnAdicionar,btnRemover,y,lblTopo);
		Thread t4 = new AnimaçaoPilhaAdd(lbl_valor40,btnAdicionar,btnRemover,y,lblTopo);
		Thread t3 = new AnimaçaoPilhaAdd(lbl_valor30,btnAdicionar,btnRemover,y,lblTopo);
		Thread t2 = new AnimaçaoPilhaAdd(lbl_valor20,btnAdicionar,btnRemover,y,lblTopo);
		Thread t1 = new AnimaçaoPilhaAdd(lbl_valor10,btnAdicionar,btnRemover,y,lblTopo);
		vtIniciarAdd[0] = t1;
		vtIniciarAdd[1] = t2;
		vtIniciarAdd[2] = t3;
		vtIniciarAdd[3] = t4;
		vtIniciarAdd[4] = t5;
		vtIniciarAdd[5] = t6;
		vtIniciarAdd[6] = t7;
	}
	
	public void CarregavtIniciaRm(){
		Thread t7 = new AnimaçaoPilhaRm(lbl_valor70,btnAdicionar,btnRemover,lblTopo);
		Thread t6 = new AnimaçaoPilhaRm(lbl_valor60,btnAdicionar,btnRemover,lblTopo);
		Thread t5 = new AnimaçaoPilhaRm(lbl_valor50,btnAdicionar,btnRemover,lblTopo);
		Thread t4 = new AnimaçaoPilhaRm(lbl_valor40,btnAdicionar,btnRemover,lblTopo);
		Thread t3 = new AnimaçaoPilhaRm(lbl_valor30,btnAdicionar,btnRemover,lblTopo);
		Thread t2 = new AnimaçaoPilhaRm(lbl_valor20,btnAdicionar,btnRemover,lblTopo);
		Thread t1 = new AnimaçaoPilhaRm(lbl_valor10,btnAdicionar,btnRemover,lblTopo);
		vtIniciarRm[0] = t1;
		vtIniciarRm[1] = t2;
		vtIniciarRm[2] = t3;
		vtIniciarRm[3] = t4;
		vtIniciarRm[4] = t5;
		vtIniciarRm[5] = t6;
		vtIniciarRm[6] = t7;
	}
	
	public void addElemento(JButton btnAdicionar,JButton btnRemover){
		btnAdicionar.setEnabled(false);
		btnRemover.setEnabled(false);
		CarregavtIniciarAdd();
		for (int i = z; i < vtEmpilhado.length - n; i++) {
			vtEmpilhado[i] = vtDesempilhado[i];
			vtDesempilhado[i] = null;
			vtIniciarAdd[i].start();
		}
		y -= 4;
		if (vtEmpilhado[6] != null) {
			JOptionPane.showMessageDialog(null, "Pilha cheia!!", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			btnAdicionar.setEnabled(false);
		}
		n -=1;
		z +=1;
	}
	
	public void rmElemento(JButton btnAdicionar,JButton btnRemover){
		btnRemover.setEnabled(false);
		btnAdicionar.setEnabled(false);
		
		for (int i = vtDesempilhado.length-1; i > -1; i--) {
				if (vtDesempilhado[i] == null) {
					vtDesempilhado[i] = vtEmpilhado[i];
					vtEmpilhado[i] = null;
					CarregavtIniciaRm();
					vtIniciarRm[i].start();
					i = -1;
					z-=1;
					n+=1;
					y += 4;
				}
		}
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Menu Principal");
			putValue(SHORT_DESCRIPTION, "Voltar ao Principal");
		}
		public void actionPerformed(ActionEvent e) {
			Tela_Pilha.this.dispose();
			frm_principal p = new frm_principal();
			//p.setVisible(true);                        // <- PROBLEMA AQUI !!!!
		}
	}
}

