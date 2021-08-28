import lombok.ToString;

import java.util.ArrayList;

@ToString
public class Service {
    public String substringByParameters(String str, String firstChar, String lastChar) {
        return str.substring(str.indexOf(firstChar), str.lastIndexOf(lastChar) + 1);
    }

    public String changeLetter(String str, int charPositionTo, int charPositionFrom) {
        return str.replace(str.charAt(charPositionTo), str.charAt(charPositionFrom));
    }


    public ArrayList<String> palindromeList(String str) {
        ArrayList<String> palindromeList = new ArrayList<>();
        for (String s : str.split("[^а-яА-Я]")) {
            if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()) && !s.equals("")) {
                palindromeList.add(s);
            }
        }
        return palindromeList;
    }

    public void sentenceArray(String str, int minWords, int maxWords) {
        for (String s : str.split("\\.")) {
            s = s.trim();
            int countWords = TextFormatter.getCountWords(s);
            if (TextFormatter.hasPalindrome(s)) {
                System.out.print(s + ". ");
            } else if (countWords >= minWords && countWords <= maxWords) {
                System.out.print(s +". ");
            }
        }
    }
}
