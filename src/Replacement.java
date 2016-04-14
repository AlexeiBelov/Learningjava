import java.util.Arrays;
import java.util.Random;

public class Replacement {
    public static int[] arrayNumbers = new int[100];
    private static Random random = new Random();
    public static int indexPosition;

    public static void main(String[] args) {
        createArray();
        changePosition();
        System.out.println(Arrays.toString(arrayNumbers));
    }

    public static void createArray() {
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = i;
        }
        System.out.println(Arrays.toString(arrayNumbers));
    }

    public static void changePosition() {
        int x = 0;
        while (x < 1000000) {
            indexPosition = random.nextInt(99);
            int first = arrayNumbers[indexPosition];
            arrayNumbers[indexPosition] = arrayNumbers[indexPosition + 1];
            arrayNumbers[indexPosition + 1] = first;
            x++;
        }
    }
}