package listaExercicios3;

import java.util.Scanner;

public class Questao_62 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas da pir�mide: ");
		int numLinhas = scanner.nextInt();

		for (int linha = 1; linha <= numLinhas; linha++) {
			for (int num = 1; num <= linha; num++) {
				System.out.print(String.format("%02d ", num));
			}
			System.out.println();

			scanner.close();
		}
	}
}
