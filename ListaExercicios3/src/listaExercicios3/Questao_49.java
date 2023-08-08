package listaExercicios3;

public class Questao_49 {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;
        int aux;

        System.out.println("First 50 numbers of the Fibonacci sequence.\n");

        for (int i = 0; i < 50; i++) {
            System.out.print(a + " ");
            aux = a;
            a = a + b;
            b = aux;
        }
    }
}
