package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class LerRespostas {
		
		public Pilha p1 = new Pilha();
		
		public void leArquivos() throws FileNotFoundException{
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
						String linha = buffer.readLine();
						RespostasPilha dados;
							
						while(linha!=null){							
							String s[]=linha.split("\\*");
							dados = new RespostasPilha(s);
							p1.empilha(dados);
							linha=buffer.readLine();			
						    }
						buffer.close();
						leFluxo.close();
						abreArquivo.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}

