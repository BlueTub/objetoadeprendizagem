package view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.Fila;
import controller.Telas;
import controller.ThreadCarregamento;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Frm_Pontuacao extends Telas {

	private JPanel contentPane;
	private static Fila fila;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_Pontuacao frame = new Frm_Pontuacao(fila);
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
	@SuppressWarnings("static-access")
	public Frm_Pontuacao(Fila fila) {
		setResizable(false);
		this.fila=fila;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		iconeBarra();
		centralizeFrame();
		Estilo();
		
		
		JPanel painel = new JPanel();
		painel.setBounds(0, 0, 584, 373);
		contentPane.add(painel);
		painel.setLayout(null);
		
		JProgressBar barra = new JProgressBar();
		barra.setBounds(10, 85, 564, 63);
		painel.add(barra);
		
		JLabel lblCarregando = new JLabel("carregando");
		lblCarregando.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarregando.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblCarregando.setBounds(10, 159, 564, 21);
		painel.add(lblCarregando);
		
		JLabel lblPontucao = new JLabel("Pontua\u00E7\u00E3o");
		lblPontucao.setHorizontalAlignment(SwingConstants.CENTER);
		lblPontucao.setBounds(10, 220, 564, 14);
		lblPontucao.setVisible(false);
		painel.add(lblPontucao);
		
		Thread t = new ThreadCarregamento(barra,lblCarregando,lblPontucao,fila);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_principal tela=new Frm_principal();
				tela.setVisible(true);
				Frm_Pontuacao.this.dispose();
			}
		});
		btnVoltar.setMnemonic('v');
		btnVoltar.setBounds(10, 315, 89, 23);
		painel.add(btnVoltar);
		
		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_Pontuacao.class.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 595, 373);
		painel.add(lbl_fundo);
		t.start();
	}
}
