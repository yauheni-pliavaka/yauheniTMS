import java.util.Arrays;

public class Service {
    public String substring(String str, String firstChar, String lastChar) {
        return str.substring(str.indexOf(firstChar), str.lastIndexOf(lastChar) + 1);
    }

    public String changeLetter(String str, int charPosition) {
        return str.replace(str.charAt(charPosition), str.charAt(0));
    }

    public void isPalindrome(String str) {
        for (String s : str.split(", ")) {
            //добавить все символы кроме букв
            if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) {
                System.out.print(s + "\t");
            }
        }
        System.out.println();
    }

    public void sentenceArray(String str, int minWords, int maxWords) {
        for (String s : str.split("\\.")) {
            s = s.trim();
            if (TextFormatter.hasPalindrome(s)) {
                System.out.print(s + ". ");
            } else if (TextFormatter.wordCount(s.trim()) >= minWords && TextFormatter.wordCount(s) <= maxWords) {
                System.out.print(s +". ");
            }
        }
    }
}
