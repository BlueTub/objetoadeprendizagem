package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class JF_Splash extends JFrame {

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
	
	public void Carrega(final JProgressBar barra,final JLabel lbltexto){
        new Thread(){    
      
        public void run(){
        for(int i=0;i<=100;i++){
            barra.setValue(i);
            try {
                Thread.sleep(18);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            if(barra.getValue()<=40){
                lbltexto.setText("Carregando componentes");
            }else {
                if(barra.getValue()<=80){
                    lbltexto.setText("Carregando interface");
                }else{
                    lbltexto.setText("Carregando sistema");
                }
            }  
        }
        JF_Splash.this.dispose();
        Tela tela=new Tela();
        tela.setVisible(true);
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
		this.setLocationRelativeTo(null);
		
		JProgressBar barra = new JProgressBar();
		barra.setFont(new Font("Tahoma", Font.PLAIN, 16));
		barra.setForeground(SystemColor.textHighlight);
		barra.setStringPainted(true);
		barra.setBounds(10, 119, 430, 42);
		contentPane.add(barra);
		
		
		JLabel lbltexto = new JLabel("Carregando Sistema");
		lbltexto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbltexto.setBounds(120, 172, 221, 20);
		contentPane.add(lbltexto);
		
		Carrega(barra, lbltexto);
	}
	
}
