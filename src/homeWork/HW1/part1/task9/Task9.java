/*
На вход подается бюджет мероприятия – n тугриков. Бюджет на одного гостя – k
тугриков. Вычислите и выведите, сколько гостей можно пригласить на
мероприятие.

Ограничения:
0 < n < 100000
0 < k < 1000
k < n
*/

package homeWork.HW1.part1.task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int guests = n / k;
        System.out.println(guests);
    }
}
