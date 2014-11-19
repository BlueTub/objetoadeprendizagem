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

import entity.Perguntas;


/**
 * Classe que ira ler as perguntas do arquivo txt
 * @author joão
 *
 */
public class LerPerguntas {
	
	public ListaLigada ll1=new ListaLigada();
	/**
	 * Método para ler o arquivo txt é colocar os dados em uma lista ligada
	 */
	public void leArquivos(String caminho){
		StringBuffer sbDir=new StringBuffer();
		sbDir.append("src");
		sbDir.append(File.separator);
		sbDir.append("Arquivos");
		sbDir.append(File.separator);
		
		File dir= new File(sbDir.toString());
		
		if(dir.exists()){

			File arquivo = new File(sbDir.toString(),caminho);
			
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
							dados = new Perguntas(s);
							ll1.adicionaInicio(dados);
							linha=buffer.readLine();			
						}
						buffer.close();
						leFluxo.close();
						abreArquivo.close();
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
