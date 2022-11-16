/*
Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров). На вход
подается количество дюймов, выведите количество сантиметров.

Ограничения:
0 < count < 1000
*/

package homeWork.HW1.part1.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        final double CENTIMETERS_PER_INCH = 2.54;
        Scanner scanner = new Scanner(System.in);
        int centimeters = scanner.nextInt();
        System.out.println(centimeters * CENTIMETERS_PER_INCH);
    }
}
