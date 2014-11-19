package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entity.Descricao_e;


/**
 * Classe que carrega na memoria o conteúdo do arquivo descricao.txt
 * 
 * @author Hury
 */
public class Descricao_c {
	/**
	 * 
	 * @param desc
	 *            Entidade descrição
	 * @throws IOException
	 *             Rxceções de arquivo
	 */
	public void le(Descricao_e[] desc) throws IOException {

		String fileName = "src\\Arquivos\\Descricao.txt"; // seleciona o arquivo
															// no diretorio
		BufferedReader ler = new BufferedReader(new FileReader(fileName));
		for (int i = 0; i < 4; i++) { // carrega 4 objetos com seus respectivos
										// dados
			desc[i].setTipo(Integer.parseInt(ler.readLine()));
			desc[i].setDescricao_int(ler.readLine());
			desc[i].setDescricao_res(ler.readLine());
			desc[i].setCaract(ler.readLine());
			desc[i].setUso(ler.readLine());
			desc[i].setDificult(ler.readLine());
		}
		ler.close(); // fecha o buffer

	}



}
