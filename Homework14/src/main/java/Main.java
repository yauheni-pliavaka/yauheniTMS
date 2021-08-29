import java.io.IOException;
import java.util.List;

import static Constants.Constants.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Service service = new Service();
        System.out.println("Задание 1:");
        List<String> task1 = service.palindromeList(service.fileToString(INPUT_FILE_1));
        System.out.println(task1);
        service.listToFile(OUTPUT_FILE_1, task1);
        System.out.println("Задание 2:");
        List<String> task2 = service.sentenceListByParameters(service.removeExtraCharacters(service.fileToString(INPUT_FILE_2)), 3, 5);
        System.out.println(task2);
        service.listToFile(OUTPUT_FILE_2, task2);
        System.out.println("Задание 3:");
        service.censorshipCheck(service.fileToString(SOURCE_TEXT), service.fileToString(CENSORSHIP_CHECK));

    }
}