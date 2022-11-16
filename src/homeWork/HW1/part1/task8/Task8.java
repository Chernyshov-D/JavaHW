/*
На вход подается баланс счета в банке – n. Рассчитайте дневной бюджет на 30
дней.

Ограничения:
0 < count < 100000
*/

package homeWork.HW1.part1.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        System.out.println(n / 30);
    }

}
