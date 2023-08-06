package lista_3;

import java.util.Scanner;

public class Questao_39 {
	//Verifique se um número é perfeito, ou seja, se a soma dos seus divisores (exceto o próprionúmero) é igual a ele mesmo.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para verificar se ele é perfeito!");
		int num = sc.nextInt();

		int somaDivisores = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				somaDivisores += i;
			}
		}

		if (somaDivisores == num) {
			System.out.println(num + " é um número perfeito.");
		} else {
			System.out.println(num + " não é um número perfeito.");
		}

		sc.close();
	}
}