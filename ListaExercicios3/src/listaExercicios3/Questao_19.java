package listaExercicios3;

import java.util.Scanner;

public class Questao_19 {

	//Exiba dois números fornecidos pelo usuário em ordem crescente.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número!");
		int num1 = sc.nextInt();

		System.out.println("Informe o segundo número!");
		int num2 = sc.nextInt();

		if(num1 <= num2) {
			System.out.println("Em ordem crescente os números informados são: " + num1+ " e " + num2);
		}else {
			System.out.println("Em ordem crescente os números informados são: " + num2+ " e " + num1);
		}
		sc.close();
	}
}
