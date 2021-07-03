import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        for (String arg : args) {
            if (num >= 0) {
                count++;
            }
        }
        System.out.println("Count of Positive numbers: " + count);
    }
}