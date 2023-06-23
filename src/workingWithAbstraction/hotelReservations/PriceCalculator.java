package workingWithAbstraction.hotelReservations;

public class PriceCalculator {

    private double pricePerDay;
    private int days;

    private Season season;

    private DiscountType discountType;

    public static String name;

    public PriceCalculator(double pricePerDay, int days, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculate() {
        return this.pricePerDay *
                this.days *
                this.season.getPriceFactor() *
                this.discountType.getDiscountFactor();
    }
}
