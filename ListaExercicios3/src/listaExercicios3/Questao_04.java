package listaExercicios3;

import java.util.Scanner;

public class Questao_04 {
	//Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Prezado aluno, informe sua primeira nota: ");
		double nota1 = sc.nextDouble();

		System.out.println("Prezado aluno, informe sua segunda nota: ");
		double nota2 = sc.nextDouble();

		System.out.println("Prezado aluno, informe sua terceira nota: ");
		double nota3 = sc.nextDouble();

		System.out.println("Prezado aluno, informe sua quarta nota: ");
		double nota4 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4)/4;
		if(media > 6) {
			System.out.println("PARABÊNS!!! Você foi APROVADO!");
		}else if(media == 6) {
			System.out.println("Foi por pouco, sua média foi: "+ media);
		}else {
			System.out.println("Sua média é:"+ media+" sinto muito, você está REPROVADO!"
					+ "\nEstude mais! Até a PRÓXIMA");	

		}
		sc.close();
	}
}
