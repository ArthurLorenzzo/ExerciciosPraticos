package listaExercicios3;

import java.util.Scanner;

public class Questao_59 {
	//Exiba as 10 tabuadas (de 1 a 10).

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número para calcular a tabuada: ");
		int num = sc.nextInt();

		System.out.print("\nEscolha um número para selecionar a operação desejada:\n"
				+"\n1 - Multiplicação"
				+"\n2 - Adição"
				+"\n3 - Subtração"
				+"\n4 - Divisão: ");
		
		int op = sc.nextInt();

		switch (op) {
		case 1:
			System.out.println("Tabuada de Multiplicação do " + num + ":");
			System.out.println("--------------------");
			for (int multiplicacao = 1; multiplicacao <= 10; multiplicacao++) {
				int resultado = num * multiplicacao;
				System.out.println(num + " x " + multiplicacao + " = " + resultado);
			}
			break;
		case 2:
			System.out.println("Tabuada de Adição do " + num + ":");
			System.out.println("--------------------");
			for (int adicao = 1; adicao <= 10; adicao++) {
				int resultado = num + adicao;
				System.out.println(num + " + " + adicao + " = " + resultado);
			}
			break;
		case 3:
			System.out.println("Tabuada de Subtração do " + num + ":");
			System.out.println("--------------------");
			for (int subtracao = 1; subtracao <= 10; subtracao++) {
				int resultado = num - subtracao;
				System.out.println(num + " - " + subtracao + " = " + resultado);
			}
			break;
		case 4:
			System.out.println("Tabuada de Divisão do " + num + ":");
			System.out.println("--------------------");
			for (int divisao = 1; divisao <= 10; divisao++) {
				int resultado =  num / divisao;
				System.out.println(num + " / " + divisao + " = " + resultado);
			}
			break;
		default:
			System.out.println("Operação inválida. Escolha um número entre 1 e 4.");
			break;
		}

		sc.close();
	}
}