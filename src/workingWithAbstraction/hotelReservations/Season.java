package workingWithAbstraction.hotelReservations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    private static final Map<String, Season> VALUES = new HashMap<>();

    static {
        Arrays.stream(values())
                .forEach(v -> VALUES.putIfAbsent(v.name(),v));
    }

    private int priceFactor;

    Season(int priceFactor) {
        this.priceFactor = priceFactor;
    }

    public int getPriceFactor() {
        return priceFactor;
    }

    public Season getByName(String name) {
        Season season = VALUES.get(name);
        if (season == null) {
            return Spring;
        }

        return season;
    }
}
