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

    public static String randomName(Sex sex) {
        int nameIndex = RANDOM.nextInt(5);
        if (sex == Sex.MALE) {
            if (nameIndex == 0) {
                return "Max";
            } else if (nameIndex == 1) {
                return "Alex";
            } else if (nameIndex == 2) {
                return "Mike";
            } else if (nameIndex == 3) {
                return "John";
            } else {
                return "Dean";
            }
        } else {
            if (nameIndex == 0) {
                return "Emma";
            } else if (nameIndex == 1) {
                return "Mia";
            } else if (nameIndex == 2) {
                return "Luna";
            } else if (nameIndex == 3) {
                return "Mila";
            } else {
                return "Clara";
            }
        }
    }
}
