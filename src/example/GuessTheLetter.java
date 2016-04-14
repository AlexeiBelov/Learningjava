package example;

import java.io.IOException;
import java.util.Scanner;

public class GuessTheLetter {
    public static void main(String[] args) throws IOException {
        System.out.println("Загадайте букву");
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        boolean bool = true;
        while (bool) {
//      cccc
            System.out.println("Введите букву");
            char letterUser = sc.next().charAt(0);
            System.out.println("Вы ввели букву " + letterUser);

            if (letter == letterUser) {
                System.out.println("Победа!");
                bool = false;

            } else if (letter < letterUser) {
                System.out.println("Загаданная буква стоит перед Вашей");
            } else {
                System.out.println("Загаданная буква стоит после Вашей");

            }
        }
    }
}