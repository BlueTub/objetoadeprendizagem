/**
 * 
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import Entity.Configuracao_e;

/**
 * Classe para leitara do arquivo Config
 * @author joão
 * @ version 17/10
 */
public class LerConfuguracao {
	
	
	public void le(Configuracao_e dados) throws IOException {

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
