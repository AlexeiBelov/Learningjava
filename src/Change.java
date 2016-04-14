/**
 * Created by Алексей on 29.11.2015.
 */
public class Change {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        System.out.println("x = " + x + ",  y = " + y);
        y = x + y;
        x = y - x;
        y = y - x;


        System.out.println("x = " + x + ",  y = " + y);

    }

}
