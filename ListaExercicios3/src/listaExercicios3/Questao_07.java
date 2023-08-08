package listaExercicios3;

import java.util.Scanner;
public class Questao_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Qual o valor da conta? R$ ");
		double valor = scan.nextDouble();
		
		System.out.println("Sua conta deu R$ " + valor + " e comiss�o do gar�om � de R$" + (valor / 10));
		
		scan.close();
		

	}

}
