/*
На вход подается двузначное число n. Выведите число, полученное
перестановкой цифр в исходном числе n. Если после перестановки получается
ведущий 0, его также надо вывести.

Ограничения:
9 < count < 100
*/

package homeWork.HW1.part1.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int firstDigit = count / 10;
        int secondDigit = count % 10;
        System.out.println(secondDigit + "" + firstDigit);
    }
}
