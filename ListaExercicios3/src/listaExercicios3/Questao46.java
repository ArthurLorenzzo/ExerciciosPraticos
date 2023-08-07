package listaExercicios3;

import java.util.Scanner;

public class Questao46 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int homensMaiores = 0;
        int mulheresMaiores = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o sexo da pessoa " + i + " (M/F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (sexo == 'M' || sexo == 'm') {
                if (idade >= 18) {
                    homensMaiores++;
                }
            } else if (sexo == 'F' || sexo == 'f') {
                if (idade >= 18) {
                    mulheresMaiores++;
                }
            } else {
                System.out.println("Sexo inválido.");
                i--;
            }
        }

        System.out.println("Quantidade de homens maiores de idade: " + homensMaiores);
        System.out.println("Quantidade de mulheres maiores de idade: " + mulheresMaiores);

        scanner.close();
    }
	
}
