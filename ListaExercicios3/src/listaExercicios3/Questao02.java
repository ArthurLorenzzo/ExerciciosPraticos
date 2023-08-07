import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o salário mínimo atual");
		double salMinimo = scan.nextDouble();
		
		System.out.println("Digite o seu salário atual");
		double salAtual = scan.nextDouble();
		
		System.out.println("O seu salário equivale a " + (salAtual / salMinimo) + " salários mínimos" );

		scan.close();
	}

}
