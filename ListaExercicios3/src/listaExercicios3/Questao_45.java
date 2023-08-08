package listaExercicios3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao_45 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> listaDeNumeros = new ArrayList<>();
        System.out.println("Digite uma lista de números separados por espaços:");
        String entrada = scanner.nextLine();
        String[] numerosString = entrada.split(" ");

        for (String numeroStr : numerosString) {
            try {
                double numero = Double.parseDouble(numeroStr);
                listaDeNumeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Número inválido: " + numeroStr);
            }
        }

        listaDeNumeros.sort(Double::compareTo);

        System.out.printf("O maior valor informado foi: %.2f",listaDeNumeros.get(listaDeNumeros.size()-1) );

    }
}
