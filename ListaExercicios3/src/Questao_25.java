import java.time.LocalTime;
import java.util.Scanner;

public class Questao_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        int horaEntrada = Integer.parseInt(scanner.next());
        System.out.print("Digite os minutos: ");
        int minutoEntrada = Integer.parseInt(scanner.next());
        System.out.print("Digite os segundos: ");
        int segundoEntrada = Integer.parseInt(scanner.next());


        try{
            LocalTime hora = LocalTime.of(horaEntrada, minutoEntrada, segundoEntrada);
            System.out.printf("Horário Válido! %s", hora.toString());
        }catch (Exception e){
            System.out.println("Data inválida!");
        }
    }
}
