package listaExercicios3;

import java.util.Scanner;

public class Questao_37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um n�mero inteiro n�o negativo: ");
        int numero = scan.nextInt();
        
        if (numero < 0) {
            System.out.println("O n�mero deve ser maior que 0.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " �: " + fatorial);
        }
        
        scan.close();
    }
    
    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
