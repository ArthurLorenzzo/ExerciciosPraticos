package lista_3;

import java.util.Scanner;

public class Questao_44 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a quantidade de valores: ");
	        int qtdValores = sc.nextInt();

	        int somaValores = 0;

	        for (int i = 1; i <= qtdValores; i++) {
	            System.out.print("Digite o " + i + "º valor: ");
	            int valor = sc.nextInt();
	            somaValores += valor;
	        }

	        double media = somaValores / qtdValores;
	        System.out.println("A média aritmética dos " + qtdValores + " valores é: " + media);

	        sc.close();
	    }
	}