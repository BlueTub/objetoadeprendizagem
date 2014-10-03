package teste_fonte;


import java.awt.Checkbox;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StyledEditorKit.ItalicAction;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Fonte extends JFrame {

	private JPanel contentPane;
	private JTextField tftexto;
	private JCheckBox chckbxNegrito;
	private JCheckBox chckbxItalico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fonte frame = new Fonte();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Fonte() {
		
		super("Testando a Fonte");
		getContentPane().setLayout(new FlowLayout());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 122);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tftexto = new JTextField("Escolha o estilo da Fonte");
		tftexto.setFont(new Font("Tahoma",Font.PLAIN, 15));
		tftexto.setBounds(10, 11, 360, 31);
		contentPane.add(tftexto);
		tftexto.setColumns(10);
		
		chckbxNegrito = new JCheckBox("Negrito");
		chckbxNegrito.setBounds(37, 49, 73, 23);
		contentPane.add(chckbxNegrito);
		
		chckbxItalico = new JCheckBox("It\u00E1lico");
		chckbxItalico = new JCheckBox ("It\u00E1lico");
		chckbxItalico.setBounds(245, 49, 95, 23);
		contentPane.add(chckbxItalico);
		
		CheckBoxHandler handler = new CheckBoxHandler();
		chckbxNegrito.addItemListener(handler);
		chckbxItalico.addItemListener(handler);
	}
	
	private class CheckBoxHandler implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		Font fonte = null;
		
		if (chckbxItalico.isSelected() && chckbxNegrito.isSelected()) {
			fonte = new Font("Tahoma", Font.BOLD + Font.ITALIC, 14);
		}else if (chckbxNegrito.isSelected()) {
			fonte = new Font("Tahoma", Font.BOLD,14);
		}else if (chckbxItalico.isSelected()) {
			fonte = new Font("Tahoma", Font.ITALIC, 14);
		}else{
			fonte = new Font("Tahoma", Font.PLAIN, 14);
		}
		tftexto.setFont(fonte);
		
	  }
	}
}
