package listaExercicios3;

import java.util.Scanner;

public class Questao28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double n3 = sc.nextDouble();

        double[] numbers = {n1, n2, n3};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Numbers in ascending order: " + numbers[0] +
                ", " + numbers[1] + ", " + numbers[2]);

        sc.close();
    }
}
