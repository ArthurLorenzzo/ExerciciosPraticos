package listaExercicios3;

import java.util.Scanner;

public class Questao26 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro horário (HH:MM:SS): ");
        String horario1 = scanner.nextLine();

        System.out.print("Digite o segundo horário (HH:MM:SS): ");
        String horario2 = scanner.nextLine();

        int segundosHorario1 = calcularSegundos(horario1);
        int segundosHorario2 = calcularSegundos(horario2);

        int diferencaEmSegundos = Math.abs(segundosHorario1 - segundosHorario2);

        System.out.println("Diferença entre os horários em segundos: " + diferencaEmSegundos);

        scanner.close();
    }

    public static int calcularSegundos(String horario) {
        String[] partes = horario.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);

        return horas * 3600 + minutos * 60 + segundos;
    }

}
