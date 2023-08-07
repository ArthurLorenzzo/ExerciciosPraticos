package listaExercicios3;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua data de nascimento: ");
		int dataNascimento = scanner.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = scanner.nextInt();
		
		int idade = anoAtual - dataNascimento;
		
		System.out.println("Sua idade é " + idade);
		
		scanner.close();
		
	}

}
