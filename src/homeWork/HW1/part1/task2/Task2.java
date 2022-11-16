/*
На вход подается два целых числа a и b. Вычислите и выведите среднее
квадратическое a и b.
Подсказка:
Среднее квадратическое: https://en.wikipedia.org/wiki/Root_mean_square
Для вычисления квадратного корня воспользуйтесь функцией Math.sqrt(x)

Ограничения:
0 < a, b < 100
*/

package homeWork.HW1.part1.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double rms = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2);
        System.out.println(rms);
    }
}
