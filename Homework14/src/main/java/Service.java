import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Service {
    public ArrayList<String> palindromeList(String str) {
        ArrayList<String> palindromeList = new ArrayList<>();
        for (String s : str.split("[^а-яА-Яa-zA-Z]")) {
            if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()) && !s.equals("")) {
                palindromeList.add(s);
            }
        }
        return palindromeList;
    }

    public ArrayList<String> sentenceListByParameters(String str, int minWords, int maxWords) {
        ArrayList<String> sentenceList = new ArrayList<>();
        for (String s : str.split("[.!?]")) {
            s = s.trim();
            int countWords = TextFormatter.getCountWords(s);
            if (TextFormatter.hasPalindrome(s)) {
                sentenceList.add(s);
            } else if (countWords >= minWords && countWords <= maxWords) {
                sentenceList.add(s);
            }
        }
        return sentenceList;
    }

    public String fileToString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public void arrayListToFile(String fileName, ArrayList<String> text) throws IOException {
        try (FileWriter writer = new FileWriter(fileName, false))
        {
            writer.write(text.toString());
        }
    }

    public String removeExtraCharacters(String str) {
        return str.replaceAll("[^а-яА-Яa-zA-Z.!? ]", "");
    }
}

