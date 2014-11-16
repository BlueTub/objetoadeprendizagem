/**
 * 
 */
package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Entity.Configuracao_e;

/**
 * Classe para gravar um arquivo txt com a personalização do usuario
 * 
 * @author joão
 * @version 17/10
 */
public class Configuracao {
	private int OpcEstilo;
	private String look;
	private int Fonte;
	private String lingua;

	/**
	 * Construtor
	 * 
	 * @param OpcEstilo
	 *            recebe o indice do ComboBox
	 * @param Fonte
	 *            recebe a seleção do usuário
	 */
	public Configuracao(int OpcEstilo, int Fonte, String lingua) {
		this.OpcEstilo = OpcEstilo;
		this.Fonte = Fonte;
		this.lingua = lingua;
	}

	/**
	 * Método para definir o estilo do usuario
	 */
	private void Estilos(){		//org.jvnet.substance.SubstanceLookAndFeel
		switch (OpcEstilo) {
		case 0:
			look = "javax.swing.plaf.metal.MetalLookAndFeel";
			break;
		case 1:
			look = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
			break;
		case 2:
			look = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
			break;
		case 3:
			look = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
			break;
		case 4:
			look = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
		}
	}

	/**
	 * Método para gerar um aquivo txt com as configurações do usuário
	 */
	public void geraArquivo() {
		Estilos();
		Configuracao_e dados = new Configuracao_e();
		dados.setFonte(Fonte);
		dados.setLook(look);
		dados.setLinguagem(lingua);
		StringBuffer sb = new StringBuffer();
		sb.append("src");
		sb.append(File.separator);
		sb.append("Arquivos");
		sb.append(File.separator);

		File dir = new File(sb.toString());

		if (dir.isDirectory()) {
			String nomeArquivo = "Config.txt";
			File arquivo = new File(sb.toString(), nomeArquivo);
			try {
				arquivo.createNewFile();
				FileWriter abreArquivo = new FileWriter(arquivo);
				PrintWriter escreveArquivo = new PrintWriter(abreArquivo);
				StringBuffer sbTexto = new StringBuffer();
				sbTexto.append(dados.getFonte());
				sbTexto.append("\r\n");
				sbTexto.append(dados.getLook());
				sbTexto.append("\r\n");
				sbTexto.append(dados.getLinguagem());
				escreveArquivo.write(sbTexto.toString());
				escreveArquivo.flush();
				escreveArquivo.close();
				abreArquivo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
