package listaExercicios3;

import java.util.Scanner;

public class Questao_55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char tipoLigacao;
        int minutos;
        double saldo = 100.0;
        double valorMinutoExcedente = 0.65;
        double valorMinutoVaiVai = 0.20;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o tipo de ligação (‘o’ = outras operadoras, ‘v’ = Vai-Vai, ‘f’ = telefone fixo): ");
            tipoLigacao = scanner.next().charAt(0);

            if (tipoLigacao == 'o' || tipoLigacao == 'v' || tipoLigacao == 'f') {
                System.out.print("Digite a quantidade de minutos: ");
                minutos = scanner.nextInt();

                double valorAPagar = 0.0;

                if (tipoLigacao == 'o') {
                    valorAPagar = minutos > saldo ? (minutos - saldo) * valorMinutoExcedente : 0;
                } else if (tipoLigacao == 'v') {
                    valorAPagar = minutos > saldo ? (minutos - saldo) * valorMinutoVaiVai : 0;
                } else {
                    valorAPagar = minutos > saldo ? (minutos - saldo) * valorMinutoExcedente * 0.5 : 0;
                }

                saldo -= minutos;

                System.out.println("Saldo restante: " + saldo);
                System.out.println("Valor a pagar: " + valorAPagar);
            } else {
                System.out.println("Tipo de ligação inválido.");
            }

            System.out.print("Deseja realizar mais ligações? (S/N): ");
            char resposta = scanner.next().charAt(0);
            if (resposta == 'N' || resposta == 'n') {
                continuar = false;
            }
        }

        System.out.println("Programa encerrado.");
    }
}