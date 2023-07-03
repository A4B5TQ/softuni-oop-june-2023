package interfaces.carShopExtended;

public class Main {

    private static final String CAR_DEFAULT_PATTERN =
            "%s is %s color and have %s horse power";

    public static void main(String[] args) {
        Sellable seat = new Seat("Leon", "Gray", 110, "Spain", 11111.1);
        Rentable audi = new Audi("A4", "Gray", 110, "Germany", 3, 99.9);

        System.out.println(seat.toString());

//        printCarInfo(seat);
//        printCarInfo(audi);
//        printToSystemOut(String.format(
//                CAR_DEFAULT_PATTERN,
//                seat.getModel(),
//                seat.getColor(),
//                seat.getHorsePower()));
//        printToSystemOut(seat.toString());
    }

    static void printToSystemOut(String data) {
        System.out.println(data);
    }

    private static void printCarInfo(Car car) {
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                car.getModel(),
                car.getColor(),
                car.getHorsePower()));
        System.out.println(car.toString());

    }
}
