package listaExercicios3;

import java.util.Scanner;

public class Questao_51 {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Tribonacci a serem exibidos: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Número de termos inválido.");
        } else if (n == 1) {
            System.out.println("1");
        } else if (n == 2) {
            System.out.println("1, 1");
        } else if (n >= 3) {
            System.out.print("1, 1, 2");

            int termo1 = 1;
            int termo2 = 1;
            int termo3 = 2;

            for (int i = 3; i < n; i++) {
                int proximoTermo = termo1 + termo2 + termo3;
                System.out.print(", " + proximoTermo);

                termo1 = termo2;
                termo2 = termo3;
                termo3 = proximoTermo;
            }

            System.out.println();
        }

        scanner.close();
    }
}
