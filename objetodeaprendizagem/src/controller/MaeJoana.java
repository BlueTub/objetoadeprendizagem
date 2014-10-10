package controller;

import java.io.IOException;

import Entity.Descricao_e;

public class MaeJoana {

	/**
	 * @author Hury
	 * @throws IOException 
	 */
	
	//Classe de testes favor não apagar
	public static void main(String[] args) throws IOException {
        Descricao_e[] descricao = new Descricao_e[3];
        for (int i = 0; i < 3; i++) {
            descricao[i] = new Descricao_e();
        }
        
        Descricao_c metodos = new Descricao_c();
        
        metodos.le(descricao);
        metodos.TestaTexto(descricao);
        


	}

}
