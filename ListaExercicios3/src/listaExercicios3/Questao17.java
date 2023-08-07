import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número do dia de nascimento: ");
		int dia = scanner.nextInt();

		System.out.print("Digite o número do mês de nascimento: ");
		int mes = scanner.nextInt();

		// Verificar a validade da data
		if (mes >= 1 && mes <= 12) {
			int maxDias = obterMaxDiasMes(mes);

			if (dia >= 1 && dia <= maxDias) {
				String nomeMes = obterNomeMes(mes);
				String trimestre = obterTrimestre(mes);
				 String signo = obterSigno(dia, mes);
				

				System.out.println("Data de aniversário válida!");
				System.out.println("Mês: " + nomeMes);
				System.out.println("Trimestre: " + trimestre);
				System.out.println("Signo: " + signo);
			} else {
				System.out.println("Dia de nascimento inválido para o mês selecionado.");
			}
		} else {
			System.out.println("Mês de nascimento inválido.");
		}

		scanner.close();
	}

	// Função para obter o nome do mês
	public static String obterNomeMes(int mes) {
		String[] nomesMeses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" };
		return nomesMeses[mes - 1];
	}

	// Função para obter o número máximo de dias em um mês
	public static int obterMaxDiasMes(int mes) {
		int[] maxDias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return maxDias[mes - 1];
	}

	// Função para obter o trimestre do ano
	public static String obterTrimestre(int mes) {
		if (mes >= 1 && mes <= 3) {
			return "1º trimestre";
		} else if (mes >= 4 && mes <= 6) {
			return "2º trimestre";
		} else if (mes >= 7 && mes <= 9) {
			return "3º trimestre";
		} else {
			return "4º trimestre";
		}
	}

	public static String obterSigno(int dia, int mes) {
		if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
			return "Áries";
		} else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
			return "Touro";
		} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
			return "Gêmeos";
		} else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
			return "Câncer";
		} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
			return "Leão";
		} else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
			return "Virgem";
		} else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
			return "Libra";
		} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
			return "Escorpião";
		} else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
			return "Sagitário";
		} else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
			return "Capricórnio";
		} else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
			return "Aquário";
		} else {
			return "Peixes";
		}
	}
}