import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Алексей on 02.12.2015.
 */
public class ArrayStrings {
    private static String SYMBOLS = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
       String s = " Bdr Bdr Bdr";
        System.out.println(s.toLowerCase());//убирает верхний регистр
        String[][] arr = new String[16][16];
        for (int i = 0; i < 256; i++) {
            arr[i / 16][i % 16] = generateString();
        }
        System.out.println(Arrays.deepToString(arr));
        String[] arr2 = new String[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = generateString();
        }
        System.out.println(Arrays.deepToString(arr2));//выводит массив
        Arrays.sort(arr2);//сортирует от а до я или по возрастанию
        System.out.println(Arrays.deepToString(arr2));//выводит массив
        Arrays.sort(arr2, Collections.reverseOrder()); // сортирует от я до а
        System.out.println(Arrays.deepToString(arr2));//выводит массив
    }
    private static String generateString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < RANDOM.nextInt(10); i++) {
            int i1 = RANDOM.nextInt(SYMBOLS.length());
            char c = SYMBOLS.charAt(i1);
            sb.append(c);
        }
        return sb.toString();
    }
}
