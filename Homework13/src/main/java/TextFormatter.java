public abstract class TextFormatter {
    static int wordCount(String str) {
        return str.split(" ").length;
    }

    static boolean hasPalindrome(String str) {
        for (String s : str.split(" ")) {
            if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
