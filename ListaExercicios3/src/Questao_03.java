import java.util.Scanner;

public class Questao_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of men in the class: ");
        int men = sc.nextInt();

        System.out.print("Enter the number of woman in the class: ");
        int women = sc.nextInt();

        int total = men + women;

        double percentMen = ((double) men / total) * 100;
        double percentWomen = ((double) women / total) * 100;

        System.out.println("Total students in the class:");
        System.out.printf("Percentage of men: %.2f%%\n", percentMen);
        System.out.printf("Percentage of women: %.2f%%\n", percentWomen);

        sc.close();
    }
}
