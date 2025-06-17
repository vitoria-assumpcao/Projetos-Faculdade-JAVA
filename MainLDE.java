package lde;

import java.util.Scanner;

public class MainLDE {

	public static void main(String[] args) {

		int escolha, valor;
		Scanner leitura = new Scanner(System.in);
		LDE lde = new LDE();

		while (true) {
			System.out.println("---------------------------------------");
			System.out.println("Por favor, escolha uma opção:          |");
			System.out.println("                                       |");
			System.out.println("1- Inserir um nodo:                    |");
			System.out.println("2- Remover um nodo:                    |");
			System.out.println("3- Imprimir todos os valores da lista: |");
			System.out.println("4- Pesquise um valor:                  |");
			System.out.println("0- Sair.                               |");
			System.out.println("---------------------------------------");

			escolha = leitura.nextInt();

			switch (escolha) {

			case 1:
				System.out.println("Informe o valor para inserir:");
				valor = leitura.nextInt();
				lde.insereValor(valor);
				
				break;
			case 2:
				System.out.println("Informe o valor para remover: ");
				valor = leitura.nextInt();
				lde.removeValor(valor);
				break;
			case 3:
				lde.imprime();
				break;
			case 4:
				System.out.println("Informe o valor para ser pesquisado:");
				valor = leitura.nextInt();
				lde.pesquisa(valor);
				break;
			case 0:
				System.out.println("Saindo...");
				return;

			default:
				System.out.println("Opção inválida.");

			}

		}
	}

}
