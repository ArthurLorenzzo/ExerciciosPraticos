import java.util.Scanner;

/**
 * Questao05
 */
public class Questao05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double debito;
        int quantidadeDeMeses;
        double juros;

        System.out.print("Digite o valor do débito: ");
        debito = Double.parseDouble(scanner.next());
        System.out.print("Digite a quantidade de meses: ");
        quantidadeDeMeses = Integer.parseInt(scanner.next());
        System.out.print("Digite o juros em percentagem (%): ");
        juros = Double.parseDouble(scanner.next());

        double valorFinalDaDivida = debito + (debito * (juros / 100) * quantidadeDeMeses);

        System.out.printf("O valor final da divida é: R$%.2f", valorFinalDaDivida);
    }
}