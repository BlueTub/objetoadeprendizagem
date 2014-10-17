package controller;

import java.awt.Desktop;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * 
 * @author Hury
 * 
 */

public class AbreDoc {

	/**
	 * @param args
	 */
	public void Testa() {
		System.out.println("ok");
	}

	/**
	 * Metodo para a abertura do arquivo Manual.pdf
	 */
	public void AbreManual() {

		File arquivo = new File("src\\Arquivos\\Manual.pdf");
		if (arquivo.exists()) {
			Desktop desktop = Desktop.getDesktop();
			try {
				boolean abrir = desktop.isSupported(Desktop.Action.OPEN);
				if (abrir) {
					desktop.open(arquivo);
				}

			} catch (IOException e1) {
				JOptionPane
						.showMessageDialog(
								null,
								"<html>Seu computador não possui nenhum leitor de pdf<br>Sugerimos que baixe o Adobe Reader no site <a href = \"http://get.adobe.com/br/reader\">Get.Adobe.com</a></html>");
				e1.printStackTrace();

			}
		}
	}// fim abre manual

}
