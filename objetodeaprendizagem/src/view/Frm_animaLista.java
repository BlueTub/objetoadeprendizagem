package view;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import controller.Telas;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Formulario da animação da Lista
 * @author Zuzi
 *
 */
@SuppressWarnings("serial")
public class Frm_animaLista extends Telas {

	private JPanel contentPane;
	private JLabel lbl_fundo;
	/**
	 * Launch the application.
	 */
	
	private static int objeto =0;
	private JLabel lbl_valor10;
	private JLabel lblCubo2;
	private JLabel lblCubo3;
	private JLabel lblCubo4;
	private JLabel lblCubo5;
	private JButton btnAdicionaFinal;
	private JButton btnAdicionar;
	private JButton btnRemoveIncio;
	private JButton btnRemoveFinal;
	private JButton btnRemover;
	private JLabel lblFuncionamentoDeUma;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel lbl_valor20;
	private JLabel lbl_valor30;
	private JLabel lbl_valor40;
	private JLabel lbl_valor50;
	private JLabel lbl_valor60;
	private JButton button;
	private JButton button_1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_animaLista frame = new Frm_animaLista(objeto);
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
		Frm_animaLista.objeto = objeto;
	}

	/**
	 * Create the frame.
	 */
	public Frm_animaLista(int obj) {
		setTitle("Anima\u00E7\u00E3o - Lista");
		setObjeto(obj);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		centralizeFrame();
		Estilo();
		iconeBarra();
		
		button = new JButton("Voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_descricao telades = new Frm_descricao(2);
				telades.setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.setBounds(389, 313, 101, 36);
		contentPane.add(button);
		
		button_1 = new JButton("Question\u00E1rio");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_1.setBounds(515, 313, 119, 36);
		contentPane.add(button_1);
		
		lbl_valor60 = new JLabel("60");
		lbl_valor60.setForeground(Color.BLACK);
		lbl_valor60.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor60.setBounds(282, 163, 29, 31);
		contentPane.add(lbl_valor60);
		
		lbl_valor50 = new JLabel("50");
		lbl_valor50.setForeground(Color.BLACK);
		lbl_valor50.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor50.setBounds(282, 163, 29, 31);
		contentPane.add(lbl_valor50);
		
		lbl_valor40 = new JLabel("40");
		lbl_valor40.setForeground(Color.BLACK);
		lbl_valor40.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor40.setBounds(282, 163, 29, 31);
		contentPane.add(lbl_valor40);
		
		lbl_valor30 = new JLabel("30");
		lbl_valor30.setForeground(Color.BLACK);
		lbl_valor30.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor30.setBounds(282, 163, 29, 31);
		contentPane.add(lbl_valor30);
		
		lbl_valor10 = new JLabel("10");
		lbl_valor10.setForeground(Color.BLACK);
		lbl_valor10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor10.setBounds(282, 163, 29, 31);
		contentPane.add(lbl_valor10);
		
		lbl_valor20 = new JLabel("20");
		lbl_valor20.setForeground(Color.BLACK);
		lbl_valor20.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_valor20.setBounds(282, 163, 29, 31);
		contentPane.add(lbl_valor20);
		
		label_6 = new JLabel("5");
		label_6.setBounds(287, 53, 11, 14);
		contentPane.add(label_6);
		
		label_1 = new JLabel("0");
		label_1.setBounds(57, 53, 11, 14);
		contentPane.add(label_1);
		
		label_4 = new JLabel("3");
		label_4.setBounds(195, 53, 11, 14);
		contentPane.add(label_4);
		
		label_5 = new JLabel("4");
		label_5.setBounds(241, 53, 11, 14);
		contentPane.add(label_5);
		
		label_3 = new JLabel("2");
		label_3.setBounds(150, 53, 11, 14);
		contentPane.add(label_3);
		
		label_2 = new JLabel("1");
		label_2.setBounds(105, 53, 11, 14);
		contentPane.add(label_2);
		
		lblFuncionamentoDeUma = new JLabel("Funcionamento de uma Lista");
		lblFuncionamentoDeUma.setForeground(Color.BLACK);
		lblFuncionamentoDeUma.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFuncionamentoDeUma.setBounds(57, 11, 254, 14);
		contentPane.add(lblFuncionamentoDeUma);
		
		btnRemover = new JButton("Remover");
		btnRemover.setToolTipText("Remove um elemento de uma posi\u00E7\u00E3o espec\u00EDfica");
		btnRemover.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRemover.setBounds(515, 182, 115, 47);
		contentPane.add(btnRemover);
		
		btnRemoveFinal = new JButton("Remove Final");
		btnRemoveFinal.setToolTipText("Remove um elemento do final");
		btnRemoveFinal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRemoveFinal.setBounds(515, 112, 115, 47);
		contentPane.add(btnRemoveFinal);
		
		btnRemoveIncio = new JButton("Remove In\u00EDcio");
		btnRemoveIncio.setToolTipText("Remove um elemento do in\u00EDcio");
		btnRemoveIncio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRemoveIncio.setBounds(515, 41, 115, 47);
		contentPane.add(btnRemoveIncio);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setToolTipText("Adiciona um novo elemento em uma posi\u00E7\u00E3o espec\u00EDfica");
		btnAdicionar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAdicionar.setBounds(368, 182, 115, 47);
		contentPane.add(btnAdicionar);
		
		btnAdicionaFinal = new JButton("Adiciona Final");
		btnAdicionaFinal.setToolTipText("Adiciona um novo elemento no final");
		btnAdicionaFinal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAdicionaFinal.setBounds(368, 112, 115, 47);
		contentPane.add(btnAdicionaFinal);
		
		JButton btnAdicionaInicio = new JButton("Adiciona In\u00EDcio");
		btnAdicionaInicio.setToolTipText("Adiciona um novo elemento no In\u00EDcio");
		btnAdicionaInicio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAdicionaInicio.setBounds(368, 41, 123, 47);
		contentPane.add(btnAdicionaInicio);
		
		lblCubo5 = new JLabel("");
		lblCubo5.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cubo2.png")));
		lblCubo5.setBounds(257, 66, 65, 68);
		contentPane.add(lblCubo5);
		
		lblCubo4 = new JLabel("");
		lblCubo4.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cubo2.png")));
		lblCubo4.setBounds(211, 66, 65, 68);
		contentPane.add(lblCubo4);
		
		lblCubo3 = new JLabel("");
		lblCubo3.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cubo2.png")));
		lblCubo3.setBounds(165, 66, 65, 68);
		contentPane.add(lblCubo3);
		
		lblCubo2 = new JLabel("");
		lblCubo2.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cubo2.png")));
		lblCubo2.setBounds(119, 66, 65, 68);
		contentPane.add(lblCubo2);
		
		JLabel lblCubo1 = new JLabel("");
		lblCubo1.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cubo2.png")));
		lblCubo1.setBounds(73, 66, 65, 68);
		contentPane.add(lblCubo1);
		
		JLabel lblCubo0 = new JLabel("");
		lblCubo0.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cubo2.png")));
		lblCubo0.setBounds(27, 66, 65, 68);
		contentPane.add(lblCubo0);
		
		lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_animaPilha.class.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 644, 376);
		contentPane.add(lbl_fundo);
	}
}
