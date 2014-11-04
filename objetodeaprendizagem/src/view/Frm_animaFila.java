package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import controller.AnimacaoFila;
import controller.MexerFila;
import controller.Telas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;
/**
 * Formulario da animação da fila
 * @author Zuzi
 */
@SuppressWarnings("serial")
public class Frm_animaFila extends Telas {

	private JPanel contentPane;
	private int add = 0;
	private int rm = 0;
	private float x = 27;
	private int cont = 0;
	private JLabel elementos[] = new JLabel[6];
	private JLabel fila[] = new JLabel[6];
	private JLabel lbl_valor10;
	private JLabel lbl_valor20;
	private JLabel lbl_valor30;
	private JLabel lbl_valor40;
	private JLabel lbl_valor50;
	private JLabel lbl_valor60;
	private JButton btnAdicionar;
	private JButton  btnRemover;
	private JLabel lbl_fundo;
	private JLabel lblFilaCheia;
	private boolean condiçao;
	static private int objeto;
	private JLabel lblCubo1;
	private JLabel lblCubo2;
	private JLabel lblCubo4;
	private JLabel lblCubo5;
	private JButton btnQuestionrio;
	private JButton btnVoltar;
	private final Action menu = new SwingAction();
	/**
	 * Launch the application.
	 */
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
		setTitle("Anima\u00E7\u00E3o - Fila");
		setObjeto(obj);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 406);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmMenuPrincipal = new JMenuItem("Menu Principal");
		mntmMenuPrincipal.setAction(menu);
		mnArquivo.add(mntmMenuPrincipal);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		centralizeFrame();
		Estilo();
		iconeBarra();
		
		lbl_valor10 = new JLabel("10");
		lbl_valor10.setVisible(false);
		
		lbl_valor20 = new JLabel("20");
		lbl_valor20.setForeground(Color.BLACK);
		lbl_valor20.setVisible(false);
		
		lbl_valor30 = new JLabel("30");
		lbl_valor30.setForeground(Color.BLACK);
		lbl_valor30.setVisible(false);
		
		lbl_valor40 = new JLabel("40");
		lbl_valor40.setForeground(Color.BLACK);
		lbl_valor40.setVisible(false);
		
		lbl_valor50 = new JLabel("50");
		lbl_valor50.setForeground(Color.BLACK);
		lbl_valor50.setVisible(false);
		
		lbl_valor60 = new JLabel("60");
		lbl_valor60.setForeground(Color.BLACK);
		lbl_valor60.setVisible(false);
		
		lblFilaCheia = new JLabel("Fila Cheia!!");
		lblFilaCheia.setVisible(false);
		lblFilaCheia.setForeground(Color.DARK_GRAY);
		lblFilaCheia.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblFilaCheia.setBounds(110, 199, 137, 31);
		contentPane.add(lblFilaCheia);
		
		JLabel label_7 = new JLabel("5");
		label_7.setBounds(282, 52, 11, 14);
		contentPane.add(label_7);
		
		JLabel label_6 = new JLabel("4");
		label_6.setBounds(236, 52, 11, 14);
		contentPane.add(label_6);
		
		JLabel label_4 = new JLabel("2");
		label_4.setBounds(145, 52, 11, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("3");
		label_5.setBounds(190, 52, 11, 14);
		contentPane.add(label_5);
		
		JLabel label_2 = new JLabel("0");
		label_2.setBounds(52, 52, 11, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("1");
		label_3.setBounds(100, 52, 11, 14);
		contentPane.add(label_3);
		
		JLabel lblFuncionamentoDeUma = new JLabel("Funcionamento de uma Fila");
		lblFuncionamentoDeUma.setForeground(Color.BLACK);
		lblFuncionamentoDeUma.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFuncionamentoDeUma.setBounds(52, 11, 241, 14);
		contentPane.add(lblFuncionamentoDeUma);
		
		JLabel label_1 = new JLabel("Remova um elemento");
		label_1.setBounds(385, 105, 129, 14);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("Adicione um elemento");
		label.setBounds(388, 21, 126, 14);
		contentPane.add(label);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVoltar.setBounds(267, 300, 101, 36);
		contentPane.add(btnVoltar);
		
		btnQuestionrio = new JButton("Question\u00E1rio");
		btnQuestionrio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnQuestionrio.setBounds(388, 300, 101, 36);
		contentPane.add(btnQuestionrio);
		lbl_valor60.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor60.setBounds(282, 163, 29, 31);
		contentPane.add(lbl_valor60);
		
		lbl_valor50.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor50.setBounds(282, 163, 29, 31);
		contentPane.add(lbl_valor50);
		
		lbl_valor40.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor40.setBounds(282, 163, 29, 31);
		contentPane.add(lbl_valor40);
		
		lbl_valor30.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor30.setBounds(282, 163, 29, 31);
		contentPane.add(lbl_valor30);
		
		lbl_valor20.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor20.setBounds(282, 163, 29, 31);
		contentPane.add(lbl_valor20);
		
		lbl_valor10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor10.setForeground(Color.BLACK);
		lbl_valor10.setBounds(282, 163, 29, 31);
		contentPane.add(lbl_valor10);
		
		lblCubo5 = new JLabel("");
		lblCubo5.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cuboAzul.png")));
		lblCubo5.setBounds(257, 66, 65, 68);
		contentPane.add(lblCubo5);
		
		lblCubo4 = new JLabel("");
		lblCubo4.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cuboAzul.png")));
		lblCubo4.setBounds(211, 66, 65, 68);
		contentPane.add(lblCubo4);
		
		JLabel lblCubo3 = new JLabel("");
		lblCubo3.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cuboAzul.png")));
		lblCubo3.setBounds(165, 66, 65, 68);
		contentPane.add(lblCubo3);
		
		lblCubo2 = new JLabel("");
		lblCubo2.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cuboAzul.png")));
		lblCubo2.setBounds(119, 66, 65, 68);
		contentPane.add(lblCubo2);
		
		lblCubo1 = new JLabel("");
		lblCubo1.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cuboAzul.png")));
		lblCubo1.setBounds(73, 66, 65, 68);
		contentPane.add(lblCubo1);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setMnemonic('A');
		btnAdicionar.setToolTipText("Adiciona um novo elemento na fila");
		btnAdicionar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdicionar.setBounds(388, 34, 109, 47);
		contentPane.add(btnAdicionar);
		
		btnRemover = new JButton("Remover");
		btnRemover.setMnemonic('R');
		btnRemover.setToolTipText("Remove um elemento da fila");
		btnRemover.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRemover.setBounds(388, 118, 109, 47);
		contentPane.add(btnRemover);
		
		JLabel lblCubo0 = new JLabel("");
		lblCubo0.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cuboAzul.png")));
		lblCubo0.setBounds(27, 66, 65, 68);
		contentPane.add(lblCubo0);
		
		lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_animaPilha.class.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 535, 358);
		contentPane.add(lbl_fundo);
		
		if (cont == 0) {
			btnAdicionar.setEnabled(true);
			btnRemover.setEnabled(false);
		}
		carregaVtElementos();
		
		ActionListener adicionar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				condiçao = true;
				addElemento(btnAdicionar, btnRemover);
				
			}
		};
		
		ActionListener remover = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				condiçao = false;
				RmElemento(btnAdicionar, btnRemover);
				
			}
		};
		
		ActionListener voltar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Frm_descricao d = new Frm_descricao(1);
				d.setVisible(true);
			}
		};
		
		ActionListener questionario = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 
				
			}
		};
	
		btnAdicionar.addActionListener(adicionar);
		btnRemover.addActionListener(remover);
		btnVoltar.addActionListener(voltar);
		btnQuestionrio.addActionListener(questionario);
	}
	/**
	 * metodo para carregar as JLabels em um vetor
	 */
	public void carregaVtElementos(){
		elementos[0] = lbl_valor10;
		elementos[1] = lbl_valor20;
		elementos[2] = lbl_valor30;
		elementos[3] = lbl_valor40;
		elementos[4] = lbl_valor50;
		elementos[5] = lbl_valor60;
	}
	/**
	 * Metodo para adicionar elementos na Fila
	 * @param btnAdicionar
	 * @param btnRemover
	 */
	public void addElemento(JButton btnAdicionar,JButton btnRemover){
		
		btnAdicionar.setEnabled(false);
		btnRemover.setEnabled(false);
		
		fila[add] = elementos[add];
		Thread t1 = new AnimacaoFila(fila[add], btnAdicionar, btnRemover, x, cont,lblFilaCheia,condiçao);
		t1.start();
		add++;
		cont++;
		x -= 5;

		if (add == 6) {
			add = 0;
		}
	}
	/**
	 * Metodo para remover elementos da Fila
	 * @param btnAdicionar
	 * @param btnRemover
	 */
	public void RmElemento(JButton btnAdicionar,JButton btnRemover){
		lblFilaCheia.setVisible(false);
		btnAdicionar.setEnabled(false);
		btnRemover.setEnabled(false);
		Thread t1 = new AnimacaoFila(fila[rm], btnAdicionar, btnRemover, x, cont,lblFilaCheia,condiçao);
		fila[rm] = null;
		t1.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < fila.length; i++) {
			if (fila[i] != null) {
				Thread t2 = new MexerFila(fila[i], btnAdicionar, btnRemover);
				t2.start();
			}
		}
		rm++;
		cont--;
		x += 5;
		if (rm == 6) {
			rm = 0;
		}

		if (cont == 0) {
			btnAdicionar.setEnabled(true);
	    }
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Menu Principal");
			putValue(SHORT_DESCRIPTION, "Voltar ao menu principal");
		}
		public void actionPerformed(ActionEvent e) {
			dispose();
			Frm_principal p = new Frm_principal();
			p.setVisible(true);
		}
	}
}
