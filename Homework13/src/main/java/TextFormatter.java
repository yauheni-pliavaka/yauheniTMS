public final class TextFormatter {
    public static int getCountWords(String str) {
        return str.split("[^а-яА-Я]").length;
    }

    public static boolean hasPalindrome(String str) {
        for (String s : str.split("[^а-яА-Я]")) {
            if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
