package interfaces.carShop;

public class Main {

    private static final String CAR_DEFAULT_PATTERN =
            "%s is %s color and have %s horse power";

    public static void main(String[] args) {
        Car seat = new Seat("Leon",
                "gray",
                110,
                "Spain");

        printToSystemOut(String.format(
                CAR_DEFAULT_PATTERN,
                seat.getModel(),
                seat.getColor(),
                seat.getHorsePower()));
        printToSystemOut(seat.toString());
    }

    static void printToSystemOut(String data) {
        System.out.println(data);
    }

}
