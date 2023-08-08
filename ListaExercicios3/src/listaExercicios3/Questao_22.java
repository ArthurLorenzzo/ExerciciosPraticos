package listaExercicios3;

import java.util.Scanner;

public class Questao_22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o n�mero do dia da primeira data de anivers�rio: ");
		int dia1 = scanner.nextInt();

		System.out.print("Digite o n�mero do m�s da primeira data de anivers�rio: ");
		int mes1 = scanner.nextInt();

		System.out.print("Digite o n�mero do dia da segunda data de anivers�rio: ");
		int dia2 = scanner.nextInt();

		System.out.print("Digite o n�mero do m�s da segunda data de anivers�rio: ");
		int mes2 = scanner.nextInt();

		if (dia1 == dia2 && mes1 == mes2) {
			System.out.println("As datas de anivers�rio s�o iguais.");
		} else {
			System.out.println("As datas de anivers�rio n�o s�o iguais.");
		}

		scanner.close();
	}

}
