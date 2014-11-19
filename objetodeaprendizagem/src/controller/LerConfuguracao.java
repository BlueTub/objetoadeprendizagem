/**
 * 
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import entity.Configuracao_e;


/**
 * Classe para leitara do arquivo Config
 * @author jo�o
 * @ version 17/10
 */
public class LerConfuguracao {
	
	/**
	 * M�todo para ler a configura��o 
	 * @param dados recebe dados
	 * @throws IOException caso n�o encontre o arquivo
	 */
	public void ler(Configuracao_e dados) throws IOException {

		StringBuffer sbDir=new StringBuffer();
		sbDir.append("src");
		sbDir.append(File.separator);
		sbDir.append("Arquivos");
		sbDir.append(File.separator);
		
		File dir= new File(sbDir.toString());
		
		if(dir.exists()){
		sbDir.append("Config.txt");
		BufferedReader ler = new BufferedReader(new FileReader(sbDir.toString()));
		dados.setFonte(Integer.parseInt(ler.readLine()));
		dados.setLook(ler.readLine());
		ler.close();                         
		}
	}
	
}
