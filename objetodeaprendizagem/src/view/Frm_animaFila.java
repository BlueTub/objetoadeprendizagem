package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import controller.AnimaçaoFilaAdd;
import controller.AnimaçaoFilaRm;
import controller.MexerFila;
import controller.Telas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * @author Zuzi
 *
 */
@SuppressWarnings("serial")
public class Frm_animaFila extends Telas {

	private JPanel contentPane;
	private int add = 0;
	private int rm = 0;
	private float x = 27;
	private int cont = 0;
	private JLabel elementos[] = new JLabel[6];
	private JLabel lbl_valor10;
	private JLabel lbl_valor20;
	private JLabel lbl_valor30;
	private JLabel lbl_valor40;
	private JLabel lbl_valor50;
	private JLabel lbl_valor60;
	private JButton btnAdicionar;
	private JButton  btnRemover;

	/**
	 * Launch the application.
	 */
	static private int objeto;
	private JLabel lblCubo1;
	private JLabel lblCubo2;
	private JLabel lblCubo4;
	private JLabel lblCubo5;
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
		setObjeto(obj);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 390);
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
		lbl_valor60.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor60.setBounds(281, 134, 29, 31);
		contentPane.add(lbl_valor60);
		lbl_valor50.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor50.setBounds(281, 134, 29, 31);
		contentPane.add(lbl_valor50);
		lbl_valor40.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor40.setBounds(281, 134, 29, 31);
		contentPane.add(lbl_valor40);
		lbl_valor30.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor30.setBounds(281, 134, 29, 31);
		contentPane.add(lbl_valor30);
		lbl_valor20.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor20.setBounds(281, 134, 29, 31);
		contentPane.add(lbl_valor20);
		lbl_valor10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor10.setForeground(Color.BLACK);
		lbl_valor10.setBounds(281, 134, 29, 31);
		contentPane.add(lbl_valor10);
		
		lblCubo5 = new JLabel("");
		lblCubo5.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cuboCinza.png")));
		lblCubo5.setBounds(256, 34, 65, 68);
		contentPane.add(lblCubo5);
		
		lblCubo4 = new JLabel("");
		lblCubo4.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cuboCinza.png")));
		lblCubo4.setBounds(210, 34, 65, 68);
		contentPane.add(lblCubo4);
		
		JLabel lblCubo3 = new JLabel("");
		lblCubo3.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cuboCinza.png")));
		lblCubo3.setBounds(164, 34, 65, 68);
		contentPane.add(lblCubo3);
		
		lblCubo2 = new JLabel("");
		lblCubo2.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cuboCinza.png")));
		lblCubo2.setBounds(118, 34, 65, 68);
		contentPane.add(lblCubo2);
		
		lblCubo1 = new JLabel("");
		lblCubo1.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cuboCinza.png")));
		lblCubo1.setBounds(72, 34, 65, 68);
		contentPane.add(lblCubo1);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdicionar.setBounds(388, 34, 109, 47);
		contentPane.add(btnAdicionar);
		
		btnRemover = new JButton("Remover");
		btnRemover.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRemover.setBounds(388, 118, 109, 47);
		contentPane.add(btnRemover);
		
		JLabel lblCubo0 = new JLabel("");
		lblCubo0.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cuboCinza.png")));
		lblCubo0.setBounds(26, 34, 65, 68);
		contentPane.add(lblCubo0);
		
		if (add == 0) {
			btnRemover.setEnabled(false);
		}
		
		ActionListener adicionar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addElemento(btnAdicionar, btnRemover);
				
			}
		};
		
		ActionListener remover = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				RmElemento(btnAdicionar, btnRemover);
				
			}
		};
		
		btnAdicionar.addActionListener(adicionar);
		btnRemover.addActionListener(remover);
	}
	
	public void carregaVtElementos(){
		elementos[0] = lbl_valor10;
		elementos[1] = lbl_valor20;
		elementos[2] = lbl_valor30;
		elementos[3] = lbl_valor40;
		elementos[4] = lbl_valor50;
		elementos[5] = lbl_valor60;
	}
	/*
	public void carregaElementosAdd(){
		Thread t1 = new AnimaçaoFilaAdd(lbl_valor10, btnAdicionar, btnRemover,x);
		Thread t2 = new AnimaçaoFilaAdd(lbl_valor20, btnAdicionar, btnRemover,x);
		Thread t3 = new AnimaçaoFilaAdd(lbl_valor30, btnAdicionar, btnRemover,x);
		Thread t4 = new AnimaçaoFilaAdd(lbl_valor40, btnAdicionar, btnRemover,x);
		Thread t5 = new AnimaçaoFilaAdd(lbl_valor50, btnAdicionar, btnRemover,x);
		Thread t6 = new AnimaçaoFilaAdd(lbl_valor60, btnAdicionar, btnRemover,x);
		elementos[0] = t1;
		elementos[1] = t2;
		elementos[2] = t3;
		elementos[3] = t4;
		elementos[4] = t5;
		elementos[5] = t6;
	}
	
	public void carregaVtIniciarRm(){
		Thread t1 = new AnimaçaoFilaRm(lbl_valor10, btnAdicionar, btnRemover);
		Thread t2 = new AnimaçaoFilaRm(lbl_valor20, btnAdicionar, btnRemover);
		Thread t3 = new AnimaçaoFilaRm(lbl_valor30, btnAdicionar, btnRemover);
		Thread t4 = new AnimaçaoFilaRm(lbl_valor40, btnAdicionar, btnRemover);
		Thread t5 = new AnimaçaoFilaRm(lbl_valor50, btnAdicionar, btnRemover);
		Thread t6 = new AnimaçaoFilaRm(lbl_valor60, btnAdicionar, btnRemover);
		elementos[0] = t1;
		elementos[1] = t2;
		elementos[2] = t3;
		elementos[3] = t4;
		elementos[4] = t5;
		elementos[5] = t6;
	}
	*/
	public void addElemento(JButton btnAdicionar,JButton btnRemover){
		
		btnAdicionar.setEnabled(false);
		btnRemover.setEnabled(false);
		carregaVtElementos();
		
		Thread t1 = new AnimaçaoFilaAdd(elementos[add], btnAdicionar, btnRemover, x);
		t1.start();
		add++;
		x -= 5;
		cont++;
		
		if (add == 6) {
			add = 0;
		}
		
        if (cont == 6) {
        	JOptionPane.showMessageDialog(null, "Fila cheia!!", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			btnAdicionar.setEnabled(false);
		}
	}
	
	public void RmElemento(JButton btnAdicionar,JButton btnRemover){
		btnRemover.setEnabled(false);
		btnAdicionar.setEnabled(false);
		carregaVtElementos();
		
		Thread t1 = new AnimaçaoFilaRm(elementos[rm], btnAdicionar, btnRemover);
		t1.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = rm; i < add; i++) {
			Thread t2 = new MexerFila(elementos[i], btnAdicionar, btnRemover);
			t2.start();
		}
		rm++;
		cont--;
		x += 5;
		if (rm == 6) {
			rm = 0;
		}
	}
}
