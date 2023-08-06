import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();

        if (denominator == 0) {
            System.out.println("Alert! The denominator must be different from 0.");
        }
        else {
            double result = (double) numerator / denominator;
            System.out.println("The real number is: " + result);
        }
    }
}
