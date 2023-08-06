package lista_3;

import java.util.Scanner;

public class Questao_64 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informar a quantidade de triângulos: ");
		int qtdtriangulos = sc.nextInt();

		for (int i = 1; i <= qtdtriangulos; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= j; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}