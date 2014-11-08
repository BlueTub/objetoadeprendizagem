package controller;

import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Classe de manipulação dos elementos da animação da arvore
 * 
 * @author Hury
 * 
 */

public class AnimaArvore extends Thread implements OperacaoAnimacao {
	private int operacao;

	private JLabel lbl_cubo1;
	private JLabel lbl_cubo2;
	private JLabel lbl_cubo3;
	private JLabel lbl_cubo4;
	private JLabel lbl_cubo5;
	private JLabel lbl_cubo6;
	private JLabel lbl_cubo7;

	private JLabel lbl_valor1;
	private JLabel lbl_valor2;
	private JLabel lbl_valor3;
	private JLabel lbl_valor4;
	private JLabel lbl_valor5;
	private JLabel lbl_valor6;
	private JLabel lbl_valor7;

	private JTextField txt_num;
	private int[] arvore;
	private int selecionado;

	boolean primeiro = true;

	public AnimaArvore(int operacao, JLabel lbl_cubo1, JLabel lbl_cubo2,
			JLabel lbl_cubo3, JLabel lbl_cubo4, JLabel lbl_cubo5,
			JLabel lbl_cubo6, JLabel lbl_cubo7, JLabel lbl_valor1,
			JLabel lbl_valor2, JLabel lbl_valor3, JLabel lbl_valor4,
			JLabel lbl_valor5, JLabel lbl_valor6, JLabel lbl_valor7,
			JTextField txt_num, int[] arvore, boolean primeiro, int selecionado) {
		super();
		this.operacao = operacao;
		this.lbl_cubo1 = lbl_cubo1;
		this.lbl_cubo2 = lbl_cubo2;
		this.lbl_cubo3 = lbl_cubo3;
		this.lbl_cubo4 = lbl_cubo4;
		this.lbl_cubo5 = lbl_cubo5;
		this.lbl_cubo6 = lbl_cubo6;
		this.lbl_cubo7 = lbl_cubo7;
		this.lbl_valor1 = lbl_valor1;
		this.lbl_valor2 = lbl_valor2;
		this.lbl_valor3 = lbl_valor3;
		this.lbl_valor4 = lbl_valor4;
		this.lbl_valor5 = lbl_valor5;
		this.lbl_valor6 = lbl_valor6;
		this.lbl_valor7 = lbl_valor7;
		this.txt_num = txt_num;
		this.arvore = arvore;
		this.primeiro = primeiro;
		this.selecionado = selecionado;
	}

	/**
	 * Metodo run da thread
	 */

	public void run() {

		if (operacao == 1) {
			addElemento();
		} else {
			removeElemento();
		}
	}

	/**
	 * Adiciona
	 */
	@Override
	public void addElemento() {

		// arvore 0=raiz/ 1= esquerda1/ 2 = direira1/ 3= esquerda2/ 4= direita2/
		// 5=
		// esquerda3/ 6= direita3

		int rand = Integer.parseInt(txt_num.getText());
		if (verificadupli(rand) == false) {
			if (arvore[0] == 0) {
				add(1);
			} else {
				if (arvore[1] == 0 && arvore[2] == 0) {
					if (rand > arvore[0]) {
						add(3);
					}
					if (rand < arvore[0]) {
						add(2);
					}
				}
				if ((arvore[1] != 0 && arvore[2] == 0)
						|| (arvore[1] == 0 && arvore[2] != 0)) {
					if (arvore[1] != 0) {
						if (rand < arvore[1]) {
							add(4);
						}
						if (rand > arvore[1] && rand > arvore[0]) {
							add(3);
						}
						if (rand > arvore[1] && rand < arvore[0]) {
							add(5);
						}
					}
					if (arvore[2] != 0) {
						if (rand > arvore[2]) {
							add(7);
						}
						if (rand < arvore[2] && rand < arvore[0]) {
							add(2);
						}
						if (rand > arvore[0] && rand < arvore[2]) {
							add(6);
						}
					}
				}
				if (arvore[1] != 0 && arvore[2] != 0) {
					if (rand < arvore[1]) {
						add(4);
					}
					if (rand > arvore[2]) {
						add(7);
					}
					if (rand < arvore[0] && rand > arvore[1]) {
						add(5);
					}
					if (rand > arvore[0] && rand < arvore[2]) {
						add(6);
					}
				}

			}
		} else {
			System.out.println("numero repetido");
		}

	}//

	/**
	 * Adiciona em determinado cubo
	 * 
	 * @param opc
	 */
	private void add(int opc) {
		Rectangle posicao1;
		Rectangle posicao2;
		switch (opc) {
		case 1:
			posicao1 = lbl_valor1.getBounds();
			posicao2 = lbl_cubo1.getBounds();

			posicao1.x = posicao2.x + 15;
			posicao1.y = posicao2.y + 30;

			lbl_valor1.setText(txt_num.getText());
			lbl_valor1.setBounds(posicao1);

			arvore[0] = Integer.parseInt(txt_num.getText());
			lbl_valor1.setVisible(true);
			break;
		case 2:
			posicao1 = lbl_valor2.getBounds();
			posicao2 = lbl_cubo2.getBounds();

			posicao1.x = posicao2.x + 15;
			posicao1.y = posicao2.y + 30;

			lbl_valor2.setText(txt_num.getText());
			lbl_valor2.setBounds(posicao1);

			arvore[1] = Integer.parseInt(txt_num.getText());
			lbl_valor2.setVisible(true);
			break;
		case 3:
			posicao1 = lbl_valor3.getBounds();
			posicao2 = lbl_cubo3.getBounds();

			posicao1.x = posicao2.x + 15;
			posicao1.y = posicao2.y + 30;

			lbl_valor3.setText(txt_num.getText());
			lbl_valor3.setBounds(posicao1);

			arvore[2] = Integer.parseInt(txt_num.getText());
			lbl_valor3.setVisible(true);
			break;
		case 4:
			posicao1 = lbl_valor4.getBounds();
			posicao2 = lbl_cubo4.getBounds();

			posicao1.x = posicao2.x + 15;
			posicao1.y = posicao2.y + 30;

			lbl_valor4.setText(txt_num.getText());
			lbl_valor4.setBounds(posicao1);

			arvore[3] = Integer.parseInt(txt_num.getText());
			lbl_valor4.setVisible(true);
			break;
		case 5:
			posicao1 = lbl_valor5.getBounds();
			posicao2 = lbl_cubo5.getBounds();

			posicao1.x = posicao2.x + 15;
			posicao1.y = posicao2.y + 30;

			lbl_valor5.setText(txt_num.getText());
			lbl_valor5.setBounds(posicao1);

			arvore[4] = Integer.parseInt(txt_num.getText());
			lbl_valor5.setVisible(true);
			break;
		case 6:
			posicao1 = lbl_valor6.getBounds();
			posicao2 = lbl_cubo6.getBounds();

			posicao1.x = posicao2.x + 15;
			posicao1.y = posicao2.y + 30;

			lbl_valor6.setText(txt_num.getText());
			lbl_valor6.setBounds(posicao1);

			arvore[5] = Integer.parseInt(txt_num.getText());
			lbl_valor6.setVisible(true);
			break;
		case 7:
			posicao1 = lbl_valor7.getBounds();
			posicao2 = lbl_cubo7.getBounds();

			posicao1.x = posicao2.x + 15;
			posicao1.y = posicao2.y + 30;

			lbl_valor7.setText(txt_num.getText());
			lbl_valor7.setBounds(posicao1);

			arvore[6] = Integer.parseInt(txt_num.getText());
			lbl_valor7.setVisible(true);
			break;
		default:
			break;
		}

	}

	/**
	 * Verifica se o número em questão está em duplicidade com o conteúdo da
	 * arvore
	 * 
	 * @param rand
	 * @return
	 */
	public boolean verificadupli(int rand) {
		boolean result = false;
		for (int i = 0; i < arvore.length; i++) {
			if (arvore[i] == rand) {
				result = true;
			} else {

			}
		}
		return result;
	}

	/**
	 * remove um elemento selecionado
	 */

	@Override
	public void removeElemento() {
	//	int aux;
		// int removido;
		switch (selecionado) {
		case 1:
			if (arvore[0] != 0 && (arvore[1] == 0 && arvore[2] == 0)) {
				arvore[0] = 0;
				lbl_valor1.setVisible(false);
			} else if (arvore[1] != 0 && arvore[2] != 0) {

				if ((arvore[3] == 0 && arvore[4] == 0 && arvore[5] == 0 && arvore[6] == 0)
						|| (arvore[3] != 0 && arvore[4] != 0 && arvore[5] == 0 && arvore[6] == 0)
						|| (arvore[3] != 0 && arvore[4] == 0 && arvore[5] == 0 && arvore[6] == 0)
						|| (arvore[3] == 0 && arvore[4] != 0 && arvore[5] == 0 && arvore[6] == 0)) {

					arvore[0] = arvore[2];
					arvore[2] = 0;
					lbl_valor1.setText(Integer.toString(arvore[0]));
					lbl_valor3.setVisible(false);
				} else if ((arvore[3] != 0 && arvore[4] != 0 && arvore[5] != 0 && arvore[6] != 0)
						|| (arvore[3] == 0 && arvore[4] == 0 && arvore[5] != 0 && arvore[6] == 0)
						|| (arvore[3] != 0 && arvore[4] == 0 && arvore[5] != 0 && arvore[6] != 0)
						|| (arvore[3] == 0 && arvore[4] != 0 && arvore[5] != 0 && arvore[6] != 0)
						|| (arvore[3] != 0 && arvore[4] == 0 && arvore[5] != 0 && arvore[6] == 0)
						|| (arvore[3] != 0 && arvore[4] != 0 && arvore[5] != 0 && arvore[6] == 0)
						|| (arvore[3] == 0 && arvore[4] != 0 && arvore[5] != 0 && arvore[6] == 0)
						|| (arvore[3] == 0 && arvore[4] == 0 && arvore[5] != 0 && arvore[6] != 0)) {
					arvore[0] = arvore[5];
					arvore[5] = 0;
					lbl_valor1.setText(Integer.toString(arvore[0]));
					lbl_valor6.setVisible(false);

				} else if ((arvore[3] != 0 && arvore[4] != 0 && arvore[5] == 0 && arvore[6] != 0)
						|| (arvore[3] != 0 && arvore[4] == 0 && arvore[5] == 0 && arvore[6] != 0)
						|| (arvore[3] == 0 && arvore[4] != 0 && arvore[5] == 0 && arvore[6] != 0)
						|| (arvore[3] == 0 && arvore[4] == 0 && arvore[5] == 0 && arvore[6] != 0)) {
					arvore[0] = arvore[2];
					arvore[2] = arvore[6];
					arvore[6] = 0;

					lbl_valor1.setText(Integer.toString(arvore[0]));
					lbl_valor3.setText(Integer.toString(arvore[2]));
					lbl_valor7.setVisible(false);
				}

			} else if (arvore[1] != 0 && arvore[2] == 0) {

				if (arvore[3] == 0 && arvore[4] == 0) {
					arvore[0] = arvore[1];
					arvore[1] = 0;
					lbl_valor1.setText(Integer.toString(arvore[0]));
					lbl_valor2.setVisible(false);

				} else if ((arvore[3] != 0 && arvore[4] != 0)
						|| (arvore[3] == 0 && arvore[4] != 0)) {
					arvore[0] = arvore[4];
					arvore[4] = 0;
					lbl_valor1.setText(Integer.toString(arvore[0]));
					lbl_valor5.setVisible(false);

				} else if (arvore[3] != 0 && arvore[4] == 0) {
					arvore[0] = arvore[1];
					arvore[1] = arvore[3];
					arvore[3] = 0;

					lbl_valor1.setText(Integer.toString(arvore[0]));
					lbl_valor2.setText(Integer.toString(arvore[1]));
					lbl_valor4.setVisible(false);

				}
			} else if (arvore[1] == 0 && arvore[2] != 0) {
				arvore[0] = arvore[2];
				arvore[2] = 0;
				lbl_valor1.setText(Integer.toString(arvore[0]));
				lbl_valor3.setVisible(false);
			}

			break;
		case 2:

			if (arvore[3] != 0 && arvore[4] != 0) {
				arvore[1] = arvore[4];
				arvore[4] = 0;
				lbl_valor2.setText(Integer.toString(arvore[1]));
				lbl_valor5.setVisible(false);
			} else if (arvore[3] != 0 && arvore[4] == 0) {
				arvore[1] = arvore[3];
				arvore[3] = 0;
				lbl_valor2.setText(Integer.toString(arvore[1]));
				lbl_valor4.setVisible(false);
			} else if (arvore[3] == 0 && arvore[4] != 0) {
				arvore[1] = arvore[4];
				arvore[4] = 0;
				lbl_valor2.setText(Integer.toString(arvore[1]));
				lbl_valor5.setVisible(false);
			} else if (arvore[3] == 0 && arvore[4] == 0) {
				arvore[1] = 0;
				lbl_valor2.setVisible(false);
			}

			break;
		case 3:
			if (arvore[5] != 0 && arvore[6] != 0) {
				arvore[2] = arvore[6];
				arvore[6] = 0;
				lbl_valor3.setText(Integer.toString(arvore[2]));
				lbl_valor7.setVisible(false);
			} else if (arvore[5] != 0 && arvore[6] == 0) {
				arvore[2] = arvore[5];
				arvore[5] = 0;
				lbl_valor3.setText(Integer.toString(arvore[2]));
				lbl_valor6.setVisible(false);
			} else if (arvore[5] == 0 && arvore[6] != 0) {
				arvore[2] = arvore[6];
				arvore[6] = 0;
				lbl_valor3.setText(Integer.toString(arvore[2]));
				lbl_valor7.setVisible(false);
			} else if (arvore[5] == 0 && arvore[6] == 0) {
				arvore[2] = 0;
				lbl_valor3.setVisible(false);
			}

			break;
		case 4:
			arvore[3] = 0;
			lbl_valor4.setVisible(false);
			break;
		case 5:
			arvore[4] = 0;
			lbl_valor5.setVisible(false);
			break;
		case 6:
			arvore[5] = 0;
			lbl_valor6.setVisible(false);
			break;
		case 7:
			arvore[6] = 0;
			lbl_valor7.setVisible(false);
			break;
		default:
			break;
		}

	}
}
