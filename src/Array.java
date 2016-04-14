import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Array {
    private static final Random random = new Random();
    private  static Set<Integer> dict = new HashSet<>();

    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = getNextInt();
        }
        String x = Arrays.toString(array);
        System.out.println(x);
    }

    private static int getNextInt() {
        boolean needRegeneration;
        int i1;

        do {
            needRegeneration = false;
            i1 = random.nextInt(10000000);

            if (dict.contains(i1)) {
                needRegeneration = true;
            }
        } while (needRegeneration);
        dict.add(i1);
        return i1;
    }
}
