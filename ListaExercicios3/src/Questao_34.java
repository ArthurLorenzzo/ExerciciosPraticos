package lista_3;

import java.util.Random;

public class Questao_34 {
//Exiba 50 números sorteados de 1 a 100 para o usuário.
	public static void main(String[] args) {
		Random random = new Random();

		System.out.println("De 1 à 100 os  seus 50 números sorteados são:\n");

		for (int i = 1; i <= 50; i++) {
			int numSorteado = random.nextInt(100) + 1; 
			System.out.print(numSorteado + " ");
		}
		System.out.println(); 
	}
}