public final class TextFormatter {
    public static int getCountWords(String str) {
        return str.split("[^А-яA-z]").length;
    }

    public static boolean hasPalindrome(String str) {
        for (String s : str.split("[^А-яA-z]")) {
            if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()) && s.length() > 1) {
                return true;
            }
        }
        return false;
    }
}