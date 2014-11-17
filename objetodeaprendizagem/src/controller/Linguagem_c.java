package controller;

import java.io.File;
import javax.swing.JOptionPane;

/**
 * Classe contém os metodos para configuração de linguagem
 * 
 * @author Hury
 * 
 */
public class Linguagem_c {

	public File[] diretorio() {

		File[] vetorArquivos = null;
		
		StringBuffer sbDir = new StringBuffer();
		sbDir.append("src");
		sbDir.append(File.separator);
		sbDir.append("language");

		File dir = new File(sbDir.toString());
		if (dir.isDirectory()) {
			vetorArquivos = dir.listFiles();
			for (File f : vetorArquivos) {
				System.out.println(f.getName());
			}
		}
		return vetorArquivos;
	}

	public int qtdeDir() {
		int qtde = 0;
		StringBuffer sbDir = new StringBuffer();
		sbDir.append("src");
		sbDir.append(File.separator);
		sbDir.append("language");

		File dir = new File(sbDir.toString());
		if (dir.isDirectory()) {
			File[] vetorArquivos = dir.listFiles();
			qtde = vetorArquivos.length;
		} else {
			JOptionPane.showMessageDialog(null,
					"Diretorio de linguagens não encontrado!");
		}
		return qtde;
	}

	public void carrega() {

	}

}
