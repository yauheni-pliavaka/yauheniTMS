import java.io.IOException;
import java.util.ArrayList;

import static Constants.Constants.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Service service = new Service();
        System.out.println("Задание 1:");
        ArrayList<String> task1 = service.palindromeList(service.fileToString(INPUT_FILE_1));
        System.out.println(task1);
        service.arrayListToFile(OUTPUT_FILE_1, task1);
        System.out.println("Задание 2:");
        ArrayList<String> task2 = service.sentenceListByParameters(service.removeExtraCharacters(service.fileToString(INPUT_FILE_2)), 3, 5);
        System.out.println(task2);
        service.arrayListToFile(OUTPUT_FILE_2, task2);
        System.out.println("Задание 3:");

    }
}