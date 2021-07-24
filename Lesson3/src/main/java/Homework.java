import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
//      Некоторые тесты для проверки задач. Можно также написать свои тесты.
//        printArray();
//        System.out.println(operation(1));
//        System.out.println(operation(-1));
//        System.out.println(operation(0));
//        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{-1, 2, -3, 4, 5, -6, 7}));
//        countDevs(103);
//        foobar(6);
//        foobar(10);
//        foobar(15);
//        calculateSumOfDiagonalElements();
//        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одномерный массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number of elements: ");
        int num = scanner.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "\t");
        }
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else {
            if (number < 0) {
                number -= 2;
            } else {
                number = 10;
            }
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int anInt : ints) {
            System.out.print(anInt + "\t");
            if (anInt % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        if (count % 100 > 10 & count % 100 < 20) {
            System.out.println(count + " программистов");
        } else if (count % 10 == 1) {
            System.out.println(count + " программист");
        } else if (count % 10 > 1 & count % 10 < 5) {
            System.out.println(count + " программиста");
        } else if (count % 10 > 4 | count % 10 == 0) {
            System.out.println(count + " программистов");
        }
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if (number % 3 == 0 & number % 5 == 0) {
            System.out.println("foobar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        }
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        int a = 5;
        int b = 5;
        //поидее мы могли взять только 1 параметр размера, так как ищем диагональ => матрица квадратная
        int sum1 = 0;
        int sum2 = 0;
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + "\t");
                if (i == j) {
                    sum1 += array[i][j];
                }
                if (i == b - j - 1) {
                    sum2 += array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Сумма элементов на главной диагонали " + sum1);
        System.out.println("Сумма элементов на побочной диагонали " + sum2);
    }


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number of lines: ");
        int lin = scanner.nextInt();
        System.out.print("Input a number of columns: ");
        int col = scanner.nextInt();
        int[][] array = new int[lin][col];
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] % 3 == 0) {
                    array[i][j] = '+';
                } else if (array[i][j] % 7 == 0) {
                    array[i][j] = '-';
                } else {
                    array[i][j] = '*';
                }
                System.out.print((char) array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        int n = 1000;
        int[] array = new int[n];
        for (int i = 2; i < n; i++) {
            array[i] = i;
            for (double j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    array[i] = 0;
                    break;
                }
            }
            if (array[i] != 0) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}