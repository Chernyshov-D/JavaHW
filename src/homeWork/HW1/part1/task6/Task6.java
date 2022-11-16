/*
На вход подается количество километров count. Переведите километры в мили
(1 миля = 1,60934 км) и выведите количество миль.

Ограничения:
0 < count < 1000
*/

package homeWork.HW1.part1.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.60934;
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.println(count / KILOMETERS_PER_MILE);

    }
}
