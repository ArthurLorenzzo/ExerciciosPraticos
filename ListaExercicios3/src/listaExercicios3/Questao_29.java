package listaExercicios3;

import java.util.Scanner;

public class Questao_29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Recebendo as coordenadas dos vértices do retângulo
		System.out.println("Digite as coordenadas do vértice superior esquerdo (x1 y1):");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		System.out.println("Digite as coordenadas do vértice inferior direito (x2 y2):");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		// Verificando o tipo de retângulo
		if (x1 == x2 && y1 == y2) {
			System.out.println("É um ponto.");
			return;
		} else if (x1 == x2) {
			System.out.println("É uma reta vertical.");
			return;
		} else if (y1 == y2) {
			System.out.println("É uma reta horizontal.");
			return;
		} else {
			System.out.println("É um retângulo.");
		}

		// Calcular a área do retângulo
		int altura = Math.abs(y2 - y1);
		int largura = Math.abs(x2 - x1);
		int area = altura * largura;
		System.out.println("Área do retângulo: " + area);

		// Recebe terceiro ponto
		System.out.println("Digite as coordenadas do terceiro ponto (x3 y3):");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();

		// Verifica a posição do terceiro ponto em relação ao retângulo
		if (x3 < x1 && y3 > y2) {
			System.out.println("Acima e à esquerda do retângulo.");
		} else if (x3 > x2 && y3 > y2) {
			System.out.println("Acima e à direita do retângulo.");
		} else if (x3 < x1 && y3 < y1) {
			System.out.println("Embaixo e à esquerda do retângulo.");
		} else if (x3 > x2 && y3 < y1) {
			System.out.println("Embaixo e à direita do retângulo.");
		} else if (x3 < x1 && y3 >= y1 && y3 <= y2) {
			System.out.println("À esquerda do retângulo.");
		} else if (x3 > x2 && y3 >= y1 && y3 <= y2) {
			System.out.println("À direita do retângulo.");
		} else if (x3 >= x1 && x3 <= x2 && y3 > y2) {
			System.out.println("Acima do retângulo.");
		} else if (x3 >= x1 && x3 <= x2 && y3 < y1) {
			System.out.println("Embaixo do retângulo.");
		} else {
			System.out.println("Dentro do retângulo.");
		}

		sc.close();
	}
}