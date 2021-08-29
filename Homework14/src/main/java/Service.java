import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Service {
    public List<String> palindromeList(String str) {
        List<String> palindromeList = new ArrayList<>();
        for (String s : str.split("[^А-яA-z]")) {
            if (TextFormatter.hasPalindrome(s)) {
                palindromeList.add(s);
            }
        }
        return palindromeList;
    }

    public List<String> sentenceListByParameters(String str, int minWords, int maxWords) {
        List<String> sentenceList = new ArrayList<>();
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

    public void censorshipCheck(String text, String censorWords) {
        List<String> sentenceList = new ArrayList<>();
        int countSentence = 0;
        boolean haveCensorWord = false;
        for (String sentence : text.split("[.!?]")) {
            sentence = sentence.trim();
            for (String word : sentence.split("[^А-яA-z]")) {
                for (String censorWord : censorWords.split("[^А-яA-z]")) {
                    if (Objects.equals(word, censorWord)) {
                        haveCensorWord = true;
                    }
                }
                if (haveCensorWord) {
                    countSentence++;
                    sentenceList.add(sentence);
                    haveCensorWord = false;
                    break;
                }
            }
        }
        if (sentenceList.size() > 0) {
            System.out.println("Текст не прошел проверку на цензуру. Количество предложений не прошедших проверку: " + countSentence + "\nНеобходимо исправить предложения:\n" + sentenceList);
        } else {
            System.out.println("Текст прошел проверку на цензуру.");
        }
    }


    public String fileToString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public void listToFile(String fileName, List<String> text) throws IOException {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(text.toString());
        }
    }

    public String removeExtraCharacters(String str) {
        return str.replaceAll("[^А-яA-z.!? ]", "");
    }
}
