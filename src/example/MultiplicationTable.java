package example;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[] table = new int[10];
        System.out.println("Введите число от 0 до 9");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i < table.length; i++) {
            table[i] = i * number;
            System.out.print(" " + table[i]);
        }
    }
}
