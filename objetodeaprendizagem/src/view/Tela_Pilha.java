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
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import controller.Telas;

public class Tela_Pilha extends Telas {
	
	private JPanel contentPane;
	private JMenuBar menuBar;
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
	private static int y = 30;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lblTopo;
	private JLabel lblCubo_1;
	private JLabel lblCubo_2;
	private JLabel lblCubo_3;
	private JLabel lblCubo_4;
	private JLabel lblCubo_5;
	private JLabel lblCubo_6;
	private JLabel lbl_fundo;
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
		setBounds(100, 100, 546, 449);
		
		//Metodos para padronizaçao das Telas
		centralizeFrame();
		iconeBarra();
		Estilo();
		
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
		
		lbl_valor70 = new JLabel("70");
		lbl_valor70.setForeground(Color.BLACK);
		lbl_valor70.setVisible(false);
		
		lbl_valor60 = new JLabel("60");
		lbl_valor60.setForeground(Color.BLACK);
		lbl_valor60.setVisible(false);
		
		lbl_valor50 = new JLabel("50");
		lbl_valor50.setForeground(Color.BLACK);
		lbl_valor50.setVisible(false);
		
		lbl_valor40 = new JLabel("40");
		lbl_valor40.setForeground(Color.BLACK);
		lbl_valor40.setVisible(false);
		
		lbl_valor30 = new JLabel("30");
		lbl_valor30.setForeground(Color.BLACK);
		lbl_valor30.setVisible(false);
		
		lbl_valor20 = new JLabel("20");
		lbl_valor20.setForeground(Color.BLACK);
		lbl_valor20.setVisible(false);
		lbl_valor20.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor20.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor20);
		lbl_valor30.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor30.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor30);
		lbl_valor40.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor40.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor40);
		lbl_valor50.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor50.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor50);
		lbl_valor60.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor60.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor60);
		lbl_valor70.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor70.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor70);
		
		lbl_valor10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor10.setForeground(Color.BLACK);
		lbl_valor10.setBounds(163, 54, 29, 38);
		contentPane.add(lbl_valor10);
		
		lblCubo_6 = new JLabel("");
		lblCubo_6.setIcon(new ImageIcon(Tela_Pilha.class.getResource("/Imagens/cubo.png")));
		lblCubo_6.setBounds(76, 39, 65, 67);
		contentPane.add(lblCubo_6);
		
		lblCubo_5 = new JLabel("");
		lblCubo_5.setIcon(new ImageIcon(Tela_Pilha.class.getResource("/Imagens/cubo.png")));
		lblCubo_5.setBounds(76, 89, 65, 67);
		contentPane.add(lblCubo_5);
		
		lblCubo_4 = new JLabel("");
		lblCubo_4.setIcon(new ImageIcon(Tela_Pilha.class.getResource("/Imagens/cubo.png")));
		lblCubo_4.setBounds(76, 138, 65, 67);
		contentPane.add(lblCubo_4);
		
		lblCubo_3 = new JLabel("");
		lblCubo_3.setIcon(new ImageIcon(Tela_Pilha.class.getResource("/Imagens/cubo.png")));
		lblCubo_3.setBounds(76, 187, 65, 67);
		contentPane.add(lblCubo_3);
		
		lblCubo_2 = new JLabel("");
		lblCubo_2.setIcon(new ImageIcon(Tela_Pilha.class.getResource("/Imagens/cubo.png")));
		lblCubo_2.setBounds(76, 236, 65, 67);
		contentPane.add(lblCubo_2);
		
		lblCubo_1 = new JLabel("");
		lblCubo_1.setIcon(new ImageIcon(Tela_Pilha.class.getResource("/Imagens/cubo.png")));
		lblCubo_1.setBounds(76, 285, 65, 67);
		contentPane.add(lblCubo_1);
		
		
		JLabel lblCubo0 = new JLabel("");
		lblCubo0.setIcon(new ImageIcon(Tela_Pilha.class.getResource("/Imagens/cubo.png")));
		lblCubo0.setBounds(76, 334, 65, 67);
		contentPane.add(lblCubo0);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdicionar.setBounds(226, 54, 108, 41);
		contentPane.add(btnAdicionar);
		
		JLabel lblTitulo = new JLabel("PILHA");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitulo.setBounds(64, 11, 96, 28);
		contentPane.add(lblTitulo);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(280, 361, 89, 23);
		contentPane.add(btnVoltar);
		
		btnRemover = new JButton("Remover");
		btnRemover.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRemover.setBounds(226, 125, 108, 41);
		contentPane.add(btnRemover);
		
		JButton btnQuestionario = new JButton("Question\u00E1rio");
		btnQuestionario.setBounds(395, 361, 108, 23);
		contentPane.add(btnQuestionario);
		
		lblTopo = new JLabel("TOPO ->");
		lblTopo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTopo.setBounds(10, 413, 53, 14);
		contentPane.add(lblTopo);
		
		JLabel lbl0 = new JLabel("0");
		lbl0.setBounds(64, 365, 11, 14);
		contentPane.add(lbl0);
		
		lbl1 = new JLabel("1");
		lbl1.setBounds(64, 317, 11, 14);
		contentPane.add(lbl1);
		
		lbl2 = new JLabel("2");
		lbl2.setBounds(64, 269, 11, 14);
		contentPane.add(lbl2);
		
		lbl3 = new JLabel("3");
		lbl3.setBounds(64, 221, 11, 14);
		contentPane.add(lbl3);
		
		lbl4 = new JLabel("4");
		lbl4.setBounds(64, 173, 11, 14);
		contentPane.add(lbl4);
		
		lbl5 = new JLabel("5");
		lbl5.setBounds(64, 125, 11, 14);
		contentPane.add(lbl5);
		
		lbl6 = new JLabel("6");
		lbl6.setBounds(64, 77, 11, 14);
		contentPane.add(lbl6);
		
		lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Tela_Pilha.class.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 540, 399);
		contentPane.add(lbl_fundo);
		
		/**
		 * Botao voltar para a explicaçao da Pilha
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
		/**
		 * Botao para ir para o questionario
		 */
		ActionListener questionario = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JF_Perguntas p = new JF_Perguntas();
				p.setVisible(true);
				dispose();
			}
		};
		
		btnQuestionario.addActionListener(questionario);
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
	
	/**
	 * Metodo para carregar o vetor que armazena as JLabels dos elementos
	 * que entrarao na Pilha
	 */
	public void CarregaVtDesempilhado(){
		vtDesempilhado[0] = lbl_valor10;
		vtDesempilhado[1] = lbl_valor20;
		vtDesempilhado[2] = lbl_valor30;
		vtDesempilhado[3] = lbl_valor40;
		vtDesempilhado[4] = lbl_valor50;
		vtDesempilhado[5] = lbl_valor60;
		vtDesempilhado[6] = lbl_valor70;
	}
	
	/**
	 * Metodo que carrega o vetor com Threads, chamando uma classe 
	 * para adicionar elementos na Pilha
	 */
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
	
	/**
	 * Metodo que carrega o vetor com Threads, chamando uma classe
	 * para remover os elementos da Pilha
	 */
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
	
	/**
	 * Metodo para chamar a Thread que sera executada na animaçao de adicionar elementos
	 * @param btnAdicionar ficara false quando a animaçao estiver em execuçao
	 * @param btnRemover ficara false quando a animaçao estiver em execuçao
	 */ 
	public void addElemento(JButton btnAdicionar,JButton btnRemover){
		btnAdicionar.setEnabled(false);
		btnRemover.setEnabled(false);
		CarregavtIniciarAdd();
		for (int i = z; i < vtEmpilhado.length - n; i++) {
			vtEmpilhado[i] = vtDesempilhado[i];
			vtDesempilhado[i] = null;
			vtIniciarAdd[i].start();
		}
		y -= 5;
		if (vtEmpilhado[6] != null) {
			JOptionPane.showMessageDialog(null, "Pilha cheia!!", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			btnAdicionar.setEnabled(false);
		}
		n -=1;
		z +=1;
	}
	
	/**
	 * Metodo para chamar a Thread que sera executada na animaçao de remover elementos
	 * @param btnAdicionar ficara false quando a animaçao estiver em execuçao
	 * @param btnRemover ficara false quando a animaçao estiver em execuçao
	 */
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
					y += 5;
				}
		}
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Menu Principal");
			putValue(SHORT_DESCRIPTION, "Voltar ao Principal");
		}
		public void actionPerformed(ActionEvent e) {
			dispose();
			Frm_principal p = new Frm_principal();
			p.setVisible(true);
		}
	}
}

