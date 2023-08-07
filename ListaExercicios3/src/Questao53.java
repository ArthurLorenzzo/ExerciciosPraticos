import java.util.Scanner;

public class Questao53 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for the multiplication table: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        sc.close();
    }
}
