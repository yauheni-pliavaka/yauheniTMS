public final class TextFormatter {
    public static int getCountWords(String str) {
        return str.split(" ").length;
    }

    public static boolean hasPalindrome(String str) {
        for (String s : str.split(" ")) {
            if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
