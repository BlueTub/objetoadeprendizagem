package view;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import controller.Telas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class Frm_animaLista extends Telas {

	private JPanel contentPane;
	private JLabel lbl_fundo;
	/**
	 * Launch the application.
	 */
	
	private static int objeto =0;
	private JLabel label;
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
		
		label = new JLabel("10");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(38, 98, 30, 14);
		contentPane.add(label);
		
		JLabel lblCubo0 = new JLabel("");
		lblCubo0.setIcon(new ImageIcon(Frm_animaFila.class.getResource("/Imagens/cubo2.png")));
		lblCubo0.setBounds(27, 66, 65, 68);
		contentPane.add(lblCubo0);
		
		lbl_fundo = new JLabel("");
		lbl_fundo.setIcon(new ImageIcon(Frm_animaPilha.class.getResource("/Imagens/BackGround.png")));
		lbl_fundo.setBounds(0, 0, 540, 414);
		contentPane.add(lbl_fundo);
	}
}
