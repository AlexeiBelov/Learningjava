package example;

import java.util.concurrent.ThreadLocalRandom;

public class Arrays {
    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = ThreadLocalRandom.current().nextInt(10);
                System.out.print(" ");
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        for (int[] anArr : arr) {
            for (int j = 0; j < arr.length; j++) {
                arr2[j] = anArr[j];
                System.out.print(" " + arr2[j]);
            }
        }
    }
}
