/**
 * 
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author joão
 *
 */
public class LerPerguntas {
	public ListaLigada ll1=new ListaLigada();
	
	public void leArquivos(){
		StringBuffer sbDir=new StringBuffer();
		sbDir.append("src");
		sbDir.append(File.separator);
		sbDir.append("Arquivos");
		sbDir.append(File.separator);
		
		File dir= new File(sbDir.toString());
		
		if(dir.exists()){
			String nomeArquivo="teste.txt";
			File arquivo = new File(sbDir.toString(),nomeArquivo);
			
			if(arquivo.exists()){
				try {
					FileInputStream abreArquivo= new FileInputStream(arquivo);
					InputStreamReader leFluxo=new InputStreamReader(abreArquivo);
					BufferedReader buffer= new BufferedReader(leFluxo);
					try {
						String linha = buffer.readLine();
						Perguntas dados;
						
						while(linha!=null){							
							String s[]=linha.split("\\*");
							dados=new Perguntas(s);
							ll1.adicionaInicio(dados);
							linha=buffer.readLine();			
						}
					System.out.println(ll1.mostra());
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
