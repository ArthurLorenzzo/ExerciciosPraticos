package listaExercicios3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao_50 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o n-esimo termo procurado da sequencia de Fibonacci: ");
        int termoSolicitado = Integer.parseInt(scanner.next());


        int termoPrimeiroAnterior = 1;
        int termoSegundoAnterior = 1;
        int termoAtual;

        List<Integer> numeros = new ArrayList<>();

        numeros.add(termoSegundoAnterior);
        numeros.add(termoPrimeiroAnterior);


        for (int i = 0; i < (termoSolicitado - 2); i++) {
            termoAtual = termoPrimeiroAnterior + termoSegundoAnterior;
            termoSegundoAnterior = termoPrimeiroAnterior;
            termoPrimeiroAnterior = termoAtual;

            numeros.add(termoAtual);
        }

        System.out.printf("O valor do %d° termo da sequencia de Fibonacci é: %d" ,termoSolicitado , numeros.get(numeros.size()-1));

    }
}
