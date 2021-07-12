public class Homework {
    public static void main(String[] args) {
//        amoeba(1);
//        System.out.println(sum(6, 9));
//        triangles();
//        description(-234358203);
        oddNumbers();
//        System.out.println(maxElement(12));
//        System.out.println(newOddNumbers(20));
//        newMaxElement(new int[]{4,5,0,23,77,0,8,9,101,2});
//        repeatingNumbers();
//        transpose();
    }

    /**
     * 1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
     * сколько амеб будет через 3, 6, 9, 12,..., 24 часа
     */
    public static void amoeba(int count) {
        for (int i = 1; i <= 24; i++) {
            count *= 2;
            i += 2;
            if (i % 3 == 0) {
                System.out.println("Через " + i + " часа(ов) будет " + count + " амеб(ы)");
            }
        }
    }

    /**
     * 2) Напишите реализацию метода sum(int a, int b), вычисляющий a*b, не пользуясь операцией
     * умножения, где a и b целые числа, вызовите метод sum в методе main и распечатайте на консоль.
     */
    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }

    /**
     * 3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
     * <p>
     * a)                  b)
     * *
     * *        * *
     * * *        * * *
     * * * *        * * * *
     * <p>
     * c)                  d)
     * * * *        * * * *
     * * *        * * *
     * *        * *
     * *
     */
    public static void triangles() {
        char[][] array = new char[4][4];
        System.out.println("a)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = '*';
                if (i >= array.length - j - 1) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println("b)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = '*';
                if (i >= j) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println("c)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = '*';
                if (i <= j) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println("d)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = '*';
                if (i <= array.length - j - 1) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }

    /**
     * 4) В переменную записываем число.
     * Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
     * Например, Введите число: 5
     * "5 - это положительное число, количество цифр = 1"
     */
    public static void description(int i) {
        if (i > 0) {
            System.out.print(i + " - positive number, count of digits is ");
        } else {
            System.out.print(i + " - negative number, count of digits is ");
        }
        int count = (i == 0) ? 1 : 0;
        while (i != 0) {
            count++;
            i /= 10;
        }
        System.out.println(count);
    }

    /**
     * 5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
     * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
     */
    public static void oddNumbers() {

    }

    /**
     * 6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
     * Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
     * Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
     */
    public static void maxElement(int i) {
    }

    /**
     * 7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
     * Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
     * Снова выведете массив на экран на отдельной строке.
     */
    public static void newOddNumbers(int i) {
    }

    /**
     * 8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
     */
    public static void newMaxElement(int[] ints) {
    }

    /**
     * 9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
     * Пример: {0,3,46,3,2,1,2}
     * Массив имеет повторяющиеся элементы 3, 2
     * Пример: {0,34,46,31,20,1,28}
     * Массив не имеет повторяющихся элементов
     */
    public static void repeatingNumbers() {
    }

    /**
     * 10) Создаём квадратную матрицу, размер вводим с клавиатуры.
     * Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
     * Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
     * Пример:
     * 1 2 3 4      1 6 3 1
     * 6 7 8 9      2 7 3 5
     * 3 3 4 5      3 8 4 6
     * 1 5 6 7      4 9 5 7
     */
    public static void transpose() {
    }

}


