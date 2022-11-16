/*
На вход подается количество секунд, прошедших с начала текущего дня – count.
Выведите в консоль текущее время в формате: часы и минуты.

Ограничения:
0 < count < 86400
*/

package homeWork.HW1.part1.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int hour = count / 3600;
        int min = count / 60 % 60;
        System.out.println(hour + " " + min);
    }

}
