package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import controller.Telas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Frm_animaFila extends Telas {

	private JPanel contentPane;
	private JLabel fila[] = new JLabel [6];
	private int tamanho = 0;
	private JLabel Elementos[] = new JLabel [6];
	private Thread vtIniciarAdd[] = new Thread[6];
	private Thread vtIniciarRm[] = new Thread[6];
	private Thread thread;
	private JLabel lbl_valor10;
	private JLabel lbl_valor20;
	private JLabel lbl_valor30;
	private JLabel lbl_valor40;
	private JLabel lbl_valor50;
	private JLabel lbl_valor60;

	/**
	 * Launch the application.
	 */
	static private int objeto;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		centralizeFrame();
		Estilo();
		iconeBarra();
		
		JLabel lblFila = new JLabel("Fila");
		lblFila.setBounds(171, 123, 46, 14);
		contentPane.add(lblFila);
		
		lbl_valor10 = new JLabel("10");
		lbl_valor10.setVisible(false);
		lbl_valor10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor10.setForeground(Color.BLACK);
		lbl_valor10.setBounds(163, 54, 29, 38);
		contentPane.add(lbl_valor10);
		
		lbl_valor20 = new JLabel("20");
		lbl_valor20.setForeground(Color.BLACK);
		lbl_valor20.setVisible(false);
		lbl_valor20.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor20.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor20);
		
		lbl_valor30 = new JLabel("30");
		lbl_valor30.setForeground(Color.BLACK);
		lbl_valor30.setVisible(false);
		lbl_valor30.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor30.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor30);
		
		lbl_valor40 = new JLabel("40");
		lbl_valor40.setForeground(Color.BLACK);
		lbl_valor40.setVisible(false);
		lbl_valor40.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor40.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor40);
		
		lbl_valor50 = new JLabel("50");
		lbl_valor50.setForeground(Color.BLACK);
		lbl_valor50.setVisible(false);
		lbl_valor50.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor50.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor50);
		
		lbl_valor60 = new JLabel("60");
		lbl_valor60.setForeground(Color.BLACK);
		lbl_valor60.setVisible(false);
		lbl_valor60.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor60.setBounds(163, 58, 29, 31);
		contentPane.add(lbl_valor60);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frm_descricao teladesc = new Frm_descricao(getObjeto());
				teladesc.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(146, 188, 89, 23);
		contentPane.add(btnNewButton);
	}
	
	public void carregaVtElementos(){
		Elementos[0] = lbl_valor10;
		Elementos[1] = lbl_valor20;
		Elementos[2] = lbl_valor30;
		Elementos[3] = lbl_valor40;
		Elementos[4] = lbl_valor50;
		Elementos[5] = lbl_valor60;
	}
	
	public void carregaIniciarVtIniciarAdd(){
		//TODO
	}
	
	public void carregaVtIniciarRm(){
		//TODO
	}
	
	public void addElemento(JButton btnAdicionar,JButton btnRemover){
		
		btnAdicionar.setEnabled(false);
		btnRemover.setEnabled(false);
		carregaIniciarVtIniciarAdd();
		
		fila[tamanho] = Elementos[tamanho];
		thread = vtIniciarAdd[tamanho];
		tamanho++;
        thread.start();
        
        if (fila[5] != null) {
        	JOptionPane.showMessageDialog(null, "Fila cheia!!", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			btnAdicionar.setEnabled(false);
		}
	}
	
	public void RmElemento(JButton btnAdicionar,JButton btnRemover){
		btnRemover.setEnabled(false);
		btnAdicionar.setEnabled(false);
		carregaVtIniciarRm();
		
		//TODO
	}
}
