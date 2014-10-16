package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import controller.Telas;
import javax.swing.ImageIcon;
import java.awt.Color;

;

public class JF_Splash extends Telas {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_Splash frame = new JF_Splash();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
				JF_Splash.this.dispose();
				try {
					Frm_principal tela = new Frm_principal();
					tela.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"Ocorreu uma treta maligna");
				}

			}

		}.start();

	}

	/**
	 * Create the frame.
	 */
	public JF_Splash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);

		centralizeFrame();
		iconeBarra();
		Estilo();

		JProgressBar barra = new JProgressBar();
		barra.setFont(new Font("Tahoma", Font.PLAIN, 16));
		barra.setForeground(Color.DARK_GRAY);
		barra.setStringPainted(true);
		barra.setBounds(10, 119, 430, 42);

		contentPane.add(barra);

		JLabel lbltexto = new JLabel("Carregando Sistema");
		lbltexto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbltexto.setBounds(120, 172, 221, 20);
		contentPane.add(lbltexto);

		Carrega(barra, lbltexto);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(JF_Splash.class
				.getResource("/Imagens/icon.png")));
		label.setBounds(198, 23, 68, 66);
		contentPane.add(label);

		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(JF_Splash.class
				.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 450, 300);
		contentPane.add(lbl_fundo);
	}
}
