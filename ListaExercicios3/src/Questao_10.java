import java.util.Scanner;

public class Questao_10 {
    public static void main(String[] args) {

        double salarioBruto;
        double salarioLiquido;
        double descontosSalariais;
        double valorDeEmprestimoSolicitado;
        final double LIMITE_DO_BANCO = 0.3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Salário Bruto: ");
        salarioBruto = Double.parseDouble(scanner.next());
        System.out.print("Digite o valor dos descontos do Salário: ");
        descontosSalariais = Double.parseDouble(scanner.next());
        System.out.print("Digite o valor do emprestimo desejado: ");
        valorDeEmprestimoSolicitado = Double.parseDouble(scanner.next());

        salarioLiquido = salarioBruto - descontosSalariais;

        double limitePessoalDeEmprestimo = salarioLiquido * LIMITE_DO_BANCO;

        if (valorDeEmprestimoSolicitado <= limitePessoalDeEmprestimo) {
            System.out.println("É possivel solicitar o emprestimo!");
        } else {
            System.out.println("Não é possivel solicitar o emprestimo!");
        }

    }
}
