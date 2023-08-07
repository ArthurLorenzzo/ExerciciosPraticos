package listaExercicios3;

import java.util.Scanner;

public class Questao36 {

		public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int numero2 = scanner.nextInt();

	        System.out.println("Números ímpares entre " + numero1 + " e " + numero2 + ":");

	        for (int i = Math.min(numero1, numero2) + 1; i < Math.max(numero1, numero2); i++) {
	            if (i % 2 != 0) {
	                System.out.println(i);
	            }
	        }

	        scanner.close();

		}

}
