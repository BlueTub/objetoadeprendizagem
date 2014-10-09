package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class LerRespostas {
		
		public Pilha p1 = new Pilha();
		
		public void leArquivos() {
			StringBuffer sbDir=new StringBuffer();
			sbDir.append("src");
			sbDir.append(File.separator);
			sbDir.append("Arquivos");
			sbDir.append(File.separator);
			
			File dir= new File(sbDir.toString());
			
			if(dir.exists()){
				String nomeArquivo="respostasPilha.txt";
				File arquivo = new File(sbDir.toString(),nomeArquivo);
				
				if(arquivo.exists()){
					try {
						FileInputStream abreArquivo= new FileInputStream(arquivo);
						InputStreamReader leFluxo=new InputStreamReader(abreArquivo);
						BufferedReader buffer= new BufferedReader(leFluxo);

						try{
							String linha = buffer.readLine();
							RespostasPilha dados;
							
							while(linha!=null){							
								String s[]=linha.split("\\*");
								dados = new RespostasPilha(s);
								p1.empilha(dados.getResp());
								linha=buffer.readLine();			
						    }
								System.out.println(p1.mostra());						
						
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

