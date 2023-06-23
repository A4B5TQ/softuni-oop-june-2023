package workingWithAbstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rhombusSize = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rhombusSize; i++) {
            printRow(i,rhombusSize - i);
        }

        for (int i = rhombusSize - 1; i > 0; i--) {
            printRow(i,rhombusSize - i);
        }
    }

    public static void printRow(int countStars, int countOfSpaces) {

        for (int i = 0; i < countOfSpaces; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < countStars; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}
