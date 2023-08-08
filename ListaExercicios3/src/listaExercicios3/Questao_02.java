package listaExercicios3;

import java.util.Scanner;

public class Questao_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o sal�rio m�nimo atual");
		double salMinimo = scan.nextDouble();
		
		System.out.println("Digite o seu sal�rio atual");
		double salAtual = scan.nextDouble();
		
		System.out.println("O seu sal�rio equivale a " + (salAtual / salMinimo) + " sal�rios m�nimos" );

		scan.close();
	}

}
