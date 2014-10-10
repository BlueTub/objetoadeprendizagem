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

		String fileName = "Descricao.txt";
		BufferedReader ler = new BufferedReader(new FileReader(fileName));
		desc[0].setDescricao_res(ler.readLine());

		ler.close();

	}

}
