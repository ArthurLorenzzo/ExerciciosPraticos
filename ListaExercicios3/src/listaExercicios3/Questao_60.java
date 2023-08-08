package listaExercicios3;

import java.util.Scanner;

public class Questao_60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: ");
        double valorDivida = scanner.nextDouble();

        System.out.print("Digite a taxa de correção (em % ao mês): ");
        double taxaCorrecao = scanner.nextDouble() / 100.0;

        System.out.print("Digite a quantidade de anos: ");
        int quantidadeAnos = scanner.nextInt();

        double[][] tabelaEvolucao = new double[quantidadeAnos][12];

        for (int ano = 0; ano < quantidadeAnos; ano++) {
            for (int mes = 0; mes < 12; mes++) {
                if (ano == 0 && mes == 0) {
                    tabelaEvolucao[ano][mes] = valorDivida;
                } else if (ano != 0  && mes == 0 ) {
                    double valorCorrigidoMesAnterior = tabelaEvolucao[(ano - 1)][11];
                    double valorCorrigido = valorCorrigidoMesAnterior * (1 + taxaCorrecao);
                    tabelaEvolucao[ano][mes] = valorCorrigido;
                } else {
                    double valorCorrigidoMesAnterior = tabelaEvolucao[ano][(mes - 1)];
                    double valorCorrigido = valorCorrigidoMesAnterior * (1 + taxaCorrecao);
                    tabelaEvolucao[ano][mes] = valorCorrigido;
                }
            }
        }

        int anoBase = 2007;
        System.out.println("Anos\tJan\t\tFev\t\tMar\t\tAbr\t\tMai\t\tJun\t\tJul\t\tAgo\t\tSet\t\tOut\t\tNov\t\tDez");
        for (int ano = 0; ano < quantidadeAnos; ano++) {
            System.out.print(anoBase + ano + "\t");
            for (int mes = 0; mes < 12; mes++) {
                System.out.printf("%.2f\t", tabelaEvolucao[ano][mes]);
            }
            System.out.println();
        }
    }
}