import java.util.Scanner;

/**
 * Created by Алексей on 28.11.2015.
 */
public class FooBar {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print("foo");
            }
            if (i % 5 == 0) {
                System.out.print("bar");
            }
            if (i % 3 != 0 && i % 5 != 0){
                System.out.print(i);
            }
            System.out.print(" ");
        }

    }
}
