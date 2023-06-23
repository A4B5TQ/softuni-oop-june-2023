package workingWithAbstraction.hotelReservations;

public enum DiscountType {

    VIP(0.8),SecondVisit(0.9), None(1);

    private double discountFactor;

    DiscountType(double discountFactor) {
        this.discountFactor = discountFactor;
    }

    public double getDiscountFactor() {
        return discountFactor;
    }
}
