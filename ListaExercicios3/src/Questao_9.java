package lista_3;

import java.util.Scanner;

public class Questao_9 {
	//Verifique se o usuário é maior de idade ou não.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Usuário, informe sua idade! ");
		int idade = sc.nextInt();

		if(idade >= 18) {
			System.out.println("Você é maior já de idade!");
		}else {
			System.out.println("Você ainda é menor de idade! ");
		}
		sc.close();
	}
}
