package listaExercicios3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Questao_54 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar os valores ao usuário
        System.out.print("Informe o valor inicial (em reais): ");
        double vlrInicial = sc.nextDouble();

        System.out.print("Informe o valor final (em reais): ");
        double vlrFinal = sc.nextDouble();

        System.out.print("Informe o incremento (em reais): ");
        double incremento = sc.nextDouble();

        System.out.print("Informe o valor de 1 dólar (em reais): ");
        double vlrDolar = sc.nextDouble();

        // Configurar o formato monetário
        NumberFormat formatoMonetario = NumberFormat.getCurrencyInstance();

        // Exibir a tabela de conversão
        System.out.println("Tabela de conversão de reais para dólares:");
        System.out.println("------------------------------------------");
        System.out.println("Valor em Reais \t Valor em Dólares");

        for (double valor = vlrInicial; valor <= vlrFinal; valor += incremento) {
            double valorEmDolares = valor / vlrDolar;
            System.out.println(formatoMonetario.format(valor) + "\t" + formatoMonetario.format(valorEmDolares));
        }

        sc.close();
    }
}