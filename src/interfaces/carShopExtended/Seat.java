package interfaces.carShopExtended;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public String toString() {
        // Minimum rental period of 3 days. Price per day 99,900000
        String pattern = "Leon sells for %f";

        return String.format(pattern, this.getPrice());
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
