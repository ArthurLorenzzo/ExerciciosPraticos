package listaExercicios3;

import java.util.Scanner;

public class Questao_57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira data (dia m�s ano): ");
        int diaInicio = scan.nextInt();
        int mesInicio = scan.nextInt();
        int anoInicio = scan.nextInt();

        System.out.print("Digite a segunda data (dia m�s ano): ");
        int diaFim = scan.nextInt();
        int mesFim = scan.nextInt();
        int anoFim = scan.nextInt();

        System.out.println("Datas entre " + diaInicio + "/" + mesInicio + "/" + anoInicio +
                           " e " + diaFim + "/" + mesFim + "/" + anoFim + ":");

        for (int ano = anoInicio; ano <= anoFim; ano++) {
            int mesInicial = (ano == anoInicio) ? mesInicio : 1;
            int mesFinal = (ano == anoFim) ? mesFim : 12;

            for (int mes = mesInicial; mes <= mesFinal; mes++) {
                int diaInicial = (ano == anoInicio && mes == mesInicio) ? diaInicio : 1;
                int diaFinal = (ano == anoFim && mes == mesFim) ? diaFim : diasNoMes(mes, ano);

                for (int dia = diaInicial; dia <= diaFinal; dia++) {
                    System.out.println(dia + "/" + mes + "/" + ano);
                }
            }
        }

        scan.close();
    }

   
    public static int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }
}
