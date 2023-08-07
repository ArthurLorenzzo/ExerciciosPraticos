import java.util.Scanner;

public class Questao27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();

		System.out.println("Digite o terceiro número: ");
		int num3 = scan.nextInt();

		if (num1 == num2 && num2 == num3) {
			System.out.println("Os três números são iguais.");
		} else {
			int maiorNumero = encontrarMaiorNumero(num1, num2, num3);
			System.out.println("O maior número é: " + maiorNumero);
		}

		scan.close();
	}

	public static int encontrarMaiorNumero(int a, int b, int c) {
		int maior = a;
		if (b > maior) {
			maior = b;
		}
		if (c > maior) {
			maior = c;
		}
		return maior;
	}

}