public class BinMum {
    public static void main(String[] args) {
//        System.out.println(getNum(0x000001));
        System.out.println(getNum(3));
        System.out.println(getNum(4));
        System.out.println(getNum2(5));
        System.out.println(getNum2(10));
//
//        System.out.println(0x03 == 3);
//        System.out.println(0x10 == 16);
//        System.out.println(0b111 == 7);
////
//        System.out.println(1 << 3);
//        System.out.println(1 << 4);
//        System.out.println(0x80 >>> 4);
//
//        System.out.println(0x80 | 3);
//        System.out.println(0x80 >>> 4);
//        System.out.println(0x80 >>> 4);

    }

    private static int getNum(int n) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            a = a | 1 << i;
//            a |= 1 <<i;
        }
        return a;
    }

    private static int getNum2(int n) {
        return (1 << n) - 1;
    }
}
