package view;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import controller.LerConfuguracao;
import controller.Telas;
import javax.swing.ImageIcon;

import entity.Configuracao_e;

import java.awt.Color;
import java.io.IOException;

/**
 * Classe que irá apresentar a tela Splash.
 * 
 * @author João
 * 
 */

@SuppressWarnings("serial")
public class Frm_Splash extends Telas {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_Splash frame = new Frm_Splash();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Carrega a progress Bar
	 * 
	 * @param barra
	 * @param lbltexto
	 */
	public void Carrega(final JProgressBar barra, final JLabel lbltexto) {
		new Thread() {

			public void run() {
				for (int i = 0; i <= 100; i++) {
					barra.setValue(i);
					try {
						Thread.sleep(18);
					} catch (InterruptedException ex) {
						System.out.println(ex);
					}
					if (barra.getValue() <= 40) {
						lbltexto.setText("Carregando componentes");
					} else {
						if (barra.getValue() <= 80) {
							lbltexto.setText("Carregando interface");
						} else {
							lbltexto.setText("Carregando sistema");
						}
					}
				}
				Frm_Splash.this.dispose();
				try {
					Frm_principal tela = new Frm_principal();
					tela.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"Ocorreu uma erro, o programa não consegue encontrar as outras classes");
				}

			}

		}.start();

	}

	/**
	 * Create the frame.
	 */
	public Frm_Splash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);

		Configuracao_e dados = new Configuracao_e();
		LerConfuguracao ler = new LerConfuguracao();

		try {
			ler.ler(dados);
		} catch (IOException e) {
			e.printStackTrace();
		}
		tamanhofonte = dados.getFonte();
		look = dados.getLook();

		centralizeFrame();
		iconeBarra();
		Estilo();
		// linguagem();

		JLabel cuboAzul = new JLabel("");
		cuboAzul.setIcon(new ImageIcon(Frm_Splash.class
				.getResource("/Imagens/cuboAzul.png")));
		cuboAzul.setBounds(256, 68, 68, 66);
		contentPane.add(cuboAzul);

		JLabel cubo = new JLabel("");
		cubo.setIcon(new ImageIcon(Frm_Splash.class
				.getResource("/Imagens/cubo.png")));
		cubo.setBounds(210, 68, 68, 66);
		contentPane.add(cubo);

		JLabel cubo3 = new JLabel("");
		cubo3.setIcon(new ImageIcon(Frm_Splash.class
				.getResource("/Imagens/cubo Vermelho.png")));
		cubo3.setBounds(165, 68, 68, 66);
		contentPane.add(cubo3);

		JLabel cubo2 = new JLabel("");
		cubo2.setIcon(new ImageIcon(Frm_Splash.class
				.getResource("/Imagens/cubo2.png")));
		cubo2.setBounds(120, 68, 68, 66);
		contentPane.add(cubo2);

		JProgressBar barra = new JProgressBar();
		barra.setFont(new Font("Tahoma", Font.PLAIN, 16));
		barra.setForeground(Color.DARK_GRAY);
		barra.setStringPainted(true);
		barra.setBounds(10, 145, 430, 42);

		contentPane.add(barra);

		JLabel lbltexto = new JLabel("Carregando Sistema");
		lbltexto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbltexto.setBounds(120, 198, 221, 20);
		contentPane.add(lbltexto);

		Carrega(barra, lbltexto);

		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_Splash.class
				.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 450, 300);
		contentPane.add(lbl_fundo);

		JLabel lblVerso = new JLabel("Vers\u00E3o: 1.0");
		lblVerso.setBounds(10, 275, 82, 14);
		contentPane.add(lblVerso);
	}
}
