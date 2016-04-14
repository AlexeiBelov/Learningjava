import java.util.HashSet;
import java.util.Set;

/**
 * Created by Алексей on 09.12.2015.
 */
public class Enums {
    public static void main(String[] args) {
//        EnumSet<Color> colors = EnumSet.noneOf(Color.class);
        Set<Color> colors = new HashSet<>();
        colors.add(Color.RED);
        System.out.println(colors.contains(Color.GREEN));
    }
    private enum Color{
        RED(0), GREEN(1), BLUE(2);
        private final int index;

        Color(int index) {
            this.index = index;
        }
    }
}
