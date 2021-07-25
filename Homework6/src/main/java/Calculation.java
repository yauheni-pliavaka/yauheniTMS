import java.util.Random;

public class Calculation {
    private static final Random RANDOM = new Random();

    public static Sex randomSex() {
        if (RANDOM.nextBoolean()) {
            return Sex.MALE;
        } else {
            return Sex.FEMALE;
        }
    }

    public static String randomCountry() {
        if (RANDOM.nextBoolean()) {
            return "Belarus";
        } else {
            return "another country";
        }
    }

    public static String randomCity(String country) {
        if (country.equals("Belarus")) {
            int cityIndex = RANDOM.nextInt(10);
            if (cityIndex > 3) {
                return "Minsk";
            } else if (cityIndex == 1) {
                return "Vitebsk";
            } else if (cityIndex == 2) {
                return "Mogilev";
            } else if (cityIndex == 3) {
                return "Grodno";
            } else {
                return "Brest";
            }
        } else {
            return "another city";
        }
    }

    public static int randomAge() {
        return RANDOM.nextInt(16) + 15;
    }
}
