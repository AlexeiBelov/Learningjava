import java.util.Arrays;

/**
 * Created by Алексей on 29.11.2015.
 */
public class Strings {
    public static void main(String[] args) {
//        String s = "скоро новый год";
//        String x = s.toUpperCase();
//        System.out.println(x);
//        System.out.println(s.charAt(3));
//        System.out.println(s.contains("й"));
//        System.out.println(s.equals(x));
//        System.out.println(s.equalsIgnoreCase(x));


        foo();


    }

    private static void foo() {
        String s = "    by XA XA XA  \n  ";
        String x = "XA";
        System.out.println(x.compareTo(s));

        System.out.println(Arrays.toString(s.getBytes()));
        System.out.println(Arrays.toString(x.getBytes()));
        System.out.println(s.endsWith("S"));

        int xaIndex = s.lastIndexOf("XA");
        System.out.println(xaIndex);
        System.out.println(s.substring(xaIndex, xaIndex + 1));
        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println(s.trim());


        if (s == null || s.isEmpty()) {
            return;
        }


    }
}
