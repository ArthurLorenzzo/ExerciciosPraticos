package listaExercicios3;

import java.util.Scanner;

public class Questao_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o n�mero do dia de nascimento: ");
		int dia = scanner.nextInt();

		System.out.print("Digite o n�mero do m�s de nascimento: ");
		int mes = scanner.nextInt();

		// Verificar a validade da data
		if (mes >= 1 && mes <= 12) {
			int maxDias = obterMaxDiasMes(mes);

			if (dia >= 1 && dia <= maxDias) {
				String nomeMes = obterNomeMes(mes);
				String trimestre = obterTrimestre(mes);
				 String signo = obterSigno(dia, mes);
				

				System.out.println("Data de anivers�rio v�lida!");
				System.out.println("M�s: " + nomeMes);
				System.out.println("Trimestre: " + trimestre);
				System.out.println("Signo: " + signo);
			} else {
				System.out.println("Dia de nascimento inv�lido para o m�s selecionado.");
			}
		} else {
			System.out.println("M�s de nascimento inv�lido.");
		}

		scanner.close();
	}

	// Fun��o para obter o nome do m�s
	public static String obterNomeMes(int mes) {
		String[] nomesMeses = { "Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" };
		return nomesMeses[mes - 1];
	}

	// Fun��o para obter o n�mero m�ximo de dias em um m�s
	public static int obterMaxDiasMes(int mes) {
		int[] maxDias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return maxDias[mes - 1];
	}

	// Fun��o para obter o trimestre do ano
	public static String obterTrimestre(int mes) {
		if (mes >= 1 && mes <= 3) {
			return "1� trimestre";
		} else if (mes >= 4 && mes <= 6) {
			return "2� trimestre";
		} else if (mes >= 7 && mes <= 9) {
			return "3� trimestre";
		} else {
			return "4� trimestre";
		}
	}

	public static String obterSigno(int dia, int mes) {
		if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
			return "�ries";
		} else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
			return "Touro";
		} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
			return "G�meos";
		} else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
			return "C�ncer";
		} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
			return "Le�o";
		} else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
			return "Virgem";
		} else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
			return "Libra";
		} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
			return "Escorpi�o";
		} else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
			return "Sagit�rio";
		} else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
			return "Capric�rnio";
		} else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
			return "Aqu�rio";
		} else {
			return "Peixes";
		}
	}
}