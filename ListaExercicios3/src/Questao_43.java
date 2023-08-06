package lista_3;

import java.util.Scanner;
//Calcule a média aritmética de 500 valores fornecidos pelo usuário.

public class Questao_43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int qtdValores = 500;
		int somaValores = 0;

		for (int i = 1; i <= qtdValores; i++) {
			System.out.print("Digite o " + i + "º valor: ");
			int valor = sc.nextInt();
			somaValores += valor;
		}

		double media = somaValores / qtdValores;
		System.out.println("A média aritmética dos " + qtdValores + " valores é: " + media);

		sc.close();
	}
}