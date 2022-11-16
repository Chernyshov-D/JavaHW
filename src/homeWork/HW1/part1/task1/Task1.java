/*
Вычислите и выведите на экран объем шара, получив его радиус r с консоли.
Подсказка: считать по формуле V = 4/3 * pi * r^3. Значение числа pi взять из
Math.

Ограничения:
0 < r < 100
*/

package homeWork.HW1.part1.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        double v = (4 * Math.PI * Math.pow(r, 3)) / 3;
        System.out.println(v);
    }
}
