package example;

import java.util.Scanner;

public class DemoSomething {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Вашу фамилию");
        String surname = scanner.nextLine();
        System.out.println(surname);
        numberReturn(3);

        double x = 32.0;
        if (x % 1 == 0) {
            System.out.println("целое число " + x);
        } else {
            System.out.println("дробное число " + x);
        }

        int p = 1;
        p = p + 1;
        System.out.println(p);
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println("");
        char ch = '9';
        String str = "123";
        int number = Character.getNumericValue(ch);
        System.out.println(number);
        number = Integer.parseInt(str);
        System.out.println(number);
        number = new Integer(str);
        System.out.println(number);

        PrincipalForOverloadingMethods ovl = new PrincipalForOverloadingMethods();
        int resI;
        double resD;

        ovl.ovlDemo();
        ovl.ovlDemo(2);
        resI = ovl.ovlDemo(2, 8);
        System.out.println(resI);
        resD = ovl.ovlDemo(2.2, 3.3);
        System.out.println(resD);

        int i = ch - 0x30;
        System.out.println(i);
        int result = 0;
        for (int j = 0; j < str.length(); j++) {
            char a = str.charAt(j);
            int s = a - 0x30;
            System.out.print(s);

            result += s * Math.pow(10, str.length() - 1 - j);
//            result += s * Math.pow(10,str.length() - (1 + j));


        }
        System.out.println("");
        System.out.println(result);
        System.out.println();

    }

    static void numberReturn(int sc) {
        int[][] numbers = new int[6][6];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число от 1 до 5");
//        int num = sc.nextInt();
        for (int j = 0; j < numbers.length; j++) {
            for (int k = 0; k < numbers.length; k++) {
                if (sc != k) {
                    numbers[j][k] = 1;
                } else {
                    numbers[j][k] = 0;
                }
                System.out.print(numbers[j][k]);
            }
            System.out.println();

        }
    }
}