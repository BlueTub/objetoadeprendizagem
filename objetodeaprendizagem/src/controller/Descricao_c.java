package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Entity.Descricao_e;

public class Descricao_c {
	/**
	 * @author Hury
	 */
	public void le(Descricao_e[] desc) throws IOException {

		String fileName = "src\\Arquivos\\Descricao.txt"; //seleciona o arquivo no diretorio
		BufferedReader ler = new BufferedReader(new FileReader(fileName));
		for(int i=0; i<3; i++){                          //carrega 3 objetos com seus respectivos dados
			desc[i].setDescricao_int(ler.readLine());						
			desc[i].setDescricao_res(ler.readLine()) ;
			desc[i].caract = ler.readLine();
			desc[i].uso= ler.readLine();
			desc[i].dificuldade= ler.readLine();
		}
		ler.close();                                      //fecha o buffer

	}
	public void TestaTexto(Descricao_e[] descricao){ //imprimi o conteudo de todos objetos no console
		for(int i=0; i<3;i++){
	        System.out.println(descricao[i].descricao_int+"\n"+descricao[i].descricao_res+"\n"+descricao[i].caract+"\n"+descricao[i].uso+"\n"+descricao[i].dificuldade);
		}
	}

}
