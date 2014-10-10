package controller;

import java.io.IOException;

import Entity.Descricao_e;

public class MaeJoana {

	/**
	 * @author Hury
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
        Descricao_e[] descricao = new Descricao_e[3];
        for (int i = 0; i < 3; i++) {
            descricao[i] = new Descricao_e();
        }
        
        Descricao_c metodos = new Descricao_c();
        
        metodos.le(descricao);
        
        System.out.println(descricao[0].descricao_res);

	}

}
