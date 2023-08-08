package listaExercicios3;

import java.util.Random;
import java.util.Scanner;

public class Questao_41 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número sorteado de 1 a 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSorteado) {
                System.out.println("Dica: O número é menor.");
            } else if (palpite < numeroSorteado) {
                System.out.println("Dica: O número é maior.");
            }
        } while (palpite != numeroSorteado);

        System.out.println("Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativas.");

        scanner.close();
    }

}
