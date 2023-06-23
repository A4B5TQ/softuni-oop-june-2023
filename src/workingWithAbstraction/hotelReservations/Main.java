package workingWithAbstraction.hotelReservations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Season.Spring);

        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        double price = Double.parseDouble(tokens[0]);
        int days = Integer.parseInt(tokens[1]);
        Season season = Season.valueOf(tokens[2]);
        DiscountType discountType = DiscountType.valueOf(tokens[3]);

        PriceCalculator priceCalculator = new PriceCalculator(price,days,season,discountType);

        double calculate = priceCalculator.calculate();
        System.out.printf("%.2f%n",calculate);
    }
}
