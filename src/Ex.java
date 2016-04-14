import java.util.Random;

/**
 * Created by Алексей on 09.12.2015.
 */
public class Ex {
    public static void main(String[] args) {
        Random rand = new Random();
        long l = rand.nextLong();
        checkLong(5);
    }

    private static void checkLong(long l) {
        System.out.println(l);
//        l |= 1<< Color.GREEN.getIndex();
        l = l | (1<< Color.GREEN.getIndex());
        System.out.println(l);
        l = l & ~(1<< Color.GREEN.getIndex());
        System.out.println(l);
//        for (int i = 0; i < Long.SIZE; i++) {
//
//            System.out.println("bit number i " + i + " " + isBitSet(l, i));
//        }
        for (Color color : Color.values()) {
            System.out.println("color " + color + " " + isBitSet(l, color.getIndex()));
        }
    }

    private static boolean isBitSet(long l, int index) {//проверка выставлен ли бит по номеру позиции
        return (l & (1L << index)) != 0;
    }

    private enum Color {
        RED(0), GREEN(1), BLUE(2);
        private final int index;

        Color(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }
    }
}