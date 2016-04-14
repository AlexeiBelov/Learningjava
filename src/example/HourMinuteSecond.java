package example;

import java.util.Scanner;

public class HourMinuteSecond {
    public static void main(String[] args) {
        System.out.println("Введите количество дней");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Это количество часов в " + a + " сутках " + a * 24);
        System.out.println("Это количество минут в " + a + " сутках " + a * 1440);
        System.out.println("Это количество секунд в " + a + " сутках " + a * 86400);
    }
}
