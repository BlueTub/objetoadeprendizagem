package view;

import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JButton;

import controller.Telas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/**
 * Mostra o sobre da aplicação
 * @author Hury
 *
 */
@SuppressWarnings("serial")
public class Frm_sobre extends Telas {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_sobre frame = new Frm_sobre();
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
	public Frm_sobre() {
		setTitle("Sobre");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		centralizeFrame();
		Estilo();
		iconeBarra();
		
		JLabel lblDesenvolvedores = new JLabel("Desenvolvedores:");
		lblDesenvolvedores.setFont(new Font("Tahoma", Font.BOLD, tamanhofonte));
		lblDesenvolvedores.setBounds(128, 184, 173, 14);
		contentPane.add(lblDesenvolvedores);
		
		JLabel lblHury = new JLabel("<html><u>Hury Gabriel A.B de Jesus</u></html>");
		lblHury.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0){
				URI url = null;
				try {
					url = new URI("https://www.facebook.com/hurygabriel");
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				abrirUrl(url);
			}
		});
		lblHury.setFont(new Font("Tahoma", Font.BOLD, tamanhofonte));
		lblHury.setBounds(128, 219, 250, 21);
		contentPane.add(lblHury);
		
		JLabel lblJoao = new JLabel("<html><u>Jo\u00E3o Victor Alves de Jesus</u></html>");
		lblJoao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				URI url = null;
				try {
					url = new URI("https://www.facebook.com/joao.victor.alves.jesus");
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				abrirUrl(url);
			}
		});
		lblJoao.setFont(new Font("Tahoma", Font.BOLD, tamanhofonte));
		lblJoao.setBounds(128, 240, 250, 21);
		contentPane.add(lblJoao);
		
		JLabel lblZuzi = new JLabel("<html><u>Pedro Zuzi</u></html>");
		lblZuzi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					URI url = null;
					try {
						url = new URI("https://www.facebook.com/pedro.zuzi");
					} catch (URISyntaxException e) {
						e.printStackTrace();
					}
					abrirUrl(url);
			}
		});
		lblZuzi.setFont(new Font("Tahoma", Font.BOLD, tamanhofonte));
		lblZuzi.setBounds(128, 280, 197, 21);
		contentPane.add(lblZuzi);
		
		JLabel lblBurns = new JLabel("<html><u>Leonardo Benedicto</u></html>");
		lblBurns.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				URI url = null;
				try {
					url = new URI("https://www.facebook.com/leonardo.leitebenedicto");
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				abrirUrl(url);
			}
		});
		lblBurns.setFont(new Font("Tahoma", Font.BOLD, tamanhofonte));
		lblBurns.setBounds(128, 197, 197, 21);
		contentPane.add(lblBurns);
		
		JLabel lblCorinthians = new JLabel("<html><u> Pedro Afonso</u></html>");
		lblCorinthians.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				URI url = null;
				try {
					url = new URI("https://www.facebook.com/pedroamellosilva");
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				abrirUrl(url);
				
			}
		});
		lblCorinthians.setFont(new Font("Tahoma", Font.BOLD, tamanhofonte));
		lblCorinthians.setBounds(128, 261, 197, 21);
		contentPane.add(lblCorinthians);

		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				URI url = null;
				try {
					url = new URI("http://www.fateczl.edu.br/");
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				abrirUrl(url);
				
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Frm_sobre.class.getResource("/Imagens/fatec_logo.png")));
		lblNewLabel.setBounds(128, 0, 158, 67);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnProjetoDesenvolvidoNa = new JTextPane();
		txtpnProjetoDesenvolvidoNa.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		txtpnProjetoDesenvolvidoNa.setEditable(false);
		txtpnProjetoDesenvolvidoNa.setText("Projeto desenvolvido na institui\u00E7\u00E3o FATEC da zona leste, no 3\u00BA semestre do curso de análise e desenvolvimento de sistemas sob orienta\u00E7\u00E3o dos prof(a) ms. Andreia, Cristina e Wellingtton");
		txtpnProjetoDesenvolvidoNa.setBounds(62, 67, 316, 106);
		txtpnProjetoDesenvolvidoNa.setFont(new Font("Tahoma",Font.PLAIN,tamanhofonte));
		contentPane.add(txtpnProjetoDesenvolvidoNa);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setSelectedIcon(new ImageIcon(Frm_sobre.class.getResource("/Imagens/arrow-back-select.png")));
		btnNewButton.setIcon(new ImageIcon(Frm_sobre.class.getResource("/Imagens/arrow-back.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(162, 337, 89, 57);
		contentPane.add(btnNewButton);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setFont(new Font("Tahoma",Font.PLAIN,tamanhofonte));
		lblVoltar.setBounds(202, 415, 46, 14);
		contentPane.add(lblVoltar);
		
		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_sobre.class.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 444, 435);
		contentPane.add(lbl_fundo);
	}
	/**
	 * Método para abrir uma url pelo aplicativo padrão do SO
	 * @param caminho Caminho da url
	 */
	public void abrirUrl(URI caminho){
		Desktop desktop = Desktop.getDesktop();
		try {
			boolean abrir = desktop.isSupported(Desktop.Action.BROWSE);
			if (abrir) {
				desktop.browse(caminho);
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"<html>Seu computador não possui nenhum browser<br></html>");
		}
	}
	
}
