package listaExercicios3;

import java.util.Scanner;

public class Questao23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name and date of birth for the first person: ");
        String name1 = sc.nextLine();
        int day1 = sc.nextInt();
        int month1 = sc.nextInt();

        System.out.println("Enter the name and date of birth for the second person: ");
        sc.nextLine();
        String name2 = sc.nextLine();
        int day2 = sc.nextInt();
        int month2 = sc.nextInt();

        if (month1 < month2 || month1 == month2 && day1 < day2) {
            System.out.println("The first birthday is for " + name1);
        }
        else if (month1 > month2 || day1 > day2) {
            System.out.println("The first birthday is for " + name2);
        }
        else {
            System.out.println("Both birthdays on the same day!");
        }

        sc.close();
    }
}
