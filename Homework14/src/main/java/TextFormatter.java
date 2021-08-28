public final class TextFormatter {
    public static int getCountWords(String str) {
        return str.split("[^а-яА-Яa-zA-Z]").length;
    }

    public static boolean hasPalindrome(String str) {
        for (String s : str.split("[^а-яА-Яa-zA-Z]")) {
            if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()) && s.length() > 1) {
                return true;
            }
        }
        return false;
    }
}
