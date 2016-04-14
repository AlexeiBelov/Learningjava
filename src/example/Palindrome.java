package example;

import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
        int q = 35153;
        String number = Integer.toString(q);
        ArrayList<Character> array = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            array.add(number.charAt(i));
        }
        ArrayList<Character> array2 = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            array2.add(number.charAt(i));
        }
        int length1 = array.size();
        int length = length1 - 1;
        for (Character anArray : array) {
            if (anArray == array2.get(length)) {
                length--;
            } else {
                System.out.println("Это не палиндром " + q);
                return;
            }
        }
        System.out.println("Это палиндром " + q);
    }
}
