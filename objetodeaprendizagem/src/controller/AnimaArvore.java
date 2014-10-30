package controller;

public class AnimaArvore extends Thread implements OperacaoAnimacao {
	private int operacao;

	public AnimaArvore(int opc) {
		this.operacao = opc;
	}

	public void run() {
		if (operacao == 1) {
			addElemento();
		} else {
			removeElemento();
		}
	}

	@Override
	public void addElemento() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeElemento() {
		// TODO Auto-generated method stub

	}

}
