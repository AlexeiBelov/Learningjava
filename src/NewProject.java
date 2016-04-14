import java.util.Random;

/**
 * Created by Алексей on 02.12.2015.
 */
public class NewProject {
    private static final String SYMBOLS = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        String s = generateString(40);
        System.out.println(s);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'P') {
                count++;
            }

        }
        System.out.println(count);
    }

    private static String generateString(int stringLength) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringLength; i++) {
            int i1 = RANDOM.nextInt(SYMBOLS.length());
            char c = SYMBOLS.charAt(i1);
            sb.append(c);
        }
        return sb.toString();
    }
}
