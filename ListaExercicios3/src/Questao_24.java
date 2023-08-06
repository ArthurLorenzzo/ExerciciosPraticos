package lista_3;

public class Questao_24 {

	public static boolean AnoBissexto(int ano) {
		return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	}

	public static boolean ValidaData(int dia, int mes, int ano) {
		if (ano <= 0) {
			return false;
		}
		if (mes < 1 || mes > 12) {
			return false;
		}
		if (dia < 1) {
			return false;
		}
		switch (mes) {
		case 2: // Fevereiro
			if (AnoBissexto(ano)) {
				return dia <= 29;
			} else {
				return dia <= 28;
			}
		case 4: // Abril
		case 6: // Junho
		case 9: // Setembro
		case 11: // Novembro
			return dia <= 30;
		default:
			return dia <= 31;
		}
	}
	public static void main(String[] args) {
		int dia = 29; int mes = 2; int ano = 2024;

		if (ValidaData(dia, mes, ano)) {
			System.out.println("A data é válida.");
		} else {
			System.out.println("A data é inválida.");
		}
	}
}